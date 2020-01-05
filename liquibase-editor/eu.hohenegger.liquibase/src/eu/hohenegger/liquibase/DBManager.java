package eu.hohenegger.liquibase;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Server;

public class DBManager {
	private Server tcpServer;
	private Optional<Server> webServer = Optional.empty();

	public URL startDB(String dbPort, String consolePort) throws Exception {
		tcpServer = Server.createTcpServer("-tcpPort", dbPort);
		webServer = Optional.of(Server.createWebServer("-webPort", consolePort));
		tcpServer.start();
		webServer.get().start();
		return new URL(webServer.get().getURL());
	}

	public void stopDB(String dbPort) throws SQLException {
		Server.shutdownTcpServer("tcp://localhost:" + dbPort, "", true, true);
		webServer.ifPresent(Server::stop);
	}

	public static Connection createConnection(String jdbcUrl, String user) throws SQLException {
		JdbcDataSource dataSource = new JdbcDataSource();
		dataSource.setURL(jdbcUrl);
		dataSource.setUser(user);
		Connection connection = dataSource.getConnection();
		return connection;
	}
}

package eu.hohenegger.liquibase.ui.handler;

public interface Constants {
	public static final String PLUGIN_ID = "eu.hohenegger.liquibase.ui";
	public static final String H2_PAGE_ID = "eu.hohenegger.liquibase.ui.h2Page";
	public static final String JDBC_URL_PREF_KEY = "jdbcUrl";
	public static final String DB_USER_PREF_KEY = "dbUser";
	public static final String USE_EMBEDDED_H2_PREF_KEY = "useEmbedded";
	public static final String START_H2_CONSOLE_PREF_KEY = "startH2Console";
	public static final String H2_CONSOLE_PORT_PREF_KEY = "H2_CONSOLE_PORT";
	public static final String H2_TCP_PORT_PREF_KEY = "H2_TCP_PORT";
	
	public static final String DEFAULT_JDBC_URL = "jdbc:h2:mem:test";
}

package eu.hohenegger.liquibase.ui.handler;

import org.eclipse.core.commands.AbstractHandler;

import eu.hohenegger.liquibase.DBManager;

public abstract class AbstractH2Handler extends AbstractHandler {
	
	protected static DBManager dbManager = new DBManager();

	protected static BrowserUtil browserUtil = new BrowserUtil();

}

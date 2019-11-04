package com._11singleton;

public class Logger {

	private static Logger logger; //Static method allows 
	
	private Logger() {
		
	} //Constructor


public static Logger getInstance() { //Static method allows to call this method without creating an object
	
	if (logger==null ) {
		logger = new Logger(); //if object is not created, create a new one
	}
	
	return logger;
}

}
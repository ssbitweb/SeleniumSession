package com.Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	
	private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());
	
	public static void main(String[] args) {
		log.debug("Debug message Loggged");
		log.error("error message Loggged");
		log.fatal("fatal message Loggged");
		
	}

}

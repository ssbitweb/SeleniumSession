package com.TestNG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemoinTestNG {
	private static final Logger log = LogManager.getLogger(LoggingDemoinTestNG.class.getName());

	public static void main(String[] args) {
		log.debug("Debug message Loggged");
		log.error("error message Loggged");
		log.fatal("fatal message Loggged");
		log.trace("trace message Loggged");
		log.info("info message Loggged");
	}

}

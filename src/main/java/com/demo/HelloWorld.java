package com.demo;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class HelloWorld {
    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		String hello = "Hello, World!";  
		System.out.println("console: "+ hello);
        logger.trace("TRACE: " + hello);
        logger.debug("DEBUG: " + hello);
        logger.info("INFO: " + hello);
        logger.warn("WARN: " + hello);
        logger.error("ERROR: " + hello);
        logger.fatal("FATAL: " + hello);
    }
}
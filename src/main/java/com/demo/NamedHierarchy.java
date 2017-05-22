package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NamedHierarchy {
	private static final Logger logger = LogManager
			.getLogger(NamedHierarchy.class);
	private static final Logger logger2 = LogManager
			.getLogger("w3c");
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			logger2.debug("debug = 来是com 去是go");
			logger2.info("info =来是com 去是go");
			logger2.error("error =来是com 去是go");
			String nh = "Named Hierarchy";
			logger.getLevel();
			logger.trace("TRACE: " + nh + " " + logger.getLevel());
			NamedHierarchy n = new NamedHierarchy();
			n.run();
			logger.error("ERROR: " + nh + " " + logger.getLevel());
		}
		

	}

	public void run() {
		String nh = "NamedHierarchy.run";
		logger.debug("DEBUG: " + nh + " " + logger.getLevel());
	}
}
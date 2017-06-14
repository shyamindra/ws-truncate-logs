package com.sid.ws.util;

import org.apache.log4j.Logger;

public class LogUtil {
	
	public static void log(@SuppressWarnings("rawtypes") Class clazz, String logMessage) {
		Logger logger = Logger.getLogger(clazz);
		if(logger.isDebugEnabled()) {
			logger.debug(logMessage);
		}
	}
}

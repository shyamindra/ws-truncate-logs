package com.sid.ws.util;

import org.apache.commons.lang3.StringUtils;

public class TruncateUtil {
	
	public static String truncate(String logMessage, int length){
		String truncateAppendString = PropertyLoader.getTruncateAppendString() != null 
				? PropertyLoader.getTruncateAppendString() : " ... (truncated) ...";
		return StringUtils.abbreviateMiddle(logMessage, truncateAppendString, length);
	}

}

package com.sid.ws.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class PropertyLoader {
	
	@Value("${random.string.length}")
	private static String randomStringLength;
	
	@Value("${truncate.string.length}")
	private static String truncateStringLength;
	
	@Value("${truncate.append.string}")
	private static String truncateAppendString;
	
	public static String getRandomStringLength(){
		return randomStringLength;
	}
	
	public static String getTruncateStringLength(){
		return truncateStringLength;
	}
	
	public static String getTruncateAppendString(){
		return truncateAppendString;
	}

}

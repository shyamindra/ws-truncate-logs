package com.sid.ws.impl;

import com.sid.ws.controllers.SubscriptionController;
import com.sid.ws.util.LogUtil;
import com.sid.ws.util.OrderDetailsGenerator;
import com.sid.ws.util.PropertyLoader;
import com.sid.ws.util.TruncateUtil;

public class SubscriptionImpl implements ISubscriptionImpl {
	
	/* (non-Javadoc)
	 * @see com.sid.ws.impl.ISubscriptionImpl#subscribe()
	 */
	@Override
	public String subscribe(){
		String randomStringLength = PropertyLoader.getRandomStringLength();
		String orderDetails = getOrderDetails(randomStringLength != null ? Integer.parseInt(randomStringLength) : 50);
		String truncateLength = PropertyLoader.getTruncateStringLength();
		String truncatedOrderDetails = truncate(orderDetails, truncateLength != null ? Integer.parseInt(truncateLength) : 25);
		log(truncatedOrderDetails);
		return truncatedOrderDetails;
	} 
	
	private String truncate(String orderDetails, int length){
		return TruncateUtil.truncate(orderDetails, length);
	}
	
	private String getOrderDetails(int length){
		return OrderDetailsGenerator.randomStringGenerator(length);
	}
	
	private void log(String logMessage){
		LogUtil.log(SubscriptionController.class, logMessage);
	}

}

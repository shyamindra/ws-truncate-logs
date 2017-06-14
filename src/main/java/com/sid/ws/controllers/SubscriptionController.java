package com.sid.ws.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.ws.impl.ISubscriptionImpl;
import com.sid.ws.impl.SubscriptionImpl;

@RestController
@RequestMapping("/")
public class SubscriptionController {

	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	public String subscribe(){
		ISubscriptionImpl impl = new SubscriptionImpl();
		return impl.subscribe();
	}
}

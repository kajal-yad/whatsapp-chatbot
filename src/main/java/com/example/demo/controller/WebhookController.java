package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MessageRequest;
import com.example.demo.model.MessageResponse;

@RestController
public class WebhookController {
	@PostMapping("/webhook")
	public MessageResponse receiveMessage(@RequestBody MessageRequest request) {
		String userMessage = request.getMessage();
		
		//Logging incoming message
		System.out.println("Receive message: "+userMessage);
		
		String reply;
		
		if(userMessage.equalsIgnoreCase("Hi")){
			reply ="Hello";
		}else if(userMessage.equalsIgnoreCase("Bye")) {
			reply="GoodBye";
		}else {
			reply = "Sorry, I didn't understand.";
		}
		return new MessageResponse(reply);
	}
}

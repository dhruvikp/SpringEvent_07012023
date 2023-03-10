package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.publisher.SweetEventPublisher;

@Controller
public class SweetEventController {

	@Autowired
	SweetEventPublisher publisher;
	
	@GetMapping("/buy/car")
	public String buysCar() {
		publisher.publish();
		return "sweet-event-published";
	}
	
}

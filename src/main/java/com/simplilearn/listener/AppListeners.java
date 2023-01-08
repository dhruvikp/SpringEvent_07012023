package com.simplilearn.listener;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.events.SweetEvent;

@Component
public class AppListeners {

	@EventListener
	public void onApplicationStarted(ContextStartedEvent cse) {
		System.out.println("Context started event published..");
	}
	
	@EventListener
	public void onApplicationStopped(ContextStoppedEvent cse) {
		System.out.println("Context stopped event published..");
	}
	
	@EventListener
	public void onSweetEventPublished1(SweetEvent cse) {
		System.out.println("Dhruvik receied sweet");
	}
	
	@EventListener
	public void onSweetEventPublished2(SweetEvent cse) {
		System.out.println("Raj receied sweet");
	}
}

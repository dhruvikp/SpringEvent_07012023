package com.simplilearn.events;

import org.springframework.context.ApplicationEvent;

public class SweetEvent extends ApplicationEvent {
	public SweetEvent(Object source) {
		super(source);
	}
}
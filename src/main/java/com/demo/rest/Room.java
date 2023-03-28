package com.demo.rest;

public enum Room 
{
	TRAINING_ROOM(30,"Training"),PANTRY(10,"Eating"),CONFERENCE_ROOM(10,"Meeting"),MANAGER_ROOM(2,"WorkStatus");

	int chairs;
	String actions;
	Room(int chairs, String actions) 
	{
		this.chairs = chairs;
		this.actions = actions;
	}
	
	
 
}

	
	

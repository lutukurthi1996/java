package com.demo.rest;

import javax.ws.rs.Path;

public interface Checking {

	default String display() {
		return "display";
	}
}

package com.practice;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/van")
public class Example {
	
	@GET
	@Path("/E/{q}")
	@Produces(MediaType.TEXT_PLAIN)
	public String  Vowel(@PathParam("q") String i)
	{
		return i.replaceAll("a", "A").replaceAll("e","E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
	}
	

}

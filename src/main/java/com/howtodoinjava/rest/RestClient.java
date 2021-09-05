package com.howtodoinjava.rest;

import org.springframework.web.client.RestTemplate;

public class RestClient {
	
	public static void main(String[] args){
		final String uri = "http://localhost:8080/employees/";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}

}

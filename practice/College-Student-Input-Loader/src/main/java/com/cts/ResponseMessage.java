package com.cts;

import lombok.Data;

@Data
public class ResponseMessage {
	
	private int statusCode;
	private String description; 	
}

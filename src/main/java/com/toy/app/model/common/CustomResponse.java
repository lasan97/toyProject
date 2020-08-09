package com.toy.app.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomResponse {
	
	private String status;
	private String msg;
	private String detail;
	
}

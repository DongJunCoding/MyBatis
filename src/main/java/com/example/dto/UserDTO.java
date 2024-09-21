package com.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

	private int seq;
	private String name;
	private String age;
	private String sex;
	private String address;
		
}

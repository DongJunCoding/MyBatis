package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.UserDTO;
import com.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user")
	public ModelAndView userList() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		ArrayList<UserDTO> userList = userService.selectUserList();
		
		mv.addObject("userList", userList);
		mv.setViewName("userList");
		return mv;
	}
}

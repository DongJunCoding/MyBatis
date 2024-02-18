package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDTO;
import com.example.mapper.UserListMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserListMapper userListMapper;
	
	@Override
	public ArrayList<UserDTO> selectUserList() throws Exception {		
		return userListMapper.selectUserList();
	}

}

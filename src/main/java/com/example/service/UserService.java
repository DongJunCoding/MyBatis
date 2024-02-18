package com.example.service;

import java.util.ArrayList;

import com.example.dto.UserDTO;

public interface UserService {

	ArrayList<UserDTO> selectUserList() throws Exception;
}

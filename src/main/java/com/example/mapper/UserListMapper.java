package com.example.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.UserDTO;

@Mapper
public interface UserListMapper {

	ArrayList<UserDTO> selectUserList() throws Exception;
}

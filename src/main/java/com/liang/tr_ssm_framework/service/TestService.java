package com.liang.tr_ssm_framework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liang.tr_ssm_framework.mapper.UserInfoMapper;
import com.liang.tr_ssm_framework.pojo.User;

@Service
public class TestService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void test(){
		System.out.println(userInfoMapper.selectAll().get(0).getUsername());
		System.out.println("testService");
	}
	
	public List<User> getAllUser(){
		
		return userInfoMapper.selectAll();
	}
}

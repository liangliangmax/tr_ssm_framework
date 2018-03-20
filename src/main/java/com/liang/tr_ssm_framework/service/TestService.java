package com.liang.tr_ssm_framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liang.tr_ssm_framework.mapper.UserInfoMapper;

@Service
public class TestService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void test(){
		System.out.println(userInfoMapper.selectAll().get(0).getUsername());
		System.out.println("testService");
	}
}

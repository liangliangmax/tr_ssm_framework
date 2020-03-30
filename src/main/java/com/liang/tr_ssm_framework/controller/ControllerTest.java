package com.liang.tr_ssm_framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import com.liang.tr_ssm_framework.pojo.User;

import com.liang.tr_ssm_framework.service.TestService;

@Controller
public class ControllerTest {
	
	@Autowired
	private TestService testService;

	@RequestMapping("/hello")
	public String test(){
		testService.test();
		System.out.println("mvc");
		return "ok";
	}
	
	@RequestMapping("/hello2")
	@ResponseBody
	public List<User> hello() {
		
		return testService.getAllUser();
		
	}
}

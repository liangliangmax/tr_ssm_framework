package com.liang.tr_ssm_framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

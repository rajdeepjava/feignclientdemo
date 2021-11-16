package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.FeignServiceUtil;



@RestController
@RequestMapping("/student")
public class FeignDemoController {
	
	@Autowired
	FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/name")
	public String getName() {
		return feignServiceUtil.getName();
	}
	
	@GetMapping("/address")
	public String getAddress() {
		return feignServiceUtil.getAddress();
	}
	@GetMapping("/status")
	public String getStatus() {
		return feignServiceUtil.getStatus();
	}

}

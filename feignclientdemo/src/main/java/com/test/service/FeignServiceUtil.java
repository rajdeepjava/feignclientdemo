package com.test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignclientdemo",url="http://localhost:8070/student/")
public interface FeignServiceUtil {
	
	@GetMapping("/name")
	public String getName();
	@GetMapping("/address")
	public String getAddress();
	@GetMapping("/status")
	public String getStatus();
	
//
}

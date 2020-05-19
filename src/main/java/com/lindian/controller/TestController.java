package com.lindian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lindian.common.CommonResult;
import com.lindian.domain.Production;

import com.lindian.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("getAllProduction")
	@ResponseBody
	public CommonResult<List<Production>> getAllProduction(){
		List<Production> allProduction = testService.getAllProduction();
		return CommonResult.success(allProduction);
	}
	
}

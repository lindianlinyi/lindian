package com.lindian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lindian.dao.TestDao;
import com.lindian.domain.Production;
import com.lindian.service.TestService;


@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestDao testDao;

	public List<Production> getAllProduction() {
		
		
		return testDao.getAllProduction();
	}

}

package com.shekhargulati.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shekhargulati.app.entity.Dependency;
import com.shekhargulati.app.service.DependencyService;

@Controller
public class HomeController {
	
	@Autowired
	private DependencyService dependencyService;
	
	public List<Dependency> findAllDependency() {
		return dependencyService.getAllDependancy();
	}

}

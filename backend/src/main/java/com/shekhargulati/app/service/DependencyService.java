package com.shekhargulati.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shekhargulati.app.entity.Dependency;
import com.shekhargulati.app.repository.DependencyRepository;

@Service
public class DependencyService {

	@Autowired
	private DependencyRepository dependencyRepository;
	
	public List<Dependency> getAllDependancy() {
		return dependencyRepository.findAll();
	}
}

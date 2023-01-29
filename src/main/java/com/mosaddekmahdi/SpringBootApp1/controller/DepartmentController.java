package com.mosaddekmahdi.SpringBootApp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mosaddekmahdi.SpringBootApp1.entity.Department;
import com.mosaddekmahdi.SpringBootApp1.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	public Department saveDepartment(@RequestBody Department department) {
		return Department.saveDepartment(department);

	}
}

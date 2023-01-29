package com.mosaddekmahdi.SpringBootApp1.service;

import org.springframework.stereotype.Service;

import com.mosaddekmahdi.SpringBootApp1.entity.Department;
import com.mosaddekmahdi.SpringBootApp1.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

}

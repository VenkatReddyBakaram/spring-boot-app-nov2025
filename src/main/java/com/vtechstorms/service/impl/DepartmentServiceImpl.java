package com.vtechstorms.service.impl;

import com.vtechstorms.entities.Department;
import com.vtechstorms.repository.DepartmentRepository;
import com.vtechstorms.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}

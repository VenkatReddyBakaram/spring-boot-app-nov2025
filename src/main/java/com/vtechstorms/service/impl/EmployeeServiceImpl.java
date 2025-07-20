package com.vtechstorms.service.impl;

import com.vtechstorms.entities.Employee;
import com.vtechstorms.repository.EmployeeRepository;
import com.vtechstorms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

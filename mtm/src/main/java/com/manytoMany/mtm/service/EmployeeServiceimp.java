package com.manytoMany.mtm.service;

import com.manytoMany.mtm.entitys.Employee;
import com.manytoMany.mtm.entitys.Project;
import com.manytoMany.mtm.repo.EmployeeRepo;
import com.manytoMany.mtm.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceimp implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }
}

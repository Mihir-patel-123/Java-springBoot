package com.manytoMany.mtm.service;

import com.manytoMany.mtm.entitys.Employee;
import com.manytoMany.mtm.entitys.Project;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployee();
}

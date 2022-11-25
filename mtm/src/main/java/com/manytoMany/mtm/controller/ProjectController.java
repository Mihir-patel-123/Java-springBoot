package com.manytoMany.mtm.controller;

import com.manytoMany.mtm.entitys.Employee;
import com.manytoMany.mtm.entitys.Project;
import com.manytoMany.mtm.service.EmployeeService;
import com.manytoMany.mtm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addproject")
    public Project addProjects(@RequestBody Project project)
    {
     Project project1=  projectService.addProject(project);
        return project1;
    }

    @GetMapping("/project/{project}/{id}")
    public List<Project> getProject(@PathVariable String project ,@PathVariable int id){
        return projectService.getProject(project,id);
    }
    @GetMapping("/project/{project}")
    public List<Project> getProject(@PathVariable String project){
        return projectService.getProject(project);
    }

    @GetMapping("/findByName/{name}")
    public List<Project> findById(@PathVariable String name)
    {
        return projectService.findById(name);
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }
}
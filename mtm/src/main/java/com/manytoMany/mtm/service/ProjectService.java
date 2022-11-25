package com.manytoMany.mtm.service;

import com.manytoMany.mtm.entitys.Project;

import java.util.List;

public interface ProjectService {

    Project addProject(Project project);

    List<Project> getProject(String project,int id);

    List<Project> getProject(String project);

    List<Project> findById(String name);
}

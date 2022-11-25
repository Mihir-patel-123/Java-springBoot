package com.manytoMany.mtm.service;

import com.manytoMany.mtm.entitys.Project;
import com.manytoMany.mtm.repo.ProjectRepo;
import com.manytoMany.mtm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceimp implements ProjectService {

    @Autowired
    private ProjectRepo projectRepo;
    @Override
    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public List<Project> getProject(String project,int id) {
        return projectRepo.getlist(project,id);
    }

    @Override
    public List<Project> getProject(String project) {
        return projectRepo.getlistbyName(project);
    }

    @Override
    public List<Project> findById(String name) {
        return projectRepo.findByProjectNameStartingWith(name);
    }
}

package com.manytoMany.mtm.repo;

import com.manytoMany.mtm.entitys.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepo extends JpaRepository<Project ,Long> {

    @Query(value = "SELECT * From project Where language=:project and id=:idnum",nativeQuery = true)
    List<Project> getlist(@Param("project") String project,@Param("idnum") int id);

    @Query(value = "SELECT * From project Where language like %:name%",nativeQuery = true)
    List<Project> getlistbyName(@Param("name") String project);

    List<Project> findByProjectNameStartingWith(String name);

}

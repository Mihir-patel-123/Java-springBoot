package com.manytoMany.mtm.entitys;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String projectName;
    private String language;

    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(name = "employee_project",
    joinColumns = {
            @JoinColumn(name = "project_id",referencedColumnName = "id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "employee_id",referencedColumnName = "id")
    }
    )
    private List<Employee> employees;
}

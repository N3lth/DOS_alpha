package com.mag.teacher.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nelth on 2017-04-17.
 */
@Entity
@Table(name = "lesson")
public class Lesson {
    private Long id;
    private String name;
    private Set<Teacher> assignedTeachers;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Teacher> getAssignedTeachers() {
        return assignedTeachers;
    }

    public void setAssignedTeachers(Set<Teacher> assignedTeachers) {
        this.assignedTeachers = assignedTeachers;
    }

    public void addTeacher(Teacher teacher){
        this.assignedTeachers.add(teacher);
    }
}

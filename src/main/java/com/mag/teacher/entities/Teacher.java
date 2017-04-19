package com.mag.teacher.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nelth on 2017-04-17.
 */

@Entity
@Table(name = "teacher")
public class Teacher {

    private Long id;
    private String name;
    private String surname;
    private Set<Lesson> assignedLessons;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //TODO: Tu skonczylem, polacz tebele.
    @ManyToMany
    @JoinTable()
    public Set<Lesson> getAssignedLessons() {
        return assignedLessons;
    }

    public void setAssignedLessons(Set<Lesson> assignedLessons) {
        this.assignedLessons = assignedLessons;
    }
}

package com.mag.student.entities;

import com.mag.teacher.entities.Lesson;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nelth on 2017-04-17.
 */
@Entity
@Table(name = "student")
public class Student {
    private Long id;
    private String name;
    private String surname;
    private String indexNumber;
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

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Set<Lesson> getAssignedLessons() {
        return assignedLessons;
    }

    public void setAssignedLessons(Set<Lesson> assignedLessons) {
        this.assignedLessons = assignedLessons;
    }
}

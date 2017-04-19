package com.mag.student.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nelth on 2017-04-17.
 */

@Entity
@Table(name = "group")
public class Group {
    private Long id;
    private int internalGroupNumber;
    private Set<Student> students;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInternalGroupNumber() {
        return internalGroupNumber;
    }

    public void setInternalGroupNumber(int internalGroupNumber) {
        this.internalGroupNumber = internalGroupNumber;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}

package com.mag.teacher.entities;

import com.mag.student.entities.Group;
import com.mag.student.entities.Student;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

/**
 * Created by Nelth on 2017-04-17.
 */

@Entity
@Table(name = "attendance_list")
public class AttendanceList {
    private Long id;
    private Lesson lesson;
    private String subject;
    private Teacher teacher;
    private Group group;
    private Map<Student, Boolean> attendanceList;
    private String timeOfLesson;
    private Date date;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Map<Student, Boolean> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(Map<Student, Boolean> attendanceList) {
        this.attendanceList = attendanceList;
    }

    public String getTimeOfLesson() {
        return timeOfLesson;
    }

    public void setTimeOfLesson(String timeOfLesson) {
        this.timeOfLesson = timeOfLesson;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

package com.mag.teacher.service;

import com.mag.teacher.entities.AttendanceList;
import com.mag.teacher.entities.Lesson;
import com.mag.teacher.repository.AttendanceListRepository;
import com.mag.teacher.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Created by Nelth on 2017-04-17.
 */

public class TeacherServiceImpl implements TeacherService{

    @Autowired
    LessonRepository lessonRepository;
    @Autowired
    AttendanceListRepository attendanceListRepository;

    // Lesson
    public Lesson createLesson(Lesson in) {
        Lesson out = new Lesson();
        out.setName(in.getName());
//        out.addTeacher();
        return out;
    }

    public Set<Lesson> findAllLessons() {
        return null;
    }

    public Lesson findOneLesson(String name) {
        return null;
    }

    public Lesson updateLesson(Lesson lesson) {
        return null;
    }

    public void deleteLesson(int id) {

    }


    //Attendance List
    public void saveAttendanceList(AttendanceList attendanceList) {
        attendanceListRepository.save(attendanceList);
    }

}

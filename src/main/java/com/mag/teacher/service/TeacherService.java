package com.mag.teacher.service;

import com.mag.teacher.entities.AttendanceList;
import com.mag.teacher.entities.Lesson;

import java.util.Set;


/**
 * Created by Nelth on 2017-04-17.
 */
public interface TeacherService {
    // Lesson
    Lesson createLesson(Lesson lesson);
    Set<Lesson> findAllLessons();
    Lesson findOneLesson(String name);
    Lesson updateLesson (Lesson lesson);
    void deleteLesson(int id);


    // AttendnaceList
    void saveAttendanceList(AttendanceList attendanceList);
}

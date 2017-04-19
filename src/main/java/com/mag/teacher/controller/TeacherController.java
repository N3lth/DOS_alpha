package com.mag.teacher.controller;

import javax.servlet.http.HttpServletRequest;

import com.mag.teacher.entities.AttendanceList;
import com.mag.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by Nelth on 2017-04-17.
 */

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/manage", method = RequestMethod.GET)
    public String manage(HttpServletRequest request){
        request.setAttribute("mode", "MODE_HOME");
        return "manage";
    }

    @RequestMapping(value = "/manage/check-attendnace", method = RequestMethod.GET)
    public String checkAttendance(HttpServletRequest request){
        request.setAttribute("mode", "MODE_CHECK_ATTENDANCE");
        // TODO: tu skonczylem
//        request.setAttribute("groups", );
        return "manage";
    }

    @RequestMapping(value = "/manage/check-attendnace/save-list", method = RequestMethod.GET)
    public String saveAttendanceList(@ModelAttribute AttendanceList attendanceList, BindingResult bindingResult, HttpServletRequest request){
        attendanceList.setDate(new Date());
        teacherService.saveAttendanceList(attendanceList);

        return "manage";
    }


}

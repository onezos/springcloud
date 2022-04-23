package net.kokwind.course.controller;

import net.kokwind.course.entity.Course;
import net.kokwind.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseListService courseListService;

    @GetMapping("/courses")
    public List<Course> courseList() {
        return courseListService.getCourseList();
    }
}

package net.kokwind.course.controller;
/**
 * 描述： 课程价格控制器
 */

import net.kokwind.course.client.CourseListClient;
import net.kokwind.course.entity.Course;
import net.kokwind.course.entity.CoursePrice;
import net.kokwind.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursePriceController {
    @Autowired
    private CoursePriceService coursePriceService;
    @Autowired
    private CourseListClient courseListClient;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId) {
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }

    @GetMapping("/coursesInPrice")
    public List<Course> getCourseListInPrice() {
        List<Course> courses = courseListClient.courseList();
        return courses;
    }
}

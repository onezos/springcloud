package net.kokwind.course.controller;
/**
 * 描述： 课程价格控制器
 */

import net.kokwind.course.entity.CoursePrice;
import net.kokwind.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursePriceController {
    @Autowired
    private CoursePriceService coursePriceService;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId) {
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }
}

package net.kokwind.course.service;
/**
 * 描述： 课程价格服务
 */

import net.kokwind.course.client.CourseListClient;
import net.kokwind.course.dao.CoursePriceMapper;
import net.kokwind.course.entity.Course;
import net.kokwind.course.entity.CourseAndPrice;
import net.kokwind.course.entity.CoursePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursePriceService {
    @Autowired
    private CoursePriceMapper coursePriceMapper;
    @Autowired
    private CourseListClient courseListClient;

    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.getCoursePrice(courseId);
    }

    public List<CourseAndPrice> getCourseAndPrice() {
        List<CourseAndPrice> courseAndPriceList = new ArrayList<>();
        List<Course> courseList = courseListClient.courseList();
        for(Course course : courseList) {
            if(course !=null){
                CoursePrice coursePrice = coursePriceMapper.getCoursePrice(course.getCourseId());
                CourseAndPrice courseAndPrice = new CourseAndPrice();
                courseAndPrice.setId(course.getId());
                courseAndPrice.setCourseId(course.getCourseId());
                courseAndPrice.setName(course.getName());
                courseAndPrice.setPrice(coursePrice.getPrice());
                courseAndPriceList.add(courseAndPrice);
            }
        }
        return courseAndPriceList;

    }
}

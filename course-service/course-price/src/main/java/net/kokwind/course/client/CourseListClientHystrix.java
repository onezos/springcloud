package net.kokwind.course.client;

import net.kokwind.course.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述： 断路器实现类
 */
@Component
public class CourseListClientHystrix implements CourseListClient {
    @Override
    public List<Course> courseList() {
        //默认情况下调用远端方法，当远端方法不可用时调用本地方法
        List<Course> defaultCourses = new ArrayList<>();
        Course course = new Course();
        course.setId(1);
        course.setCourseId(1);
        course.setName("默认课程");
        course.setValid(1);
        defaultCourses.add(course);
        return defaultCourses;
    }
}   // CourseListClientHystrix

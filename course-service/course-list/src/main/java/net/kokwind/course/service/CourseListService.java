package net.kokwind.course.service;
/**
 * 描述： 课程列表服务
 */

import net.kokwind.course.dao.CourseMapper;
import net.kokwind.course.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseListService {
    @Autowired
    private CourseMapper courseMapper;

    public List<Course> getCourseList(){
        return courseMapper.listCourse();
    }
}

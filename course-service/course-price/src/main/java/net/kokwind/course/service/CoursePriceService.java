package net.kokwind.course.service;
/**
 * 描述： 课程价格服务
 */

import net.kokwind.course.dao.CoursePriceMapper;
import net.kokwind.course.entity.CoursePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursePriceService {
    @Autowired
    private CoursePriceMapper coursePriceMapper;

    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.getCoursePrice(courseId);
    }
}

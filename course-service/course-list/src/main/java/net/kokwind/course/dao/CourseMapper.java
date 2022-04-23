package net.kokwind.course.dao;

import net.kokwind.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述: 课程的Mapper类
 */
@Mapper
@Repository
public interface CourseMapper {
    @Select("select * from course where valid = 1")
    List<Course> listCourse();
}

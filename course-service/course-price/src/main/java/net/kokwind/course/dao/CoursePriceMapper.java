package net.kokwind.course.dao;
/**
 * 描述： 课程价格接口
 */

import net.kokwind.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CoursePriceMapper {
    @Select("select * from course_price where course_id = #{courseId}")
    CoursePrice getCoursePrice(Integer courseId);
}

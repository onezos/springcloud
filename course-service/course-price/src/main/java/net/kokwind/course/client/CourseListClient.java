package net.kokwind.course.client;

import net.kokwind.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 描述： 课程列表的Feign客户端
 */
@FeignClient(value = "course-list",fallback = CourseListClientHystrix.class)
//因为有两个courseList，所以加了@Primary
@Primary
public interface CourseListClient {
    @GetMapping("/courses")
    public List<Course> courseList();
}

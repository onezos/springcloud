package net.kokwind.course.entity;
/**
 * 描述： 课程价格实体类
 */

import java.io.Serializable;

public class CoursePrice implements Serializable {
    private Integer id;
    private Integer courseId;
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoursePrice{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", price=" + price +
                '}';
    }
}
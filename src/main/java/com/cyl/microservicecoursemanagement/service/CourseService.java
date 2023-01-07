package com.cyl.microservicecoursemanagement.service;

import com.cyl.microservicecoursemanagement.model.Course;
import com.cyl.microservicecoursemanagement.model.Transaction;

import java.util.List;

public interface CourseService {

    List<Course> allCourse();

    Course findCourseById(Long courseId);

    List<Transaction> findCourseOfUser(Long userId);
}

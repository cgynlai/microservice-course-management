package com.cyl.microservicecoursemanagement.service;

import com.cyl.microservicecoursemanagement.model.Course;
import com.cyl.microservicecoursemanagement.model.Transaction;
import com.cyl.microservicecoursemanagement.repository.CourseRepository;
import com.cyl.microservicecoursemanagement.repository.TransactionRepositiry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TransactionRepositiry transactionRepositiry;

@Override
    public List<Course> allCourse(){
        return courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public List<Transaction> findCourseOfUser(Long userId) {
        return transactionRepositiry.findAllByUserId(userId);
    }


    public List<Transaction> findTransactionOfCourse(Long courseId) {
            return transactionRepositiry.findAllByCourseId(courseId);
    }


    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepositiry.save(transaction);
    }


}

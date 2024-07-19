package com.JPADemo.JPAFirstApp.Util;

import com.JPADemo.JPAFirstApp.Dao.StudentRequest;
import com.JPADemo.JPAFirstApp.Entity.Student;

public class Utility {

    public static Student Mapper(StudentRequest studentRequest){
        Student student = new Student();
        student.setId(studentRequest.getId());
        student.setName(studentRequest.getName());
        student.setCourse(studentRequest.getCourse());
        student.setAddress(studentRequest.getAddress());
        return student;
    }
}

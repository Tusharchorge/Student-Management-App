package com.JPADemo.JPAFirstApp.Service;

import com.JPADemo.JPAFirstApp.Dao.StudentRequest;
import com.JPADemo.JPAFirstApp.Entity.Student;

import java.util.List;

public interface StdService {





    void DeleteData(int id);

    public List<Student> GetAllStudenstByCourse(String CourseName);

    void SaveStudent(StudentRequest studentRequest);

    List<Student> getallstudents();


    void update();
}

package com.JPADemo.JPAFirstApp.Service;


import com.JPADemo.JPAFirstApp.Dao.StudentRequest;
import com.JPADemo.JPAFirstApp.Entity.Student;
import com.JPADemo.JPAFirstApp.Repo.StudentRepo;
import com.JPADemo.JPAFirstApp.Util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StdServiceImpl implements StdService {

    @Autowired
    StudentRepo studentRepo;


    @Override
    public void DeleteData(int id) {
        studentRepo.deleteById(id);

    }

    @Override
    public List<Student> GetAllStudenstByCourse(String CourseName) {
        return studentRepo.findByCourse(CourseName);
    }

    @Override
    public void SaveStudent(StudentRequest studentRequest) {
        studentRepo.save(Utility.Mapper(studentRequest));
    }

    @Override
    public List<Student> getallstudents() {
       return studentRepo.GetAllData();
    }

    @Override
    public void update() {
        studentRepo.UpdateName();
    }


}

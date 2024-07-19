package com.JPADemo.JPAFirstApp.Repo;

import com.JPADemo.JPAFirstApp.Entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

    public List<Student> findByCourse(String course);


    @Query(value = "select * from Students", nativeQuery = true)
    public List<Student> GetAllData();

 @Query(value="UPDATE Stuent SET name ='sai' WHERE id = 2;",nativeQuery = true)
    public void UpdateName();


}

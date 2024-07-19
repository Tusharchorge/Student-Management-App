package com.JPADemo.JPAFirstApp.Controller;

import com.JPADemo.JPAFirstApp.Dao.StudentRequest;
import com.JPADemo.JPAFirstApp.Entity.Student;
import com.JPADemo.JPAFirstApp.Service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Std")
public class StudentController {
    @Autowired
    StdService stdService;


    @GetMapping("/get/{CourseName}")
    public List<Student> GetStudentsByCourse(@PathVariable String CourseName) {
        List<Student> AllstudentsbyCourse=stdService.GetAllStudenstByCourse(CourseName);
        return AllstudentsbyCourse;
    }

    @PostMapping("/save")
    public void SaveStudent(@RequestBody StudentRequest studentRequest) {
         stdService.SaveStudent(studentRequest);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        stdService.DeleteData(id);
        return "Data Deleted Successfully";
    }

    @GetMapping("/AllStudents")
    public List<Student> GetAllStudents() {
       List<Student> Allstudents= stdService.getallstudents();
       return Allstudents;
    }

    @GetMapping("update")
   public void update(){
        stdService.update();

   }


}

package com.JPADemo.JPAFirstApp.Entity;




import javax.persistence.*;

@Entity
@Table( name="Students")
public class Student {


    @Id
    @Column(name="st_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;

    @Column(name="st_name")
    String name;

    @Column(name="st_course")
    String course;

    @Column(name="st_address")
    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}

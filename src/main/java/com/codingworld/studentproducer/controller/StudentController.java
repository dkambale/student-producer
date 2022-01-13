package com.codingworld.studentproducer.controller;

import com.codingworld.studentproducer.bean.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
  @GetMapping(value = "/getStudent")
  public List<Student> getStudentList() {
    List<Student> students=new ArrayList<>();
    Student s1=new Student(1,"Rakesh");
    Student s2=new Student(2,"Mahesh");
    Student s3=new Student(3,"Ramesh");
    students.add(s1);
    students.add(s2);
    students.add(s3);
    return students;
  }
}

package org.example.springtry.model;

import org.example.springtry.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Teacher {
    private List<Student> students;

    @Autowired
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void teach() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
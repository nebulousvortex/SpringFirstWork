package org.example.springtry;

import org.example.springtry.Student;
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
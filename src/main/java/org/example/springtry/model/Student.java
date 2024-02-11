package org.example.springtry.model;

import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> grades;
    private boolean enrolled;

    public Student(String name, Map<String, Integer> grades, boolean enrolled) {
        this.name = name;
        this.grades = grades;
        this.enrolled = enrolled;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "name=" + name + ", grades=" + grades + ", enrolled=" + enrolled;
    }

    public void init() {
        float averageGrade = (float) grades.values()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        if (averageGrade >= 3) {
            enrolled = true;
        }
    }
}
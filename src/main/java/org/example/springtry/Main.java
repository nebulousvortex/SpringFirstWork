package org.example.springtry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacherXML = contextXML.getBean(Teacher.class);
        teacherXML.teach();

        ApplicationContext contextJava = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Teacher teacherJava = contextJava.getBean(Teacher.class);
        teacherJava.teach();
    }
}
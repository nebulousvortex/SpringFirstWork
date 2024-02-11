package org.example.springtry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "org.example.springtry")
public class ApplicationConfiguration {

    @Bean(initMethod = "init")
    public Student Jil() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Python", 2);
        grades.put("Java", 2);

        return new Student("Jil", grades, false);
    }

    @Bean(initMethod = "init")
    public Student Sasha() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Python", 5);
        grades.put("Java", 5);

        return new Student("Sasha", grades, false);
    }

    @Bean(initMethod = "init")
    public Student Darya() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Python", 2);
        grades.put("Java", 3);

        return new Student("Darya", grades, false);
    }

    @Bean(initMethod = "init")
    public Student Fedor() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Python", 4);
        grades.put("Java", 4);

        return new Student("Fedor", grades, false);
    }

    @Bean
    public Teacher teacher() {
        return new Teacher();
    }

    @Bean
    public BeanPostProcessor studentBeanPostProcessor() {
        return new StudentBeanPostProcessor();
    }
}



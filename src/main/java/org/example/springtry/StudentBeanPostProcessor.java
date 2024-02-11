package org.example.springtry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.Map;

public class StudentBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student && ((Student) bean).getName().equals("Jil")) {
            Map<String, Integer> grades = ((Student) bean).getGrades();
            grades.replaceAll((subject, grade) -> 3);
        }
        return bean;
    }
}

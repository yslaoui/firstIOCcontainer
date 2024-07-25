package com.learningSpring.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("Calling constructor of " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Make 100 aces in a row";
    }

    @PostConstruct
    public void printWhenConstructed() {
        System.out.println(" Bean Initialization method: " + getClass().getSimpleName());
    }
    @PreDestroy
    public void printWhenDestroyed() {
        System.out.println("Bean Destruction method: " + getClass().getSimpleName());
    }





}



package com.learningSpring.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Calling Constructor of " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run 150 times across the Cricket Field";
    }
}



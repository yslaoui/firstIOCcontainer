package com.learningSpring.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Make 100 aces in a row";
    }
}



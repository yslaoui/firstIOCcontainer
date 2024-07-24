package com.learningSpring.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 150 times across the Cricket Field";
    }
}



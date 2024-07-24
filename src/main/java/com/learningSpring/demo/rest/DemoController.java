package com.learningSpring.demo.rest;

import com.learningSpring.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Coach coach;

//    @Autowired
//    public DemoController() {
//
//    }

    @GetMapping
    public String getCricketWorkout() {
        return this.coach.getDailyWorkout();
    }

    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

}


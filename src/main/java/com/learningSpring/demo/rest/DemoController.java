package com.learningSpring.demo.rest;

import com.learningSpring.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Coach coach;

    @Autowired
    public void setCoach( @Qualifier("swimCoach") Coach coach) {
        System.out.println("Calling constructor of " + getClass().getSimpleName());
        this.coach = coach;
    }
    @GetMapping
    public String getCricketWorkout() {
        return this.coach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String checkScope() {
//        return "scope is a singleton " + (this.coach == this.anotherCoach);
//    }



}


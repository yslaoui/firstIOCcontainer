package com.learningSpring.demo.rest;

import com.learningSpring.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Coach coach;
    Coach anotherCoach;

    @Autowired
    public void setCoach( @Qualifier("tennisCoach") Coach coach,
                          @Qualifier("tennisCoach") Coach anotherCoach) {
        System.out.println("Initializing constructor " + getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }
    @GetMapping
    public String getCricketWorkout() {
        return this.coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkScope() {
        return "scope is a singleton " + (this.coach == this.anotherCoach);
    }



}


package com.rtomyj.springtutorial.component.javabased

import com.rtomyj.springtutorial.model.Coach
import com.rtomyj.springtutorial.model.FortuneService

public class JavaCoach(override var fortuneService: FortuneService?)
    : Coach
{
    init
    {
        println("Java coach has been created")
    }


    override fun getDailyWorkout()
            : String
    {
        return "Type 100 unique Java classes and contribute to one Open Source Java project."
    }


    fun getFortune()
            : String
    {
        return this.fortuneService!!.getDailyFortune()
    }


    override fun getDailyFortune()
            : String
    {
        return fortuneService!!.getDailyFortune()
    }
}
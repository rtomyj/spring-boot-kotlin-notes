package com.rtomyj.springtutorial.configuration

import com.rtomyj.springtutorial.component.javabased.JavaCoach
import com.rtomyj.springtutorial.component.javabased.JavaFortuneService
import com.rtomyj.springtutorial.model.BadFortuneService
import com.rtomyj.springtutorial.model.Coach
import com.rtomyj.springtutorial.model.FortuneService
import com.rtomyj.springtutorial.model.NewCoach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
public class Config
{
    @Bean("JavaCoachFortuneService")
    fun getFortuneService()
            : FortuneService
    {
        return JavaFortuneService()
    }


    @Bean
    fun getCoach()
            : Coach
    {
        println("Creating Coach bean")
        return JavaCoach(getFortuneService())
    }
}
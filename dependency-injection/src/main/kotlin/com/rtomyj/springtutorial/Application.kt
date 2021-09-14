package com.rtomyj.springtutorial

import com.rtomyj.springtutorial.component.javabased.JavaCoach
import com.rtomyj.springtutorial.configuration.Config
import com.rtomyj.springtutorial.model.Coach
import com.rtomyj.springtutorial.model.NewCoach
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main(args: Array<String>)
{
	xml()
	java()
}


fun java()
{
	val contextTwo = AnnotationConfigApplicationContext(Config::class.java)

	val javaBasedCoach = contextTwo.getBean(JavaCoach::class.java)

	println(javaBasedCoach.getDailyWorkout())
	println(javaBasedCoach.getDailyFortune())
}


fun xml()
{
	val context = ClassPathXmlApplicationContext("activity_5.xml")

	val coach = context.getBean("esportCoach", Coach::class.java)
	val secondCoach: Coach = context.getBean("esportCoach", Coach::class.java)

	val bootCampCoach: NewCoach = context.getBean("bootCampCoach", NewCoach::class.java)


	println()
	println("Using EsportsCoach....")
	println(coach.getDailyWorkout())
	if (coach.fortuneService != null)	println(coach.fortuneService!!.getDailyFortune())

	println()
	println("Using BootCampCoach....")
	println(bootCampCoach.getDailyWorkout())
	if (bootCampCoach.fortuneService != null)	println(bootCampCoach.fortuneService!!.getDailyFortune())
//	println(bootCampCoach.fortuneService.getDailyFortune())
}

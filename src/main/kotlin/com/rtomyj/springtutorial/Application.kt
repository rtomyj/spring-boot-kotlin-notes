package com.rtomyj.springtutorial

import com.rtomyj.springtutorial.model.BootCampCoach
import com.rtomyj.springtutorial.model.Coach
import com.rtomyj.springtutorial.model.NewCoach
import org.springframework.context.support.ClassPathXmlApplicationContext
import java.io.File


fun main(args: Array<String>) {
	var context = ClassPathXmlApplicationContext("activity_5.xml")

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

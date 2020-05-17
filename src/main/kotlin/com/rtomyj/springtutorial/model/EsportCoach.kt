package com.rtomyj.springtutorial.model

import com.rtomyj.springtutorial.model.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
data class EsportCoach(override var fortuneService: FortuneService? = null) : Coach
{

	init
	{
		println("EsportCoach: In init method")
	}


	constructor(coach: Any): this()
	{
		println(coach)
		println(coach::class)
	}


	override fun getDailyWorkout(): String
	{
		return "Play new role for 4 hours each day."
	}

}
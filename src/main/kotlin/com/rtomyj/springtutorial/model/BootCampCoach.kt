package com.rtomyj.springtutorial.model

import com.rtomyj.springtutorial.model.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

/**
 * Used for activity 5 - autowiring props
 */
@Component
//class BootCampCoach @Autowired constructor(override var fortuneService: FortuneService): NewCoach
//allows nullable FortuneService
//class BootCampCoach @Autowired constructor(override var fortuneService: FortuneService?): NewCoach
class BootCampCoach: NewCoach
{

//	NewCoach interface needs to be updated to have FortuneService be nullable,
//	else the lateinit non nullable method can be used
//	@Autowired
//	override var fortuneService: FortuneService? = null

//	FortuneService has to be non nullable
	@Autowired
	override lateinit var fortuneService: FortuneService


//	NewCoach interface needs to be updated to have FortuneService be nullable,
//	else the lateinit non nullable method can be used
//	override var fortuneService: FortuneService? = null
//	@Autowired
//	fun setFortunService(fortuneService: FortuneService)
//	{
//		this.fortuneService = fortuneService
//	}


//	FortuneService has to be non nullable
//	override lateinit var fortuneService: FortuneService
//	@Autowired
//	fun setFortunService(fortuneService: FortuneService)
//	{
//		this.fortuneService = fortuneService
//	}


	init
	{
		println("EsportCoach: In init method")
	}


	override fun getDailyWorkout(): String
	{
		return "Play new role for 4 hours each day."
	}


	@PostConstruct
	fun postConstruct()
	{
		println("Bean has been created")
	}

}
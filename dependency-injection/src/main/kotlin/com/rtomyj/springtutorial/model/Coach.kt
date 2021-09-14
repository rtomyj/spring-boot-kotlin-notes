package com.rtomyj.springtutorial.model


interface Coach
{
	var fortuneService: FortuneService?


	fun getDailyWorkout(): String
	fun getDailyFortune(): String
}
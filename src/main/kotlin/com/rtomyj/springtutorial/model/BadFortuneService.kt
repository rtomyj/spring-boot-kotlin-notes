package com.rtomyj.springtutorial.model

import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
class BadFortuneService: FortuneService
{
    val fortunes = listOf<String>("You will probably die today :D", "Your wife is cheating on you xD", "There is no afterlife hehe")
    val numFortunes = fortunes.size
    val rand = Random;

    override fun getDailyFortune(): String {
        return fortunes.get(rand.nextInt(numFortunes))
    }
}
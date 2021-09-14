package com.rtomyj.springtutorial.component.javabased

import com.rtomyj.springtutorial.model.FortuneService

public class JavaFortuneService
    :FortuneService
{
    override fun getDailyFortune(): String
    {
        return "You will ditch Java today and start being a Kotlin Dev."
    }
}
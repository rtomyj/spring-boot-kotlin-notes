package com.rtomyj

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class MvcJspWithFormValidationApplication

fun main(args: Array<String>) {
	runApplication<MvcJspWithFormValidationApplication>(*args)
}

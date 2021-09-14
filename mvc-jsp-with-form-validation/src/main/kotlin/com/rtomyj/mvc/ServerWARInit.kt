package com.rtomyj.mvc

import com.rtomyj.MvcJspWithFormValidationApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

class ServerWARInit : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(MvcJspWithFormValidationApplication::class.java)
    }

}
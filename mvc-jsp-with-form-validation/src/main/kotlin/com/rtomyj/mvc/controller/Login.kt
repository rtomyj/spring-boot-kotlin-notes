package com.rtomyj.mvc.controller

import com.rtomyj.mvc.model.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
public class Login
{

    @RequestMapping("/")
    public fun test(model: Model): String
    {
        return "login"
    }

//@RequestParam("username") username: String
    @RequestMapping("/login-confirmation")
    public fun loginConfirmation(@RequestParam("username") username: String, model: Model): String
    {
        println("superrandomtext")
        return "login-confirmation"
    }

}
package com.rtomyj.mvc.controller

import com.rtomyj.mvc.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestKotlikn {

    @GetMapping("/test")
    public fun test(): User
    {
        var user: User = User()
        user.username = "javi"
        user.password = "kotlin is meh"

        return user
    }

}
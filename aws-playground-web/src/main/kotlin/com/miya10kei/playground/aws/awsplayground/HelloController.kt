package com.miya10kei.playground.aws.awsplayground

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun hello(): HelloResource {
        return HelloResource(message = "Merry X'mas!")
    }
}

data class HelloResource(val message: String)

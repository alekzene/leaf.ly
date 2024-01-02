package com.example.leafly

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun leafly(model: Model): String {
        model["title"] = "leaf.ly"
        model["styles-address"] = "/css/styles.css"
        return "leafly"
    }
    @GetMapping("/sign-up.mustache")
    fun signUp(model: Model): String {
        model["title"] = "sign up"
        model["styles-address"] = "/css/sign-up-styles.css"
        return "sign-up"
    }

    @GetMapping("/log-in.mustache")
    fun logIn(model: Model): String {
        model["title"] = "log in"
        model["styles-address"] = "/css/log-in-styles.css"
        return "log-in"
    }
}
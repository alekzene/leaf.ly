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
        return "leafly"
    }
}
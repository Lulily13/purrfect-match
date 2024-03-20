package io.github.lulily13.purrfectmatch.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/contact")
class ContactController {
    @PostMapping
    fun showContactForm() {

    }
}
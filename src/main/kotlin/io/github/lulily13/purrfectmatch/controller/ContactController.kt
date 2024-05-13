package io.github.lulily13.purrfectmatch.controller

import io.github.lulily13.purrfectmatch.model.contact.Form
import io.github.lulily13.purrfectmatch.service.ContactService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/contact")
class ContactController(
    private val contactService: ContactService
) {

    @PostMapping
    fun sendContactForm(): Form {
        return contactService.sendContactForm()
    }
}
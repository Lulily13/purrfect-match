package io.github.lulily13.purrfectmatch.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/admin")
class AdminController {

    @PostMapping("/login")
    fun adminLogin() {

    }

    @GetMapping("/cats")
    fun getCats() {

    }

    @PostMapping("/cats")
    fun addCat() {

    }

    @PutMapping("/cats/{id}")
    fun updateCat(@PathVariable id: Long) {

    }

    @DeleteMapping("/cats/{id}")
    fun deleteCat(@PathVariable id: Long) {

    }

    @GetMapping("/inquiries")
    fun getAdoptionInquiry() {

    }
}
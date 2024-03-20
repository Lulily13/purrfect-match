package io.github.lulily13.purrfectmatch.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("/cats")
class CatController {

    @GetMapping
    fun getCats() {

    }

    @GetMapping("/{id}")
    fun getCat(@PathVariable id: Long) {

    }

    @GetMapping("/{id}/summary")
    fun getCatSummary(@PathVariable id: Long) {

    }

    @PatchMapping("/{id}")
    fun likeCat(@PathVariable id: Long) {

    }
}
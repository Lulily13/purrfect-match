package io.github.lulily13.purrfectmatch.controller

import io.github.lulily13.purrfectmatch.model.cat.Cat
import io.github.lulily13.purrfectmatch.model.cat.CatSummary
import io.github.lulily13.purrfectmatch.model.cat.Cats
import io.github.lulily13.purrfectmatch.service.CatService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/cats")
class CatController(
    private val catService: CatService
) {

    @GetMapping
    fun getCats(): Cats {
        return catService.getCats()
    }

    @GetMapping("/{id}")
    fun getCat(@PathVariable id: Long): Cat {
        return catService.getCat(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @GetMapping("/{id}/summary")
    fun getCatSummary(@PathVariable id: Long): CatSummary {
        return catService.getCatSummary(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @GetMapping("/{id}/like")
    fun likeCat(@PathVariable id: Long) {
        return catService.likeCat(id)
    }
}
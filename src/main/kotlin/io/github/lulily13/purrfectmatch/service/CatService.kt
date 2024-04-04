package io.github.lulily13.purrfectmatch.service

import io.github.lulily13.purrfectmatch.model.cat.Cats
import io.github.lulily13.purrfectmatch.model.cat.Cat
import io.github.lulily13.purrfectmatch.model.cat.CatSummary
import org.springframework.stereotype.Service

@Service
class CatService {

    fun getCats(): Cats {
        TODO()

        // fetch all cats from database
    }

    fun getCat(id: Long): Cat? {
        TODO()

        // get cat if exists in the database or return null
    }

    fun getCatSummary(id: Long): CatSummary? {
        TODO()

        // get cat summary if exists in the database or return null
    }

    fun likeCat(id: Long) {
        TODO()

        // increase cat like count in the database (update cat)
    }
}
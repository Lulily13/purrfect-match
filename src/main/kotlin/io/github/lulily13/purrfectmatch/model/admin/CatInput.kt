package io.github.lulily13.purrfectmatch.model.admin

data class CatInput(
    val name: String,
    val age: Int,
    val summary: String?,
    val notes: String?,
    val imageUrl: String?
)
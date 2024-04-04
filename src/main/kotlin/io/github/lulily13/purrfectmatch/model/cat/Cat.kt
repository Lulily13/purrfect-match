package io.github.lulily13.purrfectmatch.model.cat

data class Cat(
    val id: Long,
    val name: String,
    val age: Int,
    val summary: String?,
    val notes: String?,
    val imageUrl: String?
)
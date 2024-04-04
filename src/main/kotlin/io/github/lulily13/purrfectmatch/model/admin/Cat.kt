package io.github.lulily13.purrfectmatch.model.admin

data class Cat(
    val id: Long,
    val name: String,
    val age: Int,
    val summary: String?,
    val notes: String?,
    val imageUrl: String?
)
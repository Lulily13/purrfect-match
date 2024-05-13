package io.github.lulily13.purrfectmatch.model.cat

import java.util.UUID

data class Cat(
    val id: UUID,
    val name: String,
    val age: Int,
    val summary: String?,
    val notes: String?,
    val imageUrl: String?
)
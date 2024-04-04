package io.github.lulily13.purrfectmatch.model.cat

data class CatSummary(
    val id: Long,
    val name: String,
    val age: Int,
    val summary: String?,
    val imageUrl: String?
)

package io.github.lulily13.purrfectmatch.model.contact

data class Form(
    val catId: Long,
    val userName: String,
    val userSurname: String,
    val phone: Long,
    val email: String,
    val message: String?
)

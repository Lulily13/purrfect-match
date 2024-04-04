package io.github.lulily13.purrfectmatch.model.admin

data class Inquiry(
    val id: Long,
    val catId: Long,
    val userName: String,
    val userSurname: String,
    val phone: Long,
    val email: String,
    val message: String?
)

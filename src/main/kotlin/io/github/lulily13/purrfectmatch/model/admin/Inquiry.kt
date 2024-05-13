package io.github.lulily13.purrfectmatch.model.admin

import java.util.UUID

data class Inquiry(
    val id: UUID,
    val catId: UUID,
    val userName: String,
    val userSurname: String,
    val phone: String,
    val email: String,
    val message: String?
)

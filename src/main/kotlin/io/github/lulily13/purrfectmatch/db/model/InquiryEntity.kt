package io.github.lulily13.purrfectmatch.db.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "inquiries")
class InquiryEntity(
    @Id
    @Column(name = "id", nullable = false)
    var id: UUID,

    @Column(name = "cat_id", nullable = false)
    var catId: UUID,

    @Column(name = "user_name", nullable = false)
    var userName: String,

    @Column(name = "user_surname", nullable = false)
    var userSurname: String,

    @Column(name = "phone", nullable = false)
    var phone: String,

    @Column(name = "email", nullable = false)
    var email: String,

    @Column(name = "message", nullable = true)
    var message: String?
)
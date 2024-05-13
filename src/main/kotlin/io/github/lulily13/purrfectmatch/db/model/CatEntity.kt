package io.github.lulily13.purrfectmatch.db.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "cats")
class CatEntity(
    @Id
    @Column(name = "id", nullable = false)
    var id: UUID,

    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "age", nullable = false)
    var age: Int,

    @Column(name = "summary", nullable = true)
    var summary: String?,

    @Column(name = "notes", nullable = true)
    var notes: String?,

    @Column(name = "image_url", nullable = true)
    var imageUrl: String?
)
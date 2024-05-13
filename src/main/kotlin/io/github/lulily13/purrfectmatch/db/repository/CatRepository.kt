package io.github.lulily13.purrfectmatch.db.repository

import io.github.lulily13.purrfectmatch.db.model.CatEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CatRepository : JpaRepository<CatEntity, UUID>
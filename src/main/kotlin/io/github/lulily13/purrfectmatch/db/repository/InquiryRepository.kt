package io.github.lulily13.purrfectmatch.db.repository

import io.github.lulily13.purrfectmatch.db.model.InquiryEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface InquiryRepository : JpaRepository<InquiryEntity, UUID>
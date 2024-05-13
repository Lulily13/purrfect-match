package io.github.lulily13.purrfectmatch.service

import io.github.lulily13.purrfectmatch.db.model.CatEntity
import io.github.lulily13.purrfectmatch.db.repository.CatRepository
import io.github.lulily13.purrfectmatch.db.repository.InquiryRepository
import io.github.lulily13.purrfectmatch.model.admin.*
import org.springframework.stereotype.Service
import java.util.UUID
import kotlin.jvm.optionals.getOrNull

@Service
class AdminService(
    private val catRepository: CatRepository,
    private val inquiryRepository: InquiryRepository
) {

    fun adminLogin() {
        TODO()
        // login admin to the admin center
    }

    fun getCats(): Cats {
        return Cats(
            cats = catRepository.findAll().map { cat ->
                with (cat) {
                    Cat(
                        id = id,
                        name = name,
                        age = age,
                        summary = summary,
                        notes = notes,
                        imageUrl = imageUrl
                    )
                }
            }
        )
    }

    fun addCat(catInput: CatInput): Cat {
        val catEntity = with (catInput) {
            CatEntity(
                id = UUID.randomUUID(),
                name = name,
                age = age,
                summary = summary,
                notes = notes,
                imageUrl = imageUrl
            )
        }

        val savedCat = catRepository.save(catEntity)

        return with (savedCat) {
            Cat(
                id = id,
                name = name,
                age = age,
                summary = summary,
                notes = notes,
                imageUrl = imageUrl
            )
        }
    }

    fun updateCat(id: UUID, catInput: CatInput): Cat? {
        val cat = catRepository.findById(id).getOrNull()

        val newCat = cat?.apply {
            name = catInput.name
            age = catInput.age
            summary = catInput.summary
            notes = catInput.notes
            imageUrl= catInput.imageUrl
        }

        return newCat?.let {
            val savedCat = catRepository.save(it)

            with (savedCat) {
                Cat(
                    id = id,
                    name = name,
                    age = age,
                    summary = summary,
                    notes = notes,
                    imageUrl = imageUrl
                )
            }
        }
    }

    fun deleteCat(id: UUID): String {

        return try {
            catRepository.deleteById(id)
            "Cat has been successfully deleted"
        } catch (e: Exception) {
            "Failed to delete cat: ${e.message}"
        }
    }

    fun getAdoptionInquiries(): Inquiries {
        return Inquiries(
            inquiries = inquiryRepository.findAll().map { inquiry ->
                with (inquiry) {
                    Inquiry(
                        id = id,
                        catId = catId,
                        userName = userName,
                        userSurname = userSurname,
                        phone = phone,
                        email = email,
                        message = message
                    )
                }
            }
        )
    }
}
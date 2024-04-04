package io.github.lulily13.purrfectmatch.service

import io.github.lulily13.purrfectmatch.model.admin.Inquiries
import io.github.lulily13.purrfectmatch.model.admin.Cat
import io.github.lulily13.purrfectmatch.model.admin.Cats
import org.springframework.stereotype.Service

@Service
class AdminService {

    fun adminLogin() {
        TODO()
        // login admin to the admin center
    }

    fun getCats(): Cats {
        TODO()
        // fetch all cats from database
    }

    fun addCat(): Cat {
        TODO()
        // add a new cat to the db
    }

    fun updateCat(id: Long): Cat? {
        TODO()
        // update the existing cat in the db or return null
    }

    fun deleteCat(id: Long) {
        TODO()
        // delete the existing cat in the db

    }

    fun getAdoptionInquiries(): Inquiries {
        TODO()
        // fetch all pending adoption inquiries from the db
    }

}
package io.github.lulily13.purrfectmatch.controller

import io.github.lulily13.purrfectmatch.model.admin.Cat
import io.github.lulily13.purrfectmatch.model.admin.CatInput
import io.github.lulily13.purrfectmatch.model.admin.Cats
import io.github.lulily13.purrfectmatch.model.admin.Inquiries
import io.github.lulily13.purrfectmatch.service.AdminService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.util.UUID

@RestController
@RequestMapping("/admin")
class AdminController(
    private val adminService: AdminService
) {

    @PostMapping("/login")
    fun adminLogin() {
        return adminService.adminLogin()
    }

    @GetMapping("/cats")
    fun getCats(): Cats {
        return adminService.getCats()
    }

    @PostMapping("/cats")
    fun addCat(@RequestBody catInput: CatInput): Cat {
        // logger.info("Received input: $catInput")
        return adminService.addCat(catInput)
    }

    @PutMapping("/cats/{id}")
    fun updateCat(@PathVariable id: UUID, @RequestBody catInput: CatInput): Cat {
        return adminService.updateCat(id, catInput) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @DeleteMapping("/cats/{id}")
    fun deleteCat(@PathVariable id: UUID): String {
        return adminService.deleteCat(id)
    }

    @GetMapping("/inquiries")
    fun getAdoptionInquiries(): Inquiries {
        return adminService.getAdoptionInquiries()
    }

    companion object {
        private  val logger = LoggerFactory.getLogger(AdminController::class.java)
    }
}
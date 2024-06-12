package com.cancermedicine.therapeutics.repository


import com.cancermedicine.therapeutics.repository.model.PatientDBModel
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface PatientRepository: CrudRepository<PatientDBModel, UUID> {
}

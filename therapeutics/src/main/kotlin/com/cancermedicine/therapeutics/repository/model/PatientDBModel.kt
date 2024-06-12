package com.cancermedicine.therapeutics.repository.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.Date
import java.util.UUID

@Entity
class PatientDBModel (
        val studyId: Int,
        val title: String,
        val therapeutics: String,
        val description: String,
        val status:String
){
    @Id
    @GeneratedValue
    var id: UUID? = null
        private set

    val date:Date = Date()
}
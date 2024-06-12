package com.cancermedicine.therapeutics.controller.model

import com.cancermedicine.therapeutics.repository.model.PatientDBModel
import java.util.*

class OverviewPatientModel (
    val studyId: Int,
    val title: String,
    val therapeutics: String,
    val description: String,
    val status:String,
    val date: Date,
    val id: String

)

fun PatientDBModel.convertToOverviewPatientModel() = OverviewPatientModel(
        studyId = this.studyId,
        title = this.title,
        therapeutics = this.therapeutics,
        description = this.description,
        status = this.status,
        date = this.date,
        id = this.id.toString()
)
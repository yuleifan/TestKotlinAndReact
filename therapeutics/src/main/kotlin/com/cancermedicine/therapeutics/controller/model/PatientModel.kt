package com.cancermedicine.therapeutics.controller.model

import com.cancermedicine.therapeutics.repository.model.PatientDBModel

class PatientModel (
    val studyId: Int,
    val title: String,
    val therapeutics: String,
    val description: String,
    val status:String
)

fun PatientModel.convertToDBModel() = PatientDBModel(
        studyId = this.studyId,
        title = this.title,
        therapeutics = this.therapeutics,
        description = this.description,
        status = this.status
)
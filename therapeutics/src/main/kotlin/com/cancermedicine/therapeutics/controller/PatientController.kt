package com.cancermedicine.therapeutics.controller

import com.cancermedicine.therapeutics.controller.model.PatientModel
import com.cancermedicine.therapeutics.controller.model.OverviewPatientModel
import com.cancermedicine.therapeutics.controller.model.convertToDBModel
import com.cancermedicine.therapeutics.controller.model.convertToOverviewPatientModel
import com.cancermedicine.therapeutics.repository.PatientRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/patient")
class PatientController(val repository: PatientRepository) {

    @PostMapping("/create")
    fun createPatient(@RequestBody patientModel: PatientModel){
        repository.save(patientModel.convertToDBModel())
    }

    fun newTransfer(@RequestBody transactionModel: PatientModel) {
        repository.save(transactionModel.convertToDBModel())
    }

    @GetMapping("/readAll")
    fun readAll():List<OverviewPatientModel>{
        //to do fetch
        return repository.findAll().map { it.convertToOverviewPatientModel() }
    }
}
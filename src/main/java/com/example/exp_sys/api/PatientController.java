package com.example.exp_sys.api;

import com.example.exp_sys.entity.Patient;
import com.example.exp_sys.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
  @Autowired
  private PatientRepo patientRepo;

  @PostMapping
  public ResponseEntity<Patient> addPatient (
    @RequestBody Patient patient
  ) {
    Patient patientFromDb = patientRepo.findFirstByOmsNum(patient.getOmsNum());

    if (patientFromDb != null) {
      return new ResponseEntity<>(null, null, HttpStatus.OK);
    }

    patient = patientRepo.save(patient);

    return new ResponseEntity<>(patient, null, HttpStatus.OK);
  }
}

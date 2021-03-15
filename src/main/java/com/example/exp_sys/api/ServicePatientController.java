package com.example.exp_sys.api;

import com.example.exp_sys.dto.ServicePatientDto;
import com.example.exp_sys.entity.Patient;
import com.example.exp_sys.entity.ServicePatient;
import com.example.exp_sys.repo.PatientRepo;
import com.example.exp_sys.repo.ServicePatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-patient")
public class ServicePatientController {
  @Autowired
  private ServicePatientRepo servicePatientRepo;

  @Autowired
  private PatientRepo patientRepo;

  @PostMapping
  public ResponseEntity<ServicePatient> addService (
    @RequestBody ServicePatientDto servicePatientDto
  ) {
    Patient patient = patientRepo.findFirstByOmsNum(servicePatientDto.getOmsNum());
    ServicePatient servicePatient = servicePatientRepo.save(
      new ServicePatient(servicePatientDto.getService(), patient)
    );

    return new ResponseEntity<>(servicePatient, null, HttpStatus.OK);
  }
}

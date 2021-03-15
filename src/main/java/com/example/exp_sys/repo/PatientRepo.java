package com.example.exp_sys.repo;

import com.example.exp_sys.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Long> {
  Patient findFirstByOmsNum (String omsNum);
}

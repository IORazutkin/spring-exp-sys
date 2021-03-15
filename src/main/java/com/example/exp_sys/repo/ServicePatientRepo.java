package com.example.exp_sys.repo;

import com.example.exp_sys.entity.ServicePatient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicePatientRepo extends JpaRepository<ServicePatient, Long> {
}

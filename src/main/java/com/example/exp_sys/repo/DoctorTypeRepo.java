package com.example.exp_sys.repo;

import com.example.exp_sys.entity.DoctorType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorTypeRepo extends JpaRepository<DoctorType, Long> {
}

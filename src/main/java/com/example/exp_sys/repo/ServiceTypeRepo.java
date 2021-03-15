package com.example.exp_sys.repo;

import com.example.exp_sys.entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTypeRepo extends JpaRepository<ServiceType, Long> {
}

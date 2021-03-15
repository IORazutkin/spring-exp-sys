package com.example.exp_sys.api;

import com.example.exp_sys.entity.ServiceType;
import com.example.exp_sys.repo.ServiceTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
  @Autowired
  private ServiceTypeRepo serviceTypeRepo;

  @GetMapping
  public ResponseEntity<List<ServiceType>> getServices () {
    return new ResponseEntity<>(serviceTypeRepo.findAll(), null, HttpStatus.OK);
  }
}

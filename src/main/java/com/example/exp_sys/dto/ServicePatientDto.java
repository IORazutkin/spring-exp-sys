package com.example.exp_sys.dto;

import com.example.exp_sys.entity.ServiceType;
import lombok.Data;

import javax.xml.ws.Service;

@Data
public class ServicePatientDto {
  String omsNum;
  ServiceType service;
}

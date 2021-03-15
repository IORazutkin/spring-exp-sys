package com.example.exp_sys.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class ServicePatient {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private LocalDate date;

  @ManyToOne
  @JoinColumn(name = "id_service")
  private ServiceType serviceType;

  @ManyToOne
  @JoinColumn(name = "id_patient")
  private Patient patient;

  public ServicePatient (ServiceType serviceType, Patient patient) {
    this.serviceType = serviceType;
    this.patient = patient;
    this.date = LocalDate.now();
  }
}

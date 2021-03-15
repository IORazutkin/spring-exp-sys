package com.example.exp_sys.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Doctor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String fullName;

  @ManyToOne
  @JoinColumn(name = "id_type")
  private DoctorType doctorType;
}

package com.example.exp_sys.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DoctorType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String name;

  @Column
  private String description;
}

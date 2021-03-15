package com.example.exp_sys.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Patient {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String fullName;

  @Column
  private LocalDate birthDate;

  @Column
  private String pasNum;

  @Column
  private String snilsNum;

  @Column
  private String omsNum;
}

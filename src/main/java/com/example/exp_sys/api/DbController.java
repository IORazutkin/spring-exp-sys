package com.example.exp_sys.api;

import com.example.exp_sys.entity.Patient;
import com.example.exp_sys.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/api/db")
public class DbController {
  @Autowired
  private PatientRepo patientRepo;

  @GetMapping
  public void dbExport () throws IOException {
    List<Patient> patients = patientRepo.findAll();
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/db.pl")));
    patients.forEach((item) -> {
      try {
        bufferedWriter.write(item.toString());
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    bufferedWriter.close();
  }
}

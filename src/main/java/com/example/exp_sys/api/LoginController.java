package com.example.exp_sys.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
  @GetMapping("/login-error")
  public ResponseEntity<Object> wrongData () {
    return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @GetMapping("/login")
  public ResponseEntity<Object> unauthorized () {
    return new ResponseEntity<>(null,null, HttpStatus.UNAUTHORIZED);
  }
}

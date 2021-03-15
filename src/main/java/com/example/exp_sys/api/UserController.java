package com.example.exp_sys.api;

import com.example.exp_sys.entity.User;
import com.example.exp_sys.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Autowired
  private UserRepo userRepo;

  @GetMapping
  public ResponseEntity<User> getUser (
    @AuthenticationPrincipal User user
  ) {
    return new ResponseEntity<>(user, null, HttpStatus.OK);
  }
}

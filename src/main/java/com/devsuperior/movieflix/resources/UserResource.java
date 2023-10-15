package com.devsuperior.movieflix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService userService;

  @GetMapping(value = "/profile")
  public ResponseEntity<UserDTO> profileFromCurrentUser() {
    UserDTO userDTO = this.userService.getProfileAuthenticated();
    return ResponseEntity.ok().body(userDTO);
  }
}
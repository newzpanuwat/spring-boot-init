package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class UserController {

  List<User> users = new ArrayList<>(Arrays.asList(
      new User(1, "XOXO Lipstick", "aaa", "BAY")));

  @RequestMapping("api/v1/users")
  public List<User> getUsers() {
    return users;
  }
}

package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserData;

@RestController
public class UserController {

  List<UserData> users = new ArrayList<>(Arrays.asList(
      new UserData(1, "XOXO Lipstick", "aaa")));

  @RequestMapping("/users")
  public List<UserData> getUsers() {
    return users;
  }
}

package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;
// import com.example.demo.service.*;

@RestController
public class UserController {

  List<User> users = new ArrayList<>(Arrays.asList(
      new User("BAY")));

  @RequestMapping("api/v1/users")
  public List<User> getUsers() {
    return users;
  }
}

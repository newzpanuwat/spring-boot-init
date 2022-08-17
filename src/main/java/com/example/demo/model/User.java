package com.example.demo.model;

import lombok.Data;

@Data
public class User {
  public int userId;
  public String username;
  public String password;
  public String partnerName;

  public User(int userId, String username, String password, String partnerName) {
    this.userId = userId;
    this.username = username;
    this.password = password;
    this.partnerName = partnerName;
  }
}

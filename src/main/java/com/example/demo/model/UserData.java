package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class UserData {
  @Getter
  @Setter
  public int userId;
  @Getter
  @Setter
  public String username;
  @Getter
  @Setter
  public String password;

  public UserData(int userId, String username, String password) {
    this.userId = userId;
    this.username = username;
    this.password = password;
  }
}

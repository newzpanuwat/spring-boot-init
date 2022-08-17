package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User {
  @Getter
  @Setter
  public int userId;
  @Getter
  @Setter
  public String username;
  @Getter
  @Setter
  public String password;
  @Getter
  @Setter
  public String partnerName;

  public User(int userId, String username, String password, String partnerName) {
    this.userId = userId;
    this.username = username;
    this.password = password;
    this.partnerName = partnerName;
  }
}

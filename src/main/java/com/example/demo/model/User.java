package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class User {
  public String partnerName;

  public User(String partnerName) {
    this.partnerName = partnerName;
  }
}

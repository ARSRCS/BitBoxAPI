package com.bitbox.project.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(columnDefinition = "serial")
  private long userId;
  private String userName;
  private String userPass;
  private String isSuperuser;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPass() {
    return userPass;
  }

  public void setUserPass(String userPass) {
    this.userPass = userPass;
  }


  public String getIsSuperuser() {
    return isSuperuser;
  }

  public void setIsSuperuser(String isSuperuser) {
    this.isSuperuser = isSuperuser;
  }

}

package com.bitbox.project.models;

import javax.persistence.*;

@Entity
@Table(name="supplier")
public class Supplier {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(columnDefinition = "serial")
  private long supplierId;
  private String name;
  private String country;

  public long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}

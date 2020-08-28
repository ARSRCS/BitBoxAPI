package com.bitbox.project.models;

import javax.persistence.*;

@Entity
@Table(name="item")
public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(columnDefinition = "serial")
  private long itemCode;
  private String description;
  private long price;
  private String state;
  private long suppliers;
  private long priceReductions;
  private java.sql.Date creationDate;
  private String creator;


  public long getItemCode() {
    return itemCode;
  }

  public void setItemCode(long itemCode) {
    this.itemCode = itemCode;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public long getSuppliers() {
    return suppliers;
  }

  public void setSuppliers(long suppliers) {
    this.suppliers = suppliers;
  }


  public long getPriceReductions() {
    return priceReductions;
  }

  public void setPriceReductions(long priceReductions) {
    this.priceReductions = priceReductions;
  }


  public java.sql.Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Date creationDate) {
    this.creationDate = creationDate;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

}

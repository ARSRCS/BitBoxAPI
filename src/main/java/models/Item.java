package models;


public class Item {

  private long itemCode;
  private String description;
  private String price;
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


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
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

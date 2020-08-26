package models;


public class Supplier {

  private long supplierId;
  private String name;
  private String country;

  public Supplier(long id, String nombre, String pais){
    this.supplierId=id;
    this.name=nombre;
    this.country=pais;
  }

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

package models;


public class PriceReduction {

  private long reductionId;
  private String reducedPrice;
  private java.sql.Date startDate;
  private java.sql.Date endDate;


  public long getReductionId() {
    return reductionId;
  }

  public void setReductionId(long reductionId) {
    this.reductionId = reductionId;
  }


  public String getReducedPrice() {
    return reducedPrice;
  }

  public void setReducedPrice(String reducedPrice) {
    this.reducedPrice = reducedPrice;
  }


  public java.sql.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Date startDate) {
    this.startDate = startDate;
  }


  public java.sql.Date getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Date endDate) {
    this.endDate = endDate;
  }

}

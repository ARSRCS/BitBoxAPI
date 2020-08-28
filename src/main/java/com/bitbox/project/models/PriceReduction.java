package com.bitbox.project.models;

import javax.persistence.*;

@Entity
@Table(name="price_reduction")
public class PriceReduction {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(columnDefinition = "serial")
  private long reductionId;
  private long reducedPrice;
  private java.sql.Date startDate;
  private java.sql.Date endDate;


  public long getReductionId() {
    return reductionId;
  }

  public void setReductionId(long reductionId) {
    this.reductionId = reductionId;
  }


  public long getReducedPrice() {
    return reducedPrice;
  }

  public void setReducedPrice(long reducedPrice) {
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

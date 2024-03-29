/**
 * Persona
 * KSF Media unified login service
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Payment {
  
  @SerializedName("invno")
  private Integer invno = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("dueDate")
  private Date dueDate = null;
  @SerializedName("expenses")
  private Double expenses = null;
  @SerializedName("interest")
  private Double interest = null;
  @SerializedName("vat")
  private Double vat = null;
  @SerializedName("amount")
  private Double amount = null;
  @SerializedName("openAmount")
  private Double openAmount = null;
  public enum TypeEnum {
     NormalState,  DirectDebit,  Reminder1,  Reminder2,  ReservedPaymentType1,  Nonpayment,  ReservedPaymentType2,  Reimbursement, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum StateEnum {
     PaymentOpen,  PartiallyPaid,  Paid,  Reminded,  Foreclosure,  ReservedPaymentState,  Reimbursed,  CreditLoss, 
  };
  @SerializedName("state")
  private StateEnum state = null;
  @SerializedName("discPercent")
  private Double discPercent = null;
  @SerializedName("discAmount")
  private Double discAmount = null;
  @SerializedName("reference")
  private String reference = null;

  /**
   * Payment invoice ID
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "Payment invoice ID")
  public Integer getInvno() {
    return invno;
  }
  public void setInvno(Integer invno) {
    this.invno = invno;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDueDate() {
    return dueDate;
  }
  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getExpenses() {
    return expenses;
  }
  public void setExpenses(Double expenses) {
    this.expenses = expenses;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getInterest() {
    return interest;
  }
  public void setInterest(Double interest) {
    this.interest = interest;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getVat() {
    return vat;
  }
  public void setVat(Double vat) {
    this.vat = vat;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getOpenAmount() {
    return openAmount;
  }
  public void setOpenAmount(Double openAmount) {
    this.openAmount = openAmount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Double getDiscPercent() {
    return discPercent;
  }
  public void setDiscPercent(Double discPercent) {
    this.discPercent = discPercent;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Double getDiscAmount() {
    return discAmount;
  }
  public void setDiscAmount(Double discAmount) {
    this.discAmount = discAmount;
  }

  /**
   * Reference number
   **/
  @ApiModelProperty(value = "Reference number")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return (this.invno == null ? payment.invno == null : this.invno.equals(payment.invno)) &&
        (this.date == null ? payment.date == null : this.date.equals(payment.date)) &&
        (this.dueDate == null ? payment.dueDate == null : this.dueDate.equals(payment.dueDate)) &&
        (this.expenses == null ? payment.expenses == null : this.expenses.equals(payment.expenses)) &&
        (this.interest == null ? payment.interest == null : this.interest.equals(payment.interest)) &&
        (this.vat == null ? payment.vat == null : this.vat.equals(payment.vat)) &&
        (this.amount == null ? payment.amount == null : this.amount.equals(payment.amount)) &&
        (this.openAmount == null ? payment.openAmount == null : this.openAmount.equals(payment.openAmount)) &&
        (this.type == null ? payment.type == null : this.type.equals(payment.type)) &&
        (this.state == null ? payment.state == null : this.state.equals(payment.state)) &&
        (this.discPercent == null ? payment.discPercent == null : this.discPercent.equals(payment.discPercent)) &&
        (this.discAmount == null ? payment.discAmount == null : this.discAmount.equals(payment.discAmount)) &&
        (this.reference == null ? payment.reference == null : this.reference.equals(payment.reference));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.invno == null ? 0: this.invno.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.dueDate == null ? 0: this.dueDate.hashCode());
    result = 31 * result + (this.expenses == null ? 0: this.expenses.hashCode());
    result = 31 * result + (this.interest == null ? 0: this.interest.hashCode());
    result = 31 * result + (this.vat == null ? 0: this.vat.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.openAmount == null ? 0: this.openAmount.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.discPercent == null ? 0: this.discPercent.hashCode());
    result = 31 * result + (this.discAmount == null ? 0: this.discAmount.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("  invno: ").append(invno).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  dueDate: ").append(dueDate).append("\n");
    sb.append("  expenses: ").append(expenses).append("\n");
    sb.append("  interest: ").append(interest).append("\n");
    sb.append("  vat: ").append(vat).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  openAmount: ").append(openAmount).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  discPercent: ").append(discPercent).append("\n");
    sb.append("  discAmount: ").append(discAmount).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

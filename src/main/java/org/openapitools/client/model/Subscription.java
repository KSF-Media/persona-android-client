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

import java.util.*;
import java.util.Date;
import org.openapitools.client.model.DeliveryAddress;
import org.openapitools.client.model.ModelPackage;
import org.openapitools.client.model.PackageCampaign;
import org.openapitools.client.model.PausedSubscription;
import org.openapitools.client.model.PendingAddressChange;
import org.openapitools.client.model.SubscriptionDates;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Subscription {
  
  @SerializedName("subsno")
  private Integer subsno = null;
  @SerializedName("extno")
  private Integer extno = null;
  @SerializedName("cusno")
  private Integer cusno = null;
  @SerializedName("paycusno")
  private Integer paycusno = null;
  public enum KindEnum {
     StandingOrder,  TimeLimitedOrder,  NewsStandOrder,  FreeOrder,  Testing1,  Testing2, 
  };
  @SerializedName("kind")
  private KindEnum kind = null;
  public enum StateEnum {
     Upcoming,  Active,  Paused,  Ended,  UnpaidAndCanceled,  Canceled,  CanceledWithLatePayment,  RestartedAfterLatePayment,  DeactivatedRecently,  Unknown, 
  };
  @SerializedName("state")
  private StateEnum state = null;
  public enum PricegroupEnum {
     Normal,  Campaign,  Flex,  Company,  CompanyFlex,  Student,  HBL365Discount, 
  };
  @SerializedName("pricegroup")
  private PricegroupEnum pricegroup = null;
  @SerializedName("package")
  private ModelPackage _package = null;
  @SerializedName("dates")
  private SubscriptionDates dates = null;
  @SerializedName("extsubsexists")
  private Boolean extsubsexists = null;
  @SerializedName("campaign")
  private PackageCampaign campaign = null;
  @SerializedName("paused")
  private List<PausedSubscription> paused = null;
  @SerializedName("receiver")
  private String receiver = null;
  @SerializedName("deliveryAddress")
  private DeliveryAddress deliveryAddress = null;
  @SerializedName("pendingAddressChanges")
  private List<PendingAddressChange> pendingAddressChanges = null;
  @SerializedName("orderNumber")
  private String orderNumber = null;
  public enum PaymentMethodEnum {
     PaperInvoice,  CreditCard,  Email,  NetBank,  ElectronicInvoice,  DirectPayment,  Klarna,  UnknownPaymentMethod, 
  };
  @SerializedName("paymentMethod")
  private PaymentMethodEnum paymentMethod = null;
  @SerializedName("paymentMethodId")
  private Integer paymentMethodId = null;
  @SerializedName("deliveryTroubleEnd")
  private Date deliveryTroubleEnd = null;

  /**
   * Subscription Id - primary key together with extno
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "Subscription Id - primary key together with extno")
  public Integer getSubsno() {
    return subsno;
  }
  public void setSubsno(Integer subsno) {
    this.subsno = subsno;
  }

  /**
   * Subscription Extension Id - how many times a subscription has been extended
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "Subscription Extension Id - how many times a subscription has been extended")
  public Integer getExtno() {
    return extno;
  }
  public void setExtno(Integer extno) {
    this.extno = extno;
  }

  /**
   * Customer getting the subscription
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "Customer getting the subscription")
  public Integer getCusno() {
    return cusno;
  }
  public void setCusno(Integer cusno) {
    this.cusno = cusno;
  }

  /**
   * Customer paying for the subscription
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "Customer paying for the subscription")
  public Integer getPaycusno() {
    return paycusno;
  }
  public void setPaycusno(Integer paycusno) {
    this.paycusno = paycusno;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public KindEnum getKind() {
    return kind;
  }
  public void setKind(KindEnum kind) {
    this.kind = kind;
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
   **/
  @ApiModelProperty(value = "")
  public PricegroupEnum getPricegroup() {
    return pricegroup;
  }
  public void setPricegroup(PricegroupEnum pricegroup) {
    this.pricegroup = pricegroup;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ModelPackage getPackage() {
    return _package;
  }
  public void setPackage(ModelPackage _package) {
    this._package = _package;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SubscriptionDates getDates() {
    return dates;
  }
  public void setDates(SubscriptionDates dates) {
    this.dates = dates;
  }

  /**
   * If the extension of this subscription exists
   **/
  @ApiModelProperty(required = true, value = "If the extension of this subscription exists")
  public Boolean getExtsubsexists() {
    return extsubsexists;
  }
  public void setExtsubsexists(Boolean extsubsexists) {
    this.extsubsexists = extsubsexists;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PackageCampaign getCampaign() {
    return campaign;
  }
  public void setCampaign(PackageCampaign campaign) {
    this.campaign = campaign;
  }

  /**
   * Pause periods of this subscription
   **/
  @ApiModelProperty(value = "Pause periods of this subscription")
  public List<PausedSubscription> getPaused() {
    return paused;
  }
  public void setPaused(List<PausedSubscription> paused) {
    this.paused = paused;
  }

  /**
   * The name of subscription receiver
   **/
  @ApiModelProperty(value = "The name of subscription receiver")
  public String getReceiver() {
    return receiver;
  }
  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DeliveryAddress getDeliveryAddress() {
    return deliveryAddress;
  }
  public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   * Pending and ongoing temporary address changes
   **/
  @ApiModelProperty(value = "Pending and ongoing temporary address changes")
  public List<PendingAddressChange> getPendingAddressChanges() {
    return pendingAddressChanges;
  }
  public void setPendingAddressChanges(List<PendingAddressChange> pendingAddressChanges) {
    this.pendingAddressChanges = pendingAddressChanges;
  }

  /**
   * Order number of subscription
   **/
  @ApiModelProperty(value = "Order number of subscription")
  public String getOrderNumber() {
    return orderNumber;
  }
  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(value = "")
  public Integer getPaymentMethodId() {
    return paymentMethodId;
  }
  public void setPaymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDeliveryTroubleEnd() {
    return deliveryTroubleEnd;
  }
  public void setDeliveryTroubleEnd(Date deliveryTroubleEnd) {
    this.deliveryTroubleEnd = deliveryTroubleEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return (this.subsno == null ? subscription.subsno == null : this.subsno.equals(subscription.subsno)) &&
        (this.extno == null ? subscription.extno == null : this.extno.equals(subscription.extno)) &&
        (this.cusno == null ? subscription.cusno == null : this.cusno.equals(subscription.cusno)) &&
        (this.paycusno == null ? subscription.paycusno == null : this.paycusno.equals(subscription.paycusno)) &&
        (this.kind == null ? subscription.kind == null : this.kind.equals(subscription.kind)) &&
        (this.state == null ? subscription.state == null : this.state.equals(subscription.state)) &&
        (this.pricegroup == null ? subscription.pricegroup == null : this.pricegroup.equals(subscription.pricegroup)) &&
        (this._package == null ? subscription._package == null : this._package.equals(subscription._package)) &&
        (this.dates == null ? subscription.dates == null : this.dates.equals(subscription.dates)) &&
        (this.extsubsexists == null ? subscription.extsubsexists == null : this.extsubsexists.equals(subscription.extsubsexists)) &&
        (this.campaign == null ? subscription.campaign == null : this.campaign.equals(subscription.campaign)) &&
        (this.paused == null ? subscription.paused == null : this.paused.equals(subscription.paused)) &&
        (this.receiver == null ? subscription.receiver == null : this.receiver.equals(subscription.receiver)) &&
        (this.deliveryAddress == null ? subscription.deliveryAddress == null : this.deliveryAddress.equals(subscription.deliveryAddress)) &&
        (this.pendingAddressChanges == null ? subscription.pendingAddressChanges == null : this.pendingAddressChanges.equals(subscription.pendingAddressChanges)) &&
        (this.orderNumber == null ? subscription.orderNumber == null : this.orderNumber.equals(subscription.orderNumber)) &&
        (this.paymentMethod == null ? subscription.paymentMethod == null : this.paymentMethod.equals(subscription.paymentMethod)) &&
        (this.paymentMethodId == null ? subscription.paymentMethodId == null : this.paymentMethodId.equals(subscription.paymentMethodId)) &&
        (this.deliveryTroubleEnd == null ? subscription.deliveryTroubleEnd == null : this.deliveryTroubleEnd.equals(subscription.deliveryTroubleEnd));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.subsno == null ? 0: this.subsno.hashCode());
    result = 31 * result + (this.extno == null ? 0: this.extno.hashCode());
    result = 31 * result + (this.cusno == null ? 0: this.cusno.hashCode());
    result = 31 * result + (this.paycusno == null ? 0: this.paycusno.hashCode());
    result = 31 * result + (this.kind == null ? 0: this.kind.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.pricegroup == null ? 0: this.pricegroup.hashCode());
    result = 31 * result + (this._package == null ? 0: this._package.hashCode());
    result = 31 * result + (this.dates == null ? 0: this.dates.hashCode());
    result = 31 * result + (this.extsubsexists == null ? 0: this.extsubsexists.hashCode());
    result = 31 * result + (this.campaign == null ? 0: this.campaign.hashCode());
    result = 31 * result + (this.paused == null ? 0: this.paused.hashCode());
    result = 31 * result + (this.receiver == null ? 0: this.receiver.hashCode());
    result = 31 * result + (this.deliveryAddress == null ? 0: this.deliveryAddress.hashCode());
    result = 31 * result + (this.pendingAddressChanges == null ? 0: this.pendingAddressChanges.hashCode());
    result = 31 * result + (this.orderNumber == null ? 0: this.orderNumber.hashCode());
    result = 31 * result + (this.paymentMethod == null ? 0: this.paymentMethod.hashCode());
    result = 31 * result + (this.paymentMethodId == null ? 0: this.paymentMethodId.hashCode());
    result = 31 * result + (this.deliveryTroubleEnd == null ? 0: this.deliveryTroubleEnd.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("  subsno: ").append(subsno).append("\n");
    sb.append("  extno: ").append(extno).append("\n");
    sb.append("  cusno: ").append(cusno).append("\n");
    sb.append("  paycusno: ").append(paycusno).append("\n");
    sb.append("  kind: ").append(kind).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  pricegroup: ").append(pricegroup).append("\n");
    sb.append("  _package: ").append(_package).append("\n");
    sb.append("  dates: ").append(dates).append("\n");
    sb.append("  extsubsexists: ").append(extsubsexists).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  paused: ").append(paused).append("\n");
    sb.append("  receiver: ").append(receiver).append("\n");
    sb.append("  deliveryAddress: ").append(deliveryAddress).append("\n");
    sb.append("  pendingAddressChanges: ").append(pendingAddressChanges).append("\n");
    sb.append("  orderNumber: ").append(orderNumber).append("\n");
    sb.append("  paymentMethod: ").append(paymentMethod).append("\n");
    sb.append("  paymentMethodId: ").append(paymentMethodId).append("\n");
    sb.append("  deliveryTroubleEnd: ").append(deliveryTroubleEnd).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

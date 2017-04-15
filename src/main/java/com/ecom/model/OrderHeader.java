package com.ecom.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the orderheader database table.
 * 
 */
@Entity
@NamedQuery(name="OrderHeader.findAll", query="SELECT o FROM OrderHeader o")
public class OrderHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;

	@Column(name="coupon_code")
	private String couponCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	private Date lastUpdated;

	private String notes;

	private String paymethod;

	@Column(name="shipping_cost")
	private double shippingCost;

	private String status;

	private double total;

	//bi-directional many-to-one association to Address
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="billto_address")
	private Address address1;

	//bi-directional many-to-one association to Address
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="shipto_address")
	private Address address2;

	//bi-directional many-to-one association to User
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to OrderLine
	@OneToMany(mappedBy="orderheader", cascade = CascadeType.PERSIST)
	private List<OrderLine> orderlines;

	public OrderHeader() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPaymethod() {
		return this.paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}

	public double getShippingCost() {
		return this.shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Address getAddress1() {
		return this.address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public Address getAddress2() {
		return this.address2;
	}

	public void setAddress2(Address address2) {
		this.address2 = address2;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderLine> getOrderlines() {
		return this.orderlines;
	}

	public void setOrderlines(List<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}

	public OrderLine addOrderline(OrderLine orderline) {
		getOrderlines().add(orderline);
		orderline.setOrderheader(this);

		return orderline;
	}

	public OrderLine removeOrderline(OrderLine orderline) {
		getOrderlines().remove(orderline);
		orderline.setOrderheader(null);

		return orderline;
	}

}
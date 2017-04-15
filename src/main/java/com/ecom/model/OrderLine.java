package com.ecom.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the orderline database table.
 * 
 */
@Entity
@NamedQuery(name="OrderLine.findAll", query="SELECT o FROM OrderLine o")
public class OrderLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderline_id")
	private int orderlineId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	private Date lastUpdated;

	@Column(name="orderline_price")
	private double orderlinePrice;

	@Column(name="orderline_total_price")
	private double orderlineTotalPrice;

	@Column(name="product_name")
	private String productName;

	private int qty;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="order_id")
	private OrderHeader orderheader;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public OrderLine() {
	}

	public int getOrderlineId() {
		return this.orderlineId;
	}

	public void setOrderlineId(int orderlineId) {
		this.orderlineId = orderlineId;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public double getOrderlinePrice() {
		return this.orderlinePrice;
	}

	public void setOrderlinePrice(double orderlinePrice) {
		this.orderlinePrice = orderlinePrice;
	}

	public double getOrderlineTotalPrice() {
		return this.orderlineTotalPrice;
	}

	public void setOrderlineTotalPrice(double orderlineTotalPrice) {
		this.orderlineTotalPrice = orderlineTotalPrice;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public OrderHeader getOrderheader() {
		return this.orderheader;
	}

	public void setOrderheader(OrderHeader orderheader) {
		this.orderheader = orderheader;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
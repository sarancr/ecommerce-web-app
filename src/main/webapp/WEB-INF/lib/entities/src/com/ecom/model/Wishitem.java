package com.ecom.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the wishitem database table.
 * 
 */
@Entity
@NamedQuery(name="Wishitem.findAll", query="SELECT w FROM Wishitem w")
public class Wishitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="wishitem_id")
	private int wishitemId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	private Date lastUpdated;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Wishitem() {
	}

	public int getWishitemId() {
		return this.wishitemId;
	}

	public void setWishitemId(int wishitemId) {
		this.wishitemId = wishitemId;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
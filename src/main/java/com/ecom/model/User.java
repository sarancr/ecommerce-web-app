package com.ecom.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	private String email;

	private String firstname;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	private Date lastUpdated;

	private String lastname;

	private String password;

	private String phone;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="user")
	private List<Address> addresses;

	//bi-directional many-to-one association to OrderHeader
	@OneToMany(mappedBy="user")
	private List<OrderHeader> orderheaders;

	//bi-directional many-to-one association to WishItem
	@OneToMany(mappedBy="user")
	private List<WishItem> wishitems;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setUser(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setUser(null);

		return address;
	}

	public List<OrderHeader> getOrderheaders() {
		return this.orderheaders;
	}

	public void setOrderheaders(List<OrderHeader> orderheaders) {
		this.orderheaders = orderheaders;
	}

	public OrderHeader addOrderheader(OrderHeader orderheader) {
		getOrderheaders().add(orderheader);
		orderheader.setUser(this);

		return orderheader;
	}

	public OrderHeader removeOrderheader(OrderHeader orderheader) {
		getOrderheaders().remove(orderheader);
		orderheader.setUser(null);

		return orderheader;
	}

	public List<WishItem> getWishitems() {
		return this.wishitems;
	}

	public void setWishitems(List<WishItem> wishitems) {
		this.wishitems = wishitems;
	}

	public WishItem addWishitem(WishItem wishitem) {
		getWishitems().add(wishitem);
		wishitem.setUser(this);

		return wishitem;
	}

	public WishItem removeWishitem(WishItem wishitem) {
		getWishitems().remove(wishitem);
		wishitem.setUser(null);

		return wishitem;
	}

}
package com.ecom.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="address_id")
	private int addressId;

	private String address1;

	private String address2;

	private String city;

	@Column(name="company_name")
	private String companyName;

	private String country;

	private String county;

	private String email;

	private String firstname;

	private String lastname;

	private String phone;

	private int type;

	private String zip;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="address1")
	private List<Order> orders1;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="address2")
	private List<Order> orders2;

	public Address() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
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

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order> getOrders1() {
		return this.orders1;
	}

	public void setOrders1(List<Order> orders1) {
		this.orders1 = orders1;
	}

	public Order addOrders1(Order orders1) {
		getOrders1().add(orders1);
		orders1.setAddress1(this);

		return orders1;
	}

	public Order removeOrders1(Order orders1) {
		getOrders1().remove(orders1);
		orders1.setAddress1(null);

		return orders1;
	}

	public List<Order> getOrders2() {
		return this.orders2;
	}

	public void setOrders2(List<Order> orders2) {
		this.orders2 = orders2;
	}

	public Order addOrders2(Order orders2) {
		getOrders2().add(orders2);
		orders2.setAddress2(this);

		return orders2;
	}

	public Order removeOrders2(Order orders2) {
		getOrders2().remove(orders2);
		orders2.setAddress2(null);

		return orders2;
	}

}
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

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to OrderHeader
	@OneToMany(mappedBy="address1", cascade = CascadeType.PERSIST)
	private List<OrderHeader> orderheaders1;

	//bi-directional many-to-one association to OrderHeader
	@OneToMany(mappedBy="address2", cascade = CascadeType.PERSIST)
	private List<OrderHeader> orderheaders2;

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

	public List<OrderHeader> getOrderheaders1() {
		return this.orderheaders1;
	}

	public void setOrderheaders1(List<OrderHeader> orderheaders1) {
		this.orderheaders1 = orderheaders1;
	}

	public OrderHeader addOrderheaders1(OrderHeader orderheaders1) {
		getOrderheaders1().add(orderheaders1);
		orderheaders1.setAddress1(this);

		return orderheaders1;
	}

	public OrderHeader removeOrderheaders1(OrderHeader orderheaders1) {
		getOrderheaders1().remove(orderheaders1);
		orderheaders1.setAddress1(null);

		return orderheaders1;
	}

	public List<OrderHeader> getOrderheaders2() {
		return this.orderheaders2;
	}

	public void setOrderheaders2(List<OrderHeader> orderheaders2) {
		this.orderheaders2 = orderheaders2;
	}

	public OrderHeader addOrderheaders2(OrderHeader orderheaders2) {
		getOrderheaders2().add(orderheaders2);
		orderheaders2.setAddress2(this);

		return orderheaders2;
	}

	public OrderHeader removeOrderheaders2(OrderHeader orderheaders2) {
		getOrderheaders2().remove(orderheaders2);
		orderheaders2.setAddress2(null);

		return orderheaders2;
	}

}
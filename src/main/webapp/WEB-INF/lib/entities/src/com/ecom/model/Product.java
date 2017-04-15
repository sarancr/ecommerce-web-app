package com.ecom.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_id")
	private int productId;

	private String description;

	@Column(name="img_url")
	private String imgUrl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	private Date lastUpdated;

	private double listprice;

	private String name;

	private double price;

	//bi-directional many-to-one association to Orderline
	@OneToMany(mappedBy="product")
	private List<Orderline> orderlines;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;

	//bi-directional many-to-one association to Review
	@OneToMany(mappedBy="product")
	private List<Review> reviews;

	//bi-directional many-to-one association to Wishitem
	@OneToMany(mappedBy="product")
	private List<Wishitem> wishitems;

	public Product() {
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public double getListprice() {
		return this.listprice;
	}

	public void setListprice(double listprice) {
		this.listprice = listprice;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Orderline> getOrderlines() {
		return this.orderlines;
	}

	public void setOrderlines(List<Orderline> orderlines) {
		this.orderlines = orderlines;
	}

	public Orderline addOrderline(Orderline orderline) {
		getOrderlines().add(orderline);
		orderline.setProduct(this);

		return orderline;
	}

	public Orderline removeOrderline(Orderline orderline) {
		getOrderlines().remove(orderline);
		orderline.setProduct(null);

		return orderline;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Review addReview(Review review) {
		getReviews().add(review);
		review.setProduct(this);

		return review;
	}

	public Review removeReview(Review review) {
		getReviews().remove(review);
		review.setProduct(null);

		return review;
	}

	public List<Wishitem> getWishitems() {
		return this.wishitems;
	}

	public void setWishitems(List<Wishitem> wishitems) {
		this.wishitems = wishitems;
	}

	public Wishitem addWishitem(Wishitem wishitem) {
		getWishitems().add(wishitem);
		wishitem.setProduct(this);

		return wishitem;
	}

	public Wishitem removeWishitem(Wishitem wishitem) {
		getWishitems().remove(wishitem);
		wishitem.setProduct(null);

		return wishitem;
	}

}
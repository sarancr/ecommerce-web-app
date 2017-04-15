package com.ecom.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the subscriber database table.
 * 
 */
@Entity
@NamedQuery(name="Subscriber.findAll", query="SELECT s FROM Subscriber s")
public class Subscriber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="subscriber_id")
	private int subscriberId;

	private int active;

	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	private Date lastUpdated;

	public Subscriber() {
	}

	public int getSubscriberId() {
		return this.subscriberId;
	}

	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
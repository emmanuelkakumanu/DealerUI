package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accessories")
public class Accessory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accessory_id")
	private long accessoryId;
	@Column(name = "accessory_name")
	private String accessoryName;
	@Column(name = "accessory_price")
	private long accessoryPrice;

	public Accessory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAccessoryId() {
		return accessoryId;
	}

	public void setAccessoryId(long accessoryId) {
		this.accessoryId = accessoryId;
	}

	public String getAccessoryName() {
		return accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	public long getAccessoryPrice() {
		return accessoryPrice;
	}

	public void setAccessoryPrice(long accessoryPrice) {
		this.accessoryPrice = accessoryPrice;
	}

	@Override
	public String toString() {
		return "Accessory [accessoryId=" + accessoryId + ", accessoryName=" + accessoryName + ", accessoryPrice="
				+ accessoryPrice + "]";
	}
}

package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "model_accessories")
public class CarModelAccessories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "model_accessory_id")
	private long id;

	@ManyToOne
	@JoinColumn(name = "model_id")

	private CarModels modelId;
	@ManyToOne
	@JoinColumn(name = "accessory_id")
	private Accessory accessoryId;

	public CarModelAccessories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CarModels getModelId() {
		return modelId;
	}

	public void setModelId(CarModels modelId) {
		this.modelId = modelId;
	}

	public Accessory getAccessoryId() {
		return accessoryId;
	}

	public void setAccessoryId(Accessory accessoryId) {
		this.accessoryId = accessoryId;
	}

	@Override
	public String toString() {
		return "CarModelAccessories [id=" + id + ", modelId=" + modelId + ", accessoryId=" + accessoryId + "]";
	}

}

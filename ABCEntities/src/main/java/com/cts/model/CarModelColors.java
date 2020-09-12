package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "model_colors")
public class CarModelColors {
	@Id
	@Column(name = "model_color_id")
	private long id;
	@ManyToOne
	@JoinColumn(name = "model_id")
	private CarModels modelId;
	@ManyToOne
	@JoinColumn(name = "color_id")
	private Color colorId;

	public CarModelColors() {
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

	public Color getColorId() {
		return colorId;
	}

	public void setColorId(Color colorId) {
		this.colorId = colorId;
	}

	@Override
	public String toString() {
		return "CarModelColors [id=" + id + ", modelId=" + modelId + ", colorId=" + colorId + "]";
	}

}

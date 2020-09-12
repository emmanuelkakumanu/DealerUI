package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "models")
public class CarModels {
	@Id
	@Column(name = "model_id")
	private long modelId;
	@Column(name = "model_name")
	private String modelName;
	@Column(name = "model_price")
	private long modelPrice;
	@Column(name = "series_id")
	private long seriesId;

	public CarModels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getModelId() {
		return modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public long getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(long modelPrice) {
		this.modelPrice = modelPrice;
	}

	public long getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(long seriesId) {
		this.seriesId = seriesId;
	}

	@Override
	public String toString() {
		return "CarModels [modelId=" + modelId + ", modelName=" + modelName + ", modelPrice=" + modelPrice
				+ ", seriesId=" + seriesId + "]";
	}

}

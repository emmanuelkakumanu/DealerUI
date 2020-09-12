package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colors")
public class Color {
	@Id
	@Column(name = "color_id")
	private long colorId;
	@Column(name = "color_name")
	private String colorName;
	@Column(name = "color_price")
	private long colorPrice;

	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getColorId() {
		return colorId;
	}

	public void setColorId(long colorId) {
		this.colorId = colorId;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public long getColorPrice() {
		return colorPrice;
	}

	public void setColorPrice(long colorPrice) {
		this.colorPrice = colorPrice;
	}

	@Override
	public String toString() {
		return "Color [colorId=" + colorId + ", colorName=" + colorName + ", colorPrice=" + colorPrice + "]";
	}

}

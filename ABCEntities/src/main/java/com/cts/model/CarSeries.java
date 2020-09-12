package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "series")
public class CarSeries {
	@Id
	@Column(name = "series_id")
	private long seriesId;
	@Column(name = "series_name")
	private String seriesName;

	public CarSeries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(long seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	@Override
	public String toString() {
		return "CarSeries [seriesId=" + seriesId + ", seriesName=" + seriesName + "]";
	}

}

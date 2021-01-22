package com.xworkz.mavenexampleDTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike_db")

public class BikeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="BIKE_ID")
	private int BIKE_ID;
	@Column(name="B_NAME")

	private String B_NAME;
	@Column(name="B-COST")

	private int B_COST;
	@Column(name="B_COLOR")

	private String B_COLOR;
	@Column(name="B_CLUCH")

	private boolean B_CLUCH;
	
	
	
	
	
	
	public BikeDTO(String b_NAME, int b_COST, String b_COLOR, boolean b_CLUCH) {
		super();
		B_NAME = b_NAME;
		B_COST = b_COST;
		B_COLOR = b_COLOR;
		B_CLUCH = b_CLUCH;
	}
	public int getBike_id() {
		return BIKE_ID;
	}
	public void setBike_id(int bike_id) {
		BIKE_ID = bike_id;
	}
	public String getB_NAME() {
		return B_NAME;
	}
	public void setB_NAME(String b_NAME) {
		B_NAME = b_NAME;
	}
	public int getB_COST() {
		return B_COST;
	}
	public void setB_COST(int b_COST) {
		B_COST = b_COST;
	}
	public String getB_COLOR() {
		return B_COLOR;
	}
	public void setB_COLOR(String b_COLOR) {
		B_COLOR = b_COLOR;
	}
	public boolean isB_CLUCH() {
		return B_CLUCH;
	}
	public void setB_CLUCH(boolean b_CLUCH) {
		B_CLUCH = b_CLUCH;
	}
	@Override
	public String toString() {
		return "BikeDTO [BIKE_ID=" + BIKE_ID + ", B_NAME=" + B_NAME + ", B_COST=" + B_COST + ", B_COLOR=" + B_COLOR
				+ ", B_CLUCH=" + B_CLUCH + "]";
	}

	

}

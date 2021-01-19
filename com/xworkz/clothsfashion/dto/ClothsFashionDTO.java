package com.xworkz.clothsfashion.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cloths_Fashion")
public class ClothsFashionDTO implements java.io.Serializable  {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CLOTH_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int clothId;
	@Column(name="C_TYPE")

	private String type;
	@Column(name="C_COLOR")

	private String color;
	@Column(name="C_IS_DENIM")

	private boolean isDenim;
	@Column(name="C_COST")

	private double cost;
	@Column(name="C_SIZE")

	private char size;
	
	
	
	public int getClothId() {
		return clothId;
	}
	public void setClothId(int clothId) {
		this.clothId = clothId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isDenim() {
		return isDenim;
	}
	public void setDenim(boolean isDenim) {
		this.isDenim = isDenim;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public ClothsFashionDTO(String type, String color, boolean isDenim, double cost, char size) {
		super();
		this.type = type;
		this.color = color;
		this.isDenim = isDenim;
		this.cost = cost;
		this.size = size;
	}
	@Override
	public String toString() {
		return "ClothsFashionDTO [clothId=" + clothId + ", type=" + type + ", color=" + color + ", isDenim=" + isDenim
				+ ", cost=" + cost + ", size=" + size + "]";
	}
	
	
	

}

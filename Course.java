package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class Course {
	
	
	private String  loadingPoint;
	private String  unloadingPoint;
	private String  productType;
	private String  truckType;
	private int     noOfTrucks;
	private long   weight;
	@Id
	private String  shipperId;
	private String  Date;
	private String  comment;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	//default constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public Course(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
			long weight, String shipperId, String date, String comment) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipperId = shipperId;
		this.Date = date;
		this.comment=comment;
	}


	@Override
	public String toString() {
		return "Course [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", shipperId=" + shipperId + ", Date=" + Date + ", comment=" + comment + ", getComment()="
				+ getComment() + ", getLoadingPoint()=" + getLoadingPoint() + ", getUnloadingPoint()="
				+ getUnloadingPoint() + ", getProductType()=" + getProductType() + ", getTruckType()=" + getTruckType()
				+ ", getNoOfTrucks()=" + getNoOfTrucks() + ", getWeight()=" + getWeight() + ", getShipperId()="
				+ getShipperId() + ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	

}

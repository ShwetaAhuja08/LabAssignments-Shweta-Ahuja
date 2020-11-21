package com.cg.training.lab4.Exercise3.service;

public abstract class Item {
private Long identificationNumber;
private String title;
private Integer numberOfCopies;

public abstract void addItem();
public abstract void print();
public abstract void checkIn();
public abstract void checkOut();
public abstract void equals();

public Item() {
	super();
}


public Item(Long identificationNumber, String title, Integer numberOfCopies) {
	super();
	this.identificationNumber = identificationNumber;
	this.title = title;
	this.numberOfCopies = numberOfCopies;
}


public Long getIdentificationNumber() {
	return identificationNumber;
}
public void setIdentificationNumber(Long identificationNumber) {
	this.identificationNumber = identificationNumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Integer getNumberOfCopies() {
	return numberOfCopies;
}
public void setNumberOfCopies(Integer numberOfCopies) {
	this.numberOfCopies = numberOfCopies;
}


@Override
public String toString() {
	return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="
			+ numberOfCopies + "]";
}




}

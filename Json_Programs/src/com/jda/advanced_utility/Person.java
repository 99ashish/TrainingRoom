package com.jda.advanced_utility;
public class Person {
private String firstName;
private String lastName;
private String address;
private String city;
private String state;
private long  mobileNumber;
private int  zipCode;
public String getFirstName() {
	return firstName;
}
public Person setFirstName(String firstName) {
	this.firstName = firstName;
	return this;
}
public String getLastName() {
	return lastName;
}
public Person setLastName(String lastName) {
	this.lastName = lastName;
	return this;
}
public String getAddress() {
	return address;
}
public Person setAddress(String address) {
	this.address = address;
	return this;
}
public long getMobileNumber() {
	return mobileNumber;
}
public Person setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
	return this;
}
public int getZipCode() {
	return zipCode;
}
public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
}

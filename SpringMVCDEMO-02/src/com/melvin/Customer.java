package com.melvin;

import java.util.LinkedHashMap;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private LinkedHashMap<String, String> countrylist;
	private LinkedHashMap<String,String>favcusinelist;
	@NotNull(message="Required field")
	//@Size(min = 3, message="the name should have minimium 3 character")
	
	@Pattern(regexp = "[a-zA-Z ]+",message="Name can only have apbhabets")
	//@NotEmpty(message="REQUIRED FIELD")
	private String name;
	private String country;
	private String favcusine;
	@NotEmpty(message="Required field")
	private String book[];
	
	
	@Min(value = 1,message="cannot be lessthan zero")
	private int discountcoupon;

	
	Customer(){
		
		countrylist=new LinkedHashMap<String,String>();
		favcusinelist=new LinkedHashMap<String,String>();
		countrylist.put("IND", "INDIA");
		countrylist.put("AUS", "AUSTRALIA");
		countrylist.put("ARG", "ARGENTINA");
		favcusinelist.put("punjab", "punjabi");
		favcusinelist.put("malabari", "malabari");
		favcusinelist.put("chinise", "chinise");
	}

	public LinkedHashMap<String, String> getFavcusinelist() {
		return favcusinelist;
	}

	public String[] getBook() {
		return book;
	}

	public void setBook(String[] book) {
		this.book = book;
	}
	public void setFavcusinelist(LinkedHashMap<String, String> favcusinelist) {
		this.favcusinelist = favcusinelist;
	}

	public LinkedHashMap<String, String> getCountrylist() {
		return countrylist;
	}

	public void setCountrylist(LinkedHashMap<String, String> countrylist) {
		this.countrylist = countrylist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public String getFavcusine() {
		return favcusine;
	}

	public void setFavcusine(String favcusine) {
		this.favcusine = favcusine;
	}

	public int getDiscountcoupon() {
		return discountcoupon;
	}

	public void setDiscountcoupon(int discountcoupon) {
		this.discountcoupon = discountcoupon;
	}
	
}

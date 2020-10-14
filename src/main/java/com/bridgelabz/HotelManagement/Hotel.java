package com.bridgelabz.HotelManagement;

import java.util.Date;
import java.util.Objects;

public class Hotel {

	private String Name;
	private Employee Emp;
	private Date date;
	private String Customer;
	private double Weekend_Rates;
	private double Rates;
	private double Rating;
	private Double totalRates;
	private double rewardWeekend_Rates;
	private double rewardRates;

	public Hotel(String Name, double Rates, Date date) {

		this.Name = Name;
		this.Rates = Rates;
		this.date = date;
	}

	public Hotel(String Name, double Rates, double Weekend_Rates, Date date) {

		this.Name = Name;
		this.Rates = Rates;
		this.date = date;
		this.Weekend_Rates = Weekend_Rates;
	}
	
	public Hotel(String Name, double Rates, double Weekend_Rates, Date date,double Rating) {

		this.Name = Name;
		this.Rates = Rates;
		this.date = date;
		this.Weekend_Rates = Weekend_Rates;
		this.Rating = Rating;
	}

	public double getRates() {
		return Rates;
	}

	public void setRates(double Rates) {
		this.Rates = Rates;
	}
	
	public double getWeekendRates() {
		return Weekend_Rates;
	}

	public void setWeekendRates(double Weekend_Rates) {
		this.Weekend_Rates = Weekend_Rates;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalRates() {
		return totalRates;
	}

	public void setTotalRates(Double totalRates) {
		this.totalRates = totalRates;
	}

}

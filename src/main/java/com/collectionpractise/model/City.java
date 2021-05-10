package com.collectionpractise.model;

public class City implements Comparable<City> {

	private String cityName;
	private Integer pinCode;
	private Integer polulation;

	public String getCityName() {
		return cityName;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String cityName, Integer pinCode, Integer polulation) {
		super();
		this.cityName = cityName;
		this.pinCode = pinCode;
		this.polulation = polulation;
	}

	@Override
	public String toString() {
		return "\ncityName=" + cityName + ", pinCode=" + pinCode + ", polulation=" + polulation + "\n";
	}

	
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		if (polulation> o.polulation) {
			return 1;
		} else if (polulation < o.polulation) {
			return -1;
		} else {
			return 0;
		}
	}

}

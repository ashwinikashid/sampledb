package com.collectionpractise.model;

import java.util.TreeSet;

import com.collectionpractise.model.City;

public class State {

	private String stateName;
	private String capital;
	private TreeSet<City> cityList;

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(String stateName, String capital, TreeSet<City> cityListOfMaharashtra) {
		super();
		this.stateName = stateName;
		this.capital = capital;
		this.cityList = cityListOfMaharashtra;
	}


	public TreeSet<City> getCityList() {
		return cityList;
	}

	public String getStateName() {
		return stateName;
	}

	@Override
	public String toString() {
		return "\ncapital=" + capital + ", \ncityList=" + cityList + "\n";
	}
}

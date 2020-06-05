package com.vento.footballleagueapplication.activties.teamDetails.model;

import com.google.gson.annotations.SerializedName;

public class SquadItem{

	@SerializedName("role")
	private String role;

	@SerializedName("nationality")
	private String nationality;

	@SerializedName("countryOfBirth")
	private String countryOfBirth;

	@SerializedName("shirtNumber")
	private int shirtNumber;

	@SerializedName("name")
	private String name;

	@SerializedName("dateOfBirth")
	private String dateOfBirth;

	@SerializedName("id")
	private int id;

	@SerializedName("position")
	private String position;

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setNationality(String nationality){
		this.nationality = nationality;
	}

	public String getNationality(){
		return nationality;
	}

	public void setCountryOfBirth(String countryOfBirth){
		this.countryOfBirth = countryOfBirth;
	}

	public String getCountryOfBirth(){
		return countryOfBirth;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return position;
	}

	@Override
 	public String toString(){
		return 
			"SquadItem{" + 
			"role = '" + role + '\'' + 
			",nationality = '" + nationality + '\'' + 
			",countryOfBirth = '" + countryOfBirth + '\'' + 
			",shirtNumber = '" + shirtNumber + '\'' + 
			",name = '" + name + '\'' + 
			",dateOfBirth = '" + dateOfBirth + '\'' + 
			",id = '" + id + '\'' + 
			",position = '" + position + '\'' + 
			"}";
		}
}
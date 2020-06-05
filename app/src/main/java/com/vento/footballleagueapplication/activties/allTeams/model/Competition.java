package com.vento.footballleagueapplication.activties.allTeams.model;

import com.google.gson.annotations.SerializedName;

public class Competition{

	@SerializedName("area")
	private Area area;

	@SerializedName("lastUpdated")
	private String lastUpdated;

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("plan")
	private String plan;

	public Area getArea(){
		return area;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getPlan(){
		return plan;
	}
}
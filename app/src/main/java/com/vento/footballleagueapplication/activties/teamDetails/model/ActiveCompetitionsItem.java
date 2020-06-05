package com.vento.footballleagueapplication.activties.teamDetails.model;

import com.google.gson.annotations.SerializedName;

public class ActiveCompetitionsItem{

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

	public void setArea(Area area){
		this.area = area;
	}

	public Area getArea(){
		return area;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPlan(String plan){
		this.plan = plan;
	}

	public String getPlan(){
		return plan;
	}

	@Override
 	public String toString(){
		return 
			"ActiveCompetitionsItem{" + 
			"area = '" + area + '\'' + 
			",lastUpdated = '" + lastUpdated + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",plan = '" + plan + '\'' + 
			"}";
		}
}
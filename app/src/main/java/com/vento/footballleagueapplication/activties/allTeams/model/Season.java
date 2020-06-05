package com.vento.footballleagueapplication.activties.allTeams.model;

import com.google.gson.annotations.SerializedName;

public class Season{

	@SerializedName("winner")
	private Object winner;

	@SerializedName("currentMatchday")
	private int currentMatchday;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("id")
	private int id;

	@SerializedName("startDate")
	private String startDate;

	public Object getWinner(){
		return winner;
	}

	public int getCurrentMatchday(){
		return currentMatchday;
	}

	public String getEndDate(){
		return endDate;
	}

	public int getId(){
		return id;
	}

	public String getStartDate(){
		return startDate;
	}
}
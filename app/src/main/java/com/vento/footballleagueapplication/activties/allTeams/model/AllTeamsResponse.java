package com.vento.footballleagueapplication.activties.allTeams.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AllTeamsResponse{

	@SerializedName("teams")
	private List<TeamsItem> teams;

	@SerializedName("count")
	private int count;

	@SerializedName("season")
	private Season season;

	@SerializedName("competition")
	private Competition competition;

	@SerializedName("filters")
	private Filters filters;

	public List<TeamsItem> getTeams(){
		return teams;
	}

	public int getCount(){
		return count;
	}

	public Season getSeason(){
		return season;
	}

	public Competition getCompetition(){
		return competition;
	}

	public Filters getFilters(){
		return filters;
	}

	public void setTeams(List<TeamsItem> teams) {
		this.teams = teams;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public void setFilters(Filters filters) {
		this.filters = filters;
	}
}
package com.vento.footballleagueapplication.activties.teamDetails.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TeamPlayersResponse{

	@SerializedName("area")
	private Area area;

	@SerializedName("venue")
	private String venue;

	@SerializedName("website")
	private String website;

	@SerializedName("address")
	private String address;

	@SerializedName("crestUrl")
	private String crestUrl;

	@SerializedName("tla")
	private String tla;

	@SerializedName("founded")
	private int founded;

	@SerializedName("lastUpdated")
	private String lastUpdated;

	@SerializedName("clubColors")
	private String clubColors;

	@SerializedName("squad")
	private List<SquadItem> squad;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("activeCompetitions")
	private List<ActiveCompetitionsItem> activeCompetitions;

	@SerializedName("id")
	private int id;

	@SerializedName("shortName")
	private String shortName;

	@SerializedName("email")
	private String email;

	public void setArea(Area area){
		this.area = area;
	}

	public Area getArea(){
		return area;
	}

	public void setVenue(String venue){
		this.venue = venue;
	}

	public String getVenue(){
		return venue;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setCrestUrl(String crestUrl){
		this.crestUrl = crestUrl;
	}

	public String getCrestUrl(){
		return crestUrl;
	}

	public void setTla(String tla){
		this.tla = tla;
	}

	public String getTla(){
		return tla;
	}

	public void setFounded(int founded){
		this.founded = founded;
	}

	public int getFounded(){
		return founded;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setClubColors(String clubColors){
		this.clubColors = clubColors;
	}

	public String getClubColors(){
		return clubColors;
	}

	public void setSquad(List<SquadItem> squad){
		this.squad = squad;
	}

	public List<SquadItem> getSquad(){
		return squad;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setActiveCompetitions(List<ActiveCompetitionsItem> activeCompetitions){
		this.activeCompetitions = activeCompetitions;
	}

	public List<ActiveCompetitionsItem> getActiveCompetitions(){
		return activeCompetitions;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setShortName(String shortName){
		this.shortName = shortName;
	}

	public String getShortName(){
		return shortName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"TeamPlayersResponse{" + 
			"area = '" + area + '\'' + 
			",venue = '" + venue + '\'' + 
			",website = '" + website + '\'' + 
			",address = '" + address + '\'' + 
			",crestUrl = '" + crestUrl + '\'' + 
			",tla = '" + tla + '\'' + 
			",founded = '" + founded + '\'' + 
			",lastUpdated = '" + lastUpdated + '\'' + 
			",clubColors = '" + clubColors + '\'' + 
			",squad = '" + squad + '\'' + 
			",phone = '" + phone + '\'' + 
			",name = '" + name + '\'' + 
			",activeCompetitions = '" + activeCompetitions + '\'' + 
			",id = '" + id + '\'' + 
			",shortName = '" + shortName + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}
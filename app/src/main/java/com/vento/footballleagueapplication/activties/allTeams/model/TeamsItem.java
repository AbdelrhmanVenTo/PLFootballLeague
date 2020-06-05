package com.vento.footballleagueapplication.activties.allTeams.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
@Entity
public class TeamsItem{

	@Ignore
	@SerializedName("area")
	private Area area;

	@ColumnInfo
	@SerializedName("venue")
	private String venue;

	@ColumnInfo
	@SerializedName("website")
	private String website;

	@ColumnInfo
	@SerializedName("address")
	private String address;

	@ColumnInfo
	@SerializedName("crestUrl")
	private String crestUrl;

	@ColumnInfo
	@SerializedName("tla")
	private String tla;

	@ColumnInfo
	@SerializedName("founded")
	private int founded;

	@ColumnInfo
	@SerializedName("lastUpdated")
	private String lastUpdated;

	@ColumnInfo
	@SerializedName("clubColors")
	private String clubColors;

	@ColumnInfo
	@SerializedName("phone")
	private String phone;

	@ColumnInfo
	@SerializedName("name")
	private String name;

	@NonNull
	@PrimaryKey
	@ColumnInfo
	@SerializedName("id")
	private int id;

	@ColumnInfo
	@SerializedName("shortName")
	private String shortName;

	@ColumnInfo
	@SerializedName("email")
	private String email;

	public TeamsItem() {
	}

	public Area getArea(){
		return area;
	}

	public String getVenue(){
		return venue;
	}

	public String getWebsite(){
		return website;
	}

	public String getAddress(){
		return address;
	}

	public String getCrestUrl(){
		return crestUrl;
	}

	public String getTla(){
		return tla;
	}

	public int getFounded(){
		return founded;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public String getClubColors(){
		return clubColors;
	}

	public String getPhone(){
		return phone;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getShortName(){
		return shortName;
	}

	public String getEmail(){
		return email;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCrestUrl(String crestUrl) {
		this.crestUrl = crestUrl;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

	public void setFounded(int founded) {
		this.founded = founded;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public void setClubColors(String clubColors) {
		this.clubColors = clubColors;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
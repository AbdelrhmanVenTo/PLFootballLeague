package com.vento.footballleagueapplication.activties.allTeams.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;
@Entity
public class Area{

	@ColumnInfo
	@SerializedName("name")
	private String name;

	@ColumnInfo
	@SerializedName("id")
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
}
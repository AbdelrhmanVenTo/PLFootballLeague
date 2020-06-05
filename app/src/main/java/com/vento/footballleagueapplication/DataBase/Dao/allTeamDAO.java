package com.vento.footballleagueapplication.DataBase.Dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.vento.footballleagueapplication.activties.allTeams.model.TeamsItem;

import java.util.List;

@Dao
public interface allTeamDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTeam(List<TeamsItem> teamsItems);


    @Query("select * from TeamsItem;")
    List<TeamsItem>getAllTeam();
}

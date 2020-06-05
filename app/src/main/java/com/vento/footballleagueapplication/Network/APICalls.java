package com.vento.footballleagueapplication.Network;

import com.vento.footballleagueapplication.activties.allTeams.model.AllTeamsResponse;
import com.vento.footballleagueapplication.activties.teamDetails.model.TeamPlayersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;


public interface APICalls {

    @GET("competitions/PL/teams")
    Call<AllTeamsResponse>ALL_TEAMS(@Header("X-Auth-Token") String Authorization);

    @GET("teams/{id}")
    Call<TeamPlayersResponse>TEAMS_PLAYERS(@Header("X-Auth-Token") String Authorization
                                        , @Path("id") int id);




    
}

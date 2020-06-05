package com.vento.footballleagueapplication.activties.teamDetails;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.vento.footballleagueapplication.DataBase.AppDataBase;
import com.vento.footballleagueapplication.Network.ApiManager;
import com.vento.footballleagueapplication.activties.allTeams.AllTeamViewModel;
import com.vento.footballleagueapplication.activties.allTeams.model.AllTeamsResponse;
import com.vento.footballleagueapplication.activties.allTeams.model.TeamsItem;
import com.vento.footballleagueapplication.activties.teamDetails.model.SquadItem;
import com.vento.footballleagueapplication.activties.teamDetails.model.TeamPlayersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeamDetailsViewModel extends AndroidViewModel {
    public MutableLiveData<TeamPlayersResponse> listMutableLiveData ;
    public MutableLiveData<Integer> errorMessage ;


    public TeamDetailsViewModel(@NonNull Application application) {
        super(application);
        listMutableLiveData = new MutableLiveData<>();
        errorMessage = new MutableLiveData<>();

    }

    public MutableLiveData<TeamPlayersResponse> getListMutableLiveData() {
        return listMutableLiveData;
    }

    public MutableLiveData<Integer> getErrorMessage() {
        return errorMessage;
    }

    public void getAllPlayers (String token ,int id){
        ApiManager.getAPIs().TEAMS_PLAYERS(token, id).enqueue(new Callback<TeamPlayersResponse>() {
            @Override
            public void onResponse(Call<TeamPlayersResponse> call, Response<TeamPlayersResponse> response) {
                if (response.isSuccessful()){
                    listMutableLiveData.postValue(response.body());

                } else {
                    errorMessage.postValue(1);
                }
            }

            @Override
            public void onFailure(Call<TeamPlayersResponse> call, Throwable t) {
                errorMessage.postValue(0);
            }
        });
    }



}

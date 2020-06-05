package com.vento.footballleagueapplication.activties.allTeams;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.vento.footballleagueapplication.DataBase.AppDataBase;
import com.vento.footballleagueapplication.Network.ApiManager;
import com.vento.footballleagueapplication.activties.allTeams.model.AllTeamsResponse;
import com.vento.footballleagueapplication.activties.allTeams.model.TeamsItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllTeamViewModel extends AndroidViewModel {
    public MutableLiveData<List<TeamsItem>> listMutableLiveData ;
    public MutableLiveData<Integer> errorMessage ;

    public AllTeamViewModel(@NonNull Application application) {
        super(application);
        listMutableLiveData = new MutableLiveData<>();
        errorMessage = new MutableLiveData<>();
    }

    public MutableLiveData<List<TeamsItem>> getListMutableLiveData() {
        return listMutableLiveData;
    }

    public MutableLiveData<Integer> getErrorMessage() {
        return errorMessage;
    }

    public void getAllTeamAPI (String token){
        ApiManager.getAPIs().ALL_TEAMS(token).enqueue(new Callback<AllTeamsResponse>() {
            @Override
            public void onResponse(Call<AllTeamsResponse> call, Response<AllTeamsResponse> response) {
                if (response.isSuccessful()){
                    listMutableLiveData.postValue(response.body().getTeams());
                        //insert new Articles to DB
                        InsertTeamToDataBase th =new InsertTeamToDataBase(response.body().getTeams());
                        th.start();

                    } else {
                        errorMessage.postValue(1);
                }
            }

            @Override
            public void onFailure(Call<AllTeamsResponse> call, Throwable t) {
                //get from DB
                GETTeamsFromDataBase th = new GETTeamsFromDataBase();
                th.start();
            }
        });
    }


    class InsertTeamToDataBase extends Thread{
        List<TeamsItem> itemsToInsert;

        public InsertTeamToDataBase(List<TeamsItem> items){
            itemsToInsert = items;
        }

        public void run(){
            AppDataBase.
                    getInstance()
                    .teamDAO().
                    insertTeam(itemsToInsert);
        }
    }
    class GETTeamsFromDataBase extends Thread{

//        OnTeamsPreparedListener onTeamsPreparedListener;
//        public GETTeamsFromDataBase(OnTeamsPreparedListener onSourcesPreparedListener){
//            this.onTeamsPreparedListener=onSourcesPreparedListener;
//        }

        public void run(){
            List<TeamsItem> mylist = AppDataBase.
                    getInstance()
                    .teamDAO().
                            getAllTeam();
            listMutableLiveData.postValue(mylist);
            //onTeamsPreparedListener.onTeamPrepared(mylist);
        }
    }

//    public interface OnTeamsPreparedListener{
//        void onTeamPrepared(List<TeamsItem> teamsItems);
//    }


}


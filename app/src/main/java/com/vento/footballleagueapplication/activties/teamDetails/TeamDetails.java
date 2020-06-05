package com.vento.footballleagueapplication.activties.teamDetails;


import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.vento.footballleagueapplication.Base.BaseActivity;
import com.vento.footballleagueapplication.R;
import com.vento.footballleagueapplication.Utils;
import com.vento.footballleagueapplication.activties.allTeams.AllTeamViewModel;
import com.vento.footballleagueapplication.activties.allTeams.model.TeamsItem;
import com.vento.footballleagueapplication.activties.allTeams.teamListAdapter;
import com.vento.footballleagueapplication.activties.teamDetails.model.SquadItem;
import com.vento.footballleagueapplication.activties.teamDetails.model.TeamPlayersResponse;
import com.vento.footballleagueapplication.databinding.ActivityTeamDetailsBinding;

import java.util.List;

public class TeamDetails extends BaseActivity {

    ActivityTeamDetailsBinding binding;
    TeamDetailsViewModel viewModel;
    PlayersListAdapter adapter;
    String token = "9e48af4817854df39fbe401ce94e796b";
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_team_details);
        init();
        clickListeners();
    }

    public void init() {
        id = getIntent().getExtras().getInt("id");
        viewModel = ViewModelProviders.of(this)
                .get(TeamDetailsViewModel.class);
        viewModel.getAllPlayers(token,id);
        adapter = new PlayersListAdapter(null);
        binding.squadList.
                setLayoutManager(new LinearLayoutManager(this,
                        LinearLayoutManager.VERTICAL, false));
        binding.squadList.setAdapter(adapter);
    }

    public void clickListeners() {

       viewModel.getListMutableLiveData().observe(activity, new Observer<TeamPlayersResponse>() {
           @Override
           public void onChanged(TeamPlayersResponse teamPlayersResponse) {
               binding.teamName.setText(teamPlayersResponse.getName());
               binding.teamWebsite.setText(teamPlayersResponse.getWebsite());
               binding.teamAddress.setText(teamPlayersResponse.getAddress());
               binding.teamMobile.setText(teamPlayersResponse.getPhone());
               binding.venue.setText(teamPlayersResponse.getVenue());
               Utils.fetchSvg(activity, teamPlayersResponse.getCrestUrl(), binding.teamIcon);

               adapter = new PlayersListAdapter(teamPlayersResponse.getSquad());
               binding.squadList.setAdapter(adapter);

           }
       });

        viewModel.getErrorMessage().observe(activity, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                if (integer == 1 ){
                    showMessageOk("Error","error in response data", "OK");
                }else {
                    showMessageOk("Error","error in Network", "OK");

                }
            }
        });
    }
}
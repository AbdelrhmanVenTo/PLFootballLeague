package com.vento.footballleagueapplication.activties.allTeams;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.vento.footballleagueapplication.Base.BaseActivity;
import com.vento.footballleagueapplication.R;
import com.vento.footballleagueapplication.activties.allTeams.model.TeamsItem;
import com.vento.footballleagueapplication.activties.teamDetails.TeamDetails;
import com.vento.footballleagueapplication.databinding.ActivityMainBinding;


import java.util.List;

public class MainActivity extends BaseActivity {

    public ActivityMainBinding binding ;
    public AllTeamViewModel allTeamViewModel ;
    String token = "9e48af4817854df39fbe401ce94e796b";
    teamListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        init();
        clickListeners();
    }

    public void init() {
        allTeamViewModel = ViewModelProviders.of(this)
                .get(AllTeamViewModel.class);
        allTeamViewModel.getAllTeamAPI(token);
        adapter = new teamListAdapter(null);
        binding.allTeamList.
                setLayoutManager(new LinearLayoutManager(this,
                        LinearLayoutManager.VERTICAL, false));
        binding.allTeamList.setAdapter(adapter);
    }

    public void clickListeners() {
        allTeamViewModel.getListMutableLiveData().observe(this, new Observer<List<TeamsItem>>() {
            @Override
            public void onChanged(List<TeamsItem> teamsItems) {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter = new teamListAdapter(teamsItems);
                        binding.allTeamList.setAdapter(adapter);
                        adapter.setOnItemClickListener(new teamListAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(int pos, TeamsItem teamsItem) {
                                Intent intent = new Intent(activity , TeamDetails.class);
                                intent.putExtra("id",teamsItem.getId());
                                startActivity(intent);
                            }
                        });

                        adapter.setOnWebsiteClickListener(new teamListAdapter.OnWebsiteClickListener() {
                            @Override
                            public void onItemClick(int pos, TeamsItem teamsItem) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(teamsItem.getWebsite()));
                                startActivity(intent);
                            }
                        });


                    }
                });

            }
        });

        allTeamViewModel.getErrorMessage().observe(activity, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                if (integer == 1 ){
                    showMessageOk("Error","error in response data", "OK");
                }
            }
        });
    }
}
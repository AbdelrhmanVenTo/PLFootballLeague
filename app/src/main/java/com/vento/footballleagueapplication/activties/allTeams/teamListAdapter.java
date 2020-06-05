package com.vento.footballleagueapplication.activties.allTeams;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vento.footballleagueapplication.R;
import com.vento.footballleagueapplication.activties.allTeams.model.TeamsItem;

import java.util.List;

public class teamListAdapter extends RecyclerView.Adapter<teamListAdapter.ViewHolder> {

    List<TeamsItem> allTeamList;
    OnItemClickListener onItemClickListener;
    OnWebsiteClickListener onWebsiteClickListener;


    public teamListAdapter(List<TeamsItem> allTeamList) {
        this.allTeamList = allTeamList;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnWebsiteClickListener(OnWebsiteClickListener onWebsiteClickListener) {
        this.onWebsiteClickListener = onWebsiteClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.team_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        final TeamsItem teamsItem = allTeamList.get(position);
        viewHolder.name.setText(teamsItem.getName());
        viewHolder.website.setText(teamsItem.getWebsite());
        viewHolder.website.setPaintFlags(viewHolder.website.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        viewHolder.color.setText(teamsItem.getClubColors());
        viewHolder.venue.setText(teamsItem.getVenue());
        viewHolder.players.setText("display on all team players");
        viewHolder.players.setPaintFlags(viewHolder.players.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        if(onItemClickListener!=null){
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onItemClick(position,teamsItem);
                }
            });
        }

        if(onWebsiteClickListener!=null){
            viewHolder.website.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onWebsiteClickListener.onItemClick(position,teamsItem);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        if (allTeamList == null)
            return 0;
        return allTeamList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name , website , color , venue , players ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.teamName);
            website = itemView.findViewById(R.id.teamWebsite);
            color = itemView.findViewById(R.id.color);
            venue = itemView.findViewById(R.id.venue);
            players = itemView.findViewById(R.id.allTeamPlayers);

        }
    }

    public interface OnItemClickListener{
        void onItemClick(int pos,TeamsItem teamsItem);
    }

    public interface OnWebsiteClickListener{
        void onItemClick(int pos,TeamsItem teamsItem);
    }

}

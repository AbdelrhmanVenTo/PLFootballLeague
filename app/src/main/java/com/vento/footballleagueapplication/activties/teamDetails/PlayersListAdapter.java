package com.vento.footballleagueapplication.activties.teamDetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vento.footballleagueapplication.R;
import com.vento.footballleagueapplication.activties.teamDetails.model.SquadItem;

import java.util.List;

public class PlayersListAdapter extends RecyclerView.Adapter<PlayersListAdapter.ViewHolder> {

    List<SquadItem> squadList;

    public PlayersListAdapter(List<SquadItem> squadList) {
        this.squadList = squadList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.players_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        SquadItem squadItem = squadList.get(position);
        viewHolder.name.setText(squadItem.getName());
        viewHolder.position.setText(squadItem.getPosition());
        viewHolder.dateOfBirth.setText(squadItem.getDateOfBirth());
        viewHolder.nationality.setText(squadItem.getNationality());
    }

    @Override
    public int getItemCount() {
        if (squadList == null)
            return 0;
        return squadList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name , position , dateOfBirth , nationality;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.playersName);
            position = itemView.findViewById(R.id.playersPosition);
            dateOfBirth = itemView.findViewById(R.id.dateOfBirth);
            nationality = itemView.findViewById(R.id.playersNationality);
        }
    }


}

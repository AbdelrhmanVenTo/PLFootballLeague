package com.vento.footballleagueapplication.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.vento.footballleagueapplication.DataBase.Dao.allTeamDAO;
import com.vento.footballleagueapplication.activties.allTeams.model.TeamsItem;

@Database(entities = {TeamsItem.class},
        version = 1,exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    private static AppDataBase myDataBase;
    private static final String DBName="APPDATABASE";
    public  abstract allTeamDAO teamDAO();
    public static AppDataBase init(Context context){

        if (myDataBase==null){//create object
            myDataBase =
                    Room.databaseBuilder(context, AppDataBase.class,DBName)
                 //   .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return myDataBase;
    }

    public static AppDataBase getInstance(){
        return myDataBase;
    }
}

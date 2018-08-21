package com.vt.vedamurthy.vtranslator.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.google.android.gms.common.internal.Constants;
import com.vt.vedamurthy.vtranslator.modelDAO.RecordedDataDAO;
import com.vt.vedamurthy.vtranslator.roomModeldata.RecordedData;

@Database(entities = {RecordedData.class},version = 1,exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    public abstract RecordedDataDAO recordedDataDAO();

    private static AppDataBase dataBase;

    private static final String DB_NAME = "record_data";

    public static AppDataBase getInstance(Context context) {
        if (null == dataBase) {
            dataBase = buildDatabaseInstance(context);
        }
        return dataBase;
    }

    private static AppDataBase buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context,
                AppDataBase.class,
                DB_NAME)
                .allowMainThreadQueries().build();
    }

    public void cleanUp(){
        dataBase = null;
    }
}

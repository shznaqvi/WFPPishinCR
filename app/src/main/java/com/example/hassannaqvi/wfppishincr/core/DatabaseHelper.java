package com.example.hassannaqvi.wfppishincr.core;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.hassannaqvi.wfppishincr.data.AppDatabase;

public class DatabaseHelper {

    AppDatabase db;

    public DatabaseHelper(Context mContext) {
        //        ROOM roomDB connection
        db = Room.databaseBuilder(mContext, AppDatabase.class, DBConnection.DATABASE_NAME).build();

        /* For modifying the database after the installation of App then we've to use MIGRATION*/

        /*dbClass roomDB = Room.databaseBuilder(context,dbClass.class,"contact-directory-roomDB")
                .addMigrations(MIGRATION_1_2).build();*/
    }

    public AppDatabase ReturnDB() {
        return db;
    }

    /*
    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE forms "
                    + " ADD COLUMN last_update TEXT");
        }
    };*/

    public abstract class DBConnection {
        public static final String DATABASE_NAME = "wfppishincr.db";
        public static final int DATABASE_VERSION = 1;
        public static final String TABLE_FORM = "forms";
    }
}

package com.example.hassannaqvi.wfppishincr.data;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.support.annotation.VisibleForTesting;

import com.example.hassannaqvi.wfppishincr.data.DAO.FormsDAO;
import com.example.hassannaqvi.wfppishincr.data.entities.Forms;

@Database(entities = {Forms.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    @VisibleForTesting
    public static final String DATABASE_NAME = "wfppishincr.db";
    // Alter table for Database Update
    static final Migration MIGRATION_v2_v3 = new Migration(2, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE forms "
                    + " ADD COLUMN last_update TEXT");
        }
    };
    private static AppDatabase sInstance;

    public static AppDatabase getDatabase(final Context context) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, DATABASE_NAME)
                            .addMigrations(/*MIGRATION_v1_v2, MIGRATION_v2_v3*/)
                            .build();
                }
            }
        }
        return sInstance;
    }

    public abstract FormsDAO formsDao();
}

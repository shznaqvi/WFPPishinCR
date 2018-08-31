package com.example.hassannaqvi.wfppishincr.data.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.hassannaqvi.wfppishincr.data.entities.Forms;

import java.util.List;

@Dao
public interface FormsDAO {

    @Query("SELECT * FROM forms")
    List<Forms> getAll();

    @Query("SELECT * FROM forms WHERE synced = ''")
    Forms findUnSynced();

    @Insert
    void insertAll(Forms... forms);

    @Delete
    void delete(Forms forms);
}

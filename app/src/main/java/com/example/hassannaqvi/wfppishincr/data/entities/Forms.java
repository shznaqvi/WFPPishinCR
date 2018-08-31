package com.example.hassannaqvi.wfppishincr.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "forms")
public class Forms {

    private final String _projectName = "National Nutrition Survey 2018";
    private final String _surveyType = "";
    @PrimaryKey(autoGenerate = true)
    private String id = "";
    private String uid = "";
    private String formDate = ""; // Date
    private String username = ""; // Interviewer


    private String istatus = ""; // Interview Status
    private String istatus88x = ""; // Interview Status

    private String sa1 = "";     // Info Section

    private String endtime = "";

    private String clustercode = "";
    private String hhno = "";

    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String gpsElev = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";
    private String appversion = "";

}

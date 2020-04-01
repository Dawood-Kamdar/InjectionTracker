package com.example.injectiontracker.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.injectiontracker.Entity.Site;

@Dao
public interface SiteDao {
    @Query("SELECT name FROM Site WHERE siteNumber = :siteNumber")
    String getBodyPartName(int siteNumber);

    @Insert
    void insert(Site site);

    @Insert
    void insertAll(Site... sites);
}

package com.example.injectiontracker.Dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.injectiontracker.Entity.Injection;

import java.util.List;

@Dao
public interface InjectionDao {

    @Query("Select * FROM Injection")
    List<Injection> getAll();

    @Query("Select siteNumber FROM Injection WHERE name = :partName ORDER BY Date ASC LIMIT 1")
    Injection getNextSite(String partName);
}

package com.example.injectiontracker.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.injectiontracker.Dao.BodyPartDao;
import com.example.injectiontracker.Entity.BodyPart;

@Database(entities = {BodyPart.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BodyPartDao bodyPartDao();
}

package com.example.injectiontracker.Database;

import android.content.Context;

import androidx.room.Room;

public class ResetDatabase {

    public static void reset(Context context) {
        AppDatabase db = Room.inMemoryDatabaseBuilder(context, AppDatabase.class)
                .allowMainThreadQueries().build();
        db.close();
        db.clearAllTables();
    }
}

package com.example.injectiontracker.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class BodyPart {
    @PrimaryKey
    public int bodyPartId;

    @ColumnInfo(name = "name")
    public String name;
}

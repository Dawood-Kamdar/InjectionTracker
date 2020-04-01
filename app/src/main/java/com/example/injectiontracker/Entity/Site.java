package com.example.injectiontracker.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Site {
    @PrimaryKey
    public int siteId;

    @Embedded
    public BodyPart bodyPart;

    @ColumnInfo(name = "siteNumber")
    public int siteNumber;

    @ColumnInfo(name = "ignore")
    public boolean ignore;
}

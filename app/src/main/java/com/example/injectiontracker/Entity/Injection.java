package com.example.injectiontracker.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;

@Entity
public class Injection {
    @PrimaryKey
    public int injectionId;

    @ColumnInfo(name = "Date")
    public Date Date;

    @ColumnInfo(name = "Day")
    public String Day;

    @Embedded
    public Site site;

    @ColumnInfo(name = "notes")
    public String notes;
}

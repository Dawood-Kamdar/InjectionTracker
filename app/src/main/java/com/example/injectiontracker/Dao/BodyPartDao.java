package com.example.injectiontracker.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.injectiontracker.Entity.BodyPart;

import java.util.List;

@Dao
public interface BodyPartDao {
    @Query("Select * FROM BodyPart")
    List<BodyPart> getAll();

    @Query("SELECT * FROM BodyPart WHERE bodyPartId IN (:bodyPartIds)")
    List<BodyPart> loadAllByIds(int[] bodyPartIds);

    @Query("SELECT * FROM BodyPart WHERE name LIKE :name LIMIT 1")
    BodyPart findByName(String name);

    @Insert
    void insertAll(BodyPart... bodyParts);

    @Delete
    void delete(BodyPart bodyPart);

    @Delete
    void deleteAll(BodyPart... bodyParts);
}

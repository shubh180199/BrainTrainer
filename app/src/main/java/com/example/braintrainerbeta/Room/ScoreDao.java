package com.example.braintrainerbeta.Room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ScoreDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Score score);

    @Update
    void update(Score score);

    @Delete
    void delete(Score score);

    @Query("Delete From score_table ")
    void deleteAllScore();

    @Query("SELECT * FROM  score_table  ORDER BY percentage DESC , score DESC ")
    List<Score> getAllScores();
}

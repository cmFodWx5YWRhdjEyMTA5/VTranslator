package com.vt.vedamurthy.vtranslator.modelDAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.vt.vedamurthy.vtranslator.roomModeldata.RecordedData;

import java.util.List;

@Dao
public interface RecordedDataDAO {

    @Query("SELECT * from recordedData")
    public List<RecordedData> getAllRecordedData();

    /*@Query("SELECT * from recordedData WHERE id : id LIMIT 1")
    public RecordedData getRecordById(int id);*/

    @Insert
    public void putRecordedData(RecordedData recordedData);

    @Update
    public void updateRecordedData(RecordedData recordedData);

    @Delete
    public void deleteRecordedData(RecordedData recordedData);
}

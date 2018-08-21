package com.vt.vedamurthy.vtranslator.roomModeldata;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class RecordedData {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "recordedText")
    private String recordedText;

    @ColumnInfo(name = "translatedText")
    private String translatedText;

    public RecordedData(String recordedText, String translatedText) {
        this.recordedText = recordedText;
        this.translatedText = translatedText;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getRecordedText() {
        return recordedText;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setRecordedText(String recordedText) {
        this.recordedText = recordedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }


}

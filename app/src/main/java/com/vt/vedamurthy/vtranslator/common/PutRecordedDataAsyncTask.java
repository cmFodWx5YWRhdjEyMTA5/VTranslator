package com.vt.vedamurthy.vtranslator.common;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;

import com.vt.vedamurthy.vtranslator.roomModeldata.RecordedData;

public class PutRecordedDataAsyncTask extends AsyncTask {

    private AppCompatActivity activity;
    private RecordedData recordedData;
    private RecordSavedListener recordSavedListener;

    public PutRecordedDataAsyncTask(RecordedData recordedData,AppCompatActivity activity,RecordSavedListener recordSavedListener)
    {
        this.activity = activity;
        this.recordedData = recordedData;
        this.recordSavedListener = recordSavedListener;
    }
    @Override
    protected Object doInBackground(Object[] objects) {
        try
        {

        }
        catch (Throwable th)
        {

        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }

    public interface RecordSavedListener
    {
        void recordSaved();
        void recordSaveFailed();
    }
}

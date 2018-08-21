package com.vt.vedamurthy.vtranslator.common;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vt.vedamurthy.vtranslator.R;
import com.vt.vedamurthy.vtranslator.database.AppDataBase;
import com.vt.vedamurthy.vtranslator.roomModeldata.RecordedData;

import java.util.ArrayList;
import java.util.List;

public class RecordedDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recorded_data);
        RecyclerView recyclerView = findViewById(R.id.record_list);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        List<RecordedData> records = AppDataBase.getInstance(this).recordedDataDAO().getAllRecordedData();
        records.addAll(prepareMovieData());
        RecordDataAdapter recordDataAdapter = new RecordDataAdapter(this,records);
        recyclerView.setAdapter(recordDataAdapter);
    }

    private List<RecordedData> prepareMovieData() {
        List<RecordedData> records = new ArrayList<>();
        RecordedData recordedData = new RecordedData("Mad Max: veda", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        recordedData = new RecordedData("Mad Max: Fury Road", "Action & Adventure");
        records.add(recordedData);

        return records;
    }
}

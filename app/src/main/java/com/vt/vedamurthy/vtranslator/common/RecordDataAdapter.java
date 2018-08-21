package com.vt.vedamurthy.vtranslator.common;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vt.vedamurthy.vtranslator.R;
import com.vt.vedamurthy.vtranslator.roomModeldata.RecordedData;

import java.util.List;

public class RecordDataAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<RecordedData> recordedData;

    public RecordDataAdapter(@NonNull Context context, List<RecordedData> recordedData) {
        this.context = context;
        this.recordedData = recordedData;
    }

    @NonNull
    @Override
    public RecordDataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.record_item_adapter, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder1 = (ViewHolder)viewHolder;
        RecordedData recordedData = this.recordedData.get(i);
        viewHolder1.recordedText.setText(recordedData.getRecordedText());
        viewHolder1.translatedText.setText(recordedData.getTranslatedText());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView recordedText,translatedText;
        public ViewHolder(View view) {
            super(view);
            recordedText = view.findViewById(R.id.recorded_text);
            translatedText = view.findViewById(R.id.translated_text);
        }
    }

    @Override
    public int getItemCount() {
        return recordedData.size();
    }
}

package com.flowsnake.dictionary.view;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.flowsnake.dictionary.R;
import com.flowsnake.dictionary.logic.data.Result;

public class ResultListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private static class ResultViewHolder extends RecyclerView.ViewHolder {
        private TextView txtTerm;
        private RecyclerView listTranslations;

        ResultViewHolder(View itemView) {
            super(itemView);

            txtTerm = (TextView) itemView.findViewById(R.id.txt_term);
            listTranslations = (RecyclerView) itemView.findViewById(R.id.list_translations);
        }

        static ResultViewHolder newInstance(Activity activity, ViewGroup parent) {
            return new ResultViewHolder(activity.getLayoutInflater().inflate(R.layout.card_result, parent, false));
        }

        void setResult(Result result) {
            txtTerm.setText(result.getTerm().toString());
        }
    }
}

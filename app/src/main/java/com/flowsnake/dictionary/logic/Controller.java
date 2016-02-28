package com.flowsnake.dictionary.logic;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Controller {
    private final Context context;
    private List<String> history;

    public Controller(Context context) {
        this.context = context;
        history = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            history.add("" + i);
        }
    }

    public List<String> getHistory() {
        return history;
    }

    public Cursor query(Locale language, String term) {
        return null; // TODO: query
    }
}

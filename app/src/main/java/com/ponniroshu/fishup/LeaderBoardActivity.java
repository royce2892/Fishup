package com.ponniroshu.fishup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by royce on 23-04-2016.
 */
public class LeaderBoardActivity extends AppCompatActivity {

    FeedListAdapter feedListAdapter;
    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.act_lead);

        feedListAdapter = new FeedListAdapter(this);
        listView = (ListView) findViewById(R.id.lead_list);
        listView.setAdapter(feedListAdapter);
    }
}

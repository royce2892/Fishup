package com.ponniroshu.fishup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by royce on 24-04-2016.
 */
public class AlertActivity extends AppCompatActivity {

    AlertListAdapter alertListAdapter;
    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.act_alert);

        listView = (ListView) findViewById(R.id.alert_list);
        alertListAdapter = new AlertListAdapter(this);
        listView.setAdapter(alertListAdapter);
    }
}

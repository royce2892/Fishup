package com.ponniroshu.fishup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RelativeLayout newFish,share,lead,feed,alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        SliderLayout sliderShow = (SliderLayout) findViewById(R.id.slider);
        newFish = (RelativeLayout) findViewById(R.id.new_fish_layout);
        share = (RelativeLayout) findViewById(R.id.invite_layout);
        lead = (RelativeLayout) findViewById(R.id.lead_layout);
        feed = (RelativeLayout) findViewById(R.id.feedback_layout);
        alert = (RelativeLayout) findViewById(R.id.alert_layout);

        lead.setOnClickListener(this);
        newFish.setOnClickListener(this);
        share.setOnClickListener(this);
        feed.setOnClickListener(this);
        alert.setOnClickListener(this);

        for (int i = 0; i < 6; i++) {
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView
                    .description("Captured by Nithin Paul at Perumbavoor, India")
                    .image(R.drawable.dummy_fish);

            sliderShow.addSlider(textSliderView);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.new_fish_layout:
                startActivity(new Intent(this,NewFishActivity.class));
                break;
            case R.id.feedback_layout:
                startActivity(new Intent(this,FeedBackActivity.class));
                break;
            case R.id.lead_layout:
                startActivity(new Intent(this,LeaderBoardActivity.class));
                break;
            case R.id.invite_layout:
                startActivity(new Intent(this,ProfileActivity.class));
                break;
            case R.id.alert_layout:
                startActivity(new Intent(this,AlertActivity.class));
                break;
            case R.id.slider:

                break;

        }
    }
}

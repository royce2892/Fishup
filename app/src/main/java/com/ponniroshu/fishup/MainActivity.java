package com.ponniroshu.fishup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RelativeLayout newFish, share, lead, feed, alert;
    ImageView overflow;
    ListView mListView;
    ArrayList<Feed> cards = new ArrayList<Feed>();
    ArticleListAdapter mArticleListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        mListView = (ListView) findViewById(R.id.list);
        newFish = (RelativeLayout) findViewById(R.id.new_fish_layout);
        share = (RelativeLayout) findViewById(R.id.invite_layout);
        lead = (RelativeLayout) findViewById(R.id.lead_layout);
        feed = (RelativeLayout) findViewById(R.id.feedback_layout);
        alert = (RelativeLayout) findViewById(R.id.alert_layout);
        overflow = (ImageView) findViewById(R.id.overflow);

        lead.setOnClickListener(this);
        newFish.setOnClickListener(this);
        share.setOnClickListener(this);
        feed.setOnClickListener(this);
        alert.setOnClickListener(this);
        overflow.setOnClickListener(this);

        cards.add(new Feed(R.drawable.dummy_fish__2, "Nithin Paul", "Perumbavoor, India"));
        cards.add(new Feed(R.drawable.dummy_fish_1, "Royce Raju", "Sydney, Australia"));
        cards.add(new Feed(R.drawable.dummy_fish, "Vishnu Paul", "Stamford Bridge, England"));

        mArticleListAdapter = new ArticleListAdapter(this, cards,false);
        mListView.setAdapter(mArticleListAdapter);

     /*   for (int i = 0; i < 3; i++) {
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView
                    .description(captions[i])
                    .image(iages[i]);

            sliderShow.addSlider(textSliderView);
        }*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.new_fish_layout:
                startActivity(new Intent(this, NewFishActivity.class));
                break;
            case R.id.feedback_layout:
                startActivity(new Intent(this, FeedBackActivity.class));
                break;
            case R.id.lead_layout:
                startActivity(new Intent(this, LeaderBoardActivity.class));
                break;
            case R.id.invite_layout:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
            case R.id.alert_layout:
                startActivity(new Intent(this, AlertActivity.class));
                break;
            case R.id.overflow:
                startActivity(new Intent(this, FishActivity.class));
                break;

        }
    }
}

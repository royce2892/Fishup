package com.ponniroshu.fishup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.squareup.picasso.Picasso;

/**
 * Created by royce on 23-04-2016.
 */
public class ProfileActivity extends AppCompatActivity {

    ImageView image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.act_profile);

        image = (ImageView) findViewById(R.id.profile_image);

        SliderLayout sliderShow = (SliderLayout) findViewById(R.id.slider);

        for (int i = 0; i < 6; i++) {
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView
                    .description("Captured three days ago in 27 minutes")
                    .image(R.drawable.dummy_fish_1);

            sliderShow.addSlider(textSliderView);
        }
        Picasso.with(this).load("https://scontent-lga3-1.xx.fbcdn.net/hphotos-ash2/v/t1.0-9/10978521_836296589770482_6497845987999076187_n.jpg?oh=157b8afd50296625bcf52f25e36cfabf&oe=57A2E707").into(image);

    }
}

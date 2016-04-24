package com.ponniroshu.fishup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by royce on 24-04-2016.
 */
public class FeedListAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    String[] names = {"Nithin David", "Mathew Dominic", "John K Joy", "Vishnu Nandakumar", "Nandu Mahesh"};
    String[] scores = {"349", "255", "147", "103", "94"};
    String[] statuss = {"Where there is a fish there is a Nithin",
            "Fish in my mind and head",
            "Fishin in the moonlight, I'm thinking off you",
            "Come to daddy, fishes",
            "If you wanna fish , you gonna do it with me"

    };
    String[] places = {"Pathanamthitta", "Trichur", "Kottayam", "Palakkad", "Mundakkal"};

    String[] images = {"https://scontent-iad3-1.xx.fbcdn.net/hprofile-ash2/v/t1.0-1/p160x160/10978521_836296589770482_6497845987999076187_n.jpg?oh=74241450af5f143cd715585495b3a2a8&oe=57BCF846",
            "https://scontent-iad3-1.xx.fbcdn.net/hprofile-xlt1/v/t1.0-1/c2.0.160.160/p160x160/12806154_1164651286880834_468414782590307314_n.jpg?oh=46deb141f65efc0f30615c36122b2712&oe=57B035C3",
            "https://scontent-iad3-1.xx.fbcdn.net/hprofile-xtf1/v/t1.0-1/p160x160/11084294_10206036323968579_3037265924302279622_n.jpg?oh=24e369ec67296a280b965f9f3e5882ae&oe=57A358F8",
            "https://scontent-iad3-1.xx.fbcdn.net/hprofile-xpt1/v/t1.0-1/p160x160/10858496_799921020064553_1221201322371945901_n.jpg?oh=6d33c64d4095cbbda91be8d330a4551e&oe=57A7AB71",
            "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/p160x160/11217581_1116542718360529_841050273150124704_n.jpg?oh=54650cac63683da845d29692d121a964&oe=57ACF428"
    };
    Context context;

    public FeedListAdapter(Context context) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(R.layout.row_leaderboard, parent, false);

        TextView name = (TextView) view.findViewById(R.id.row_lead_name);
        TextView score = (TextView) view.findViewById(R.id.row_lead_score);
        TextView status = (TextView) view.findViewById(R.id.row_lead_status);
        TextView place = (TextView) view.findViewById(R.id.row_lead_place);
        ImageView image = (ImageView) view.findViewById(R.id.row_lead_image);
        name.setText(names[position]);
        score.setText(scores[position]);
        status.setText(statuss[position]);
        place.setText(places[position]+", India");
        Picasso.with(context).load(images[position]).into(image);

        return view;
    };
}

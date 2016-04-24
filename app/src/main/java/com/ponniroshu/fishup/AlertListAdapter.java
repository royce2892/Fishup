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
public class AlertListAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    String[] names = {"Mathew Dominic sent you a feedback"
            , "John K Joy started following you",
            "Vishnu Nandakumar appreciated your feedback ",
            "Nandu Mahesh captured a new fish",
            "Ponnie Rohith joined FishUp",
            "Bharath Krishna captured a big fash in Arizona"};
    String[] time = {"3 hours ago", "4 hours ago", "9 hours ago", "1 day ago","2 days ago","Last week"};

    String[] images = {"https://scontent-iad3-1.xx.fbcdn.net/hprofile-xlt1/v/t1.0-1/c2.0.160.160/p160x160/12806154_1164651286880834_468414782590307314_n.jpg?oh=46deb141f65efc0f30615c36122b2712&oe=57B035C3",
            "https://scontent-iad3-1.xx.fbcdn.net/hprofile-xtf1/v/t1.0-1/p160x160/11084294_10206036323968579_3037265924302279622_n.jpg?oh=24e369ec67296a280b965f9f3e5882ae&oe=57A358F8",
            "https://scontent-iad3-1.xx.fbcdn.net/hprofile-xpt1/v/t1.0-1/p160x160/10858496_799921020064553_1221201322371945901_n.jpg?oh=6d33c64d4095cbbda91be8d330a4551e&oe=57A7AB71",
            "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/p160x160/11217581_1116542718360529_841050273150124704_n.jpg?oh=54650cac63683da845d29692d121a964&oe=57ACF428",
            "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/p160x160/11693942_985740428145084_9192597582222363429_n.jpg?oh=b1dd45cbfc30b30a5f4e1be96cfa71bd&oe=57ACFA37",
            "https://scontent-iad3-1.xx.fbcdn.net/hprofile-xpf1/v/t1.0-1/p160x160/12507255_1167429873285009_8467360263023741418_n.jpg?oh=6d1b29e2aef285f6f8fe27676f4f61fb&oe=577644A4"
    };
    Context context;

    public AlertListAdapter(Context context) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 6;
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

        View view = layoutInflater.inflate(R.layout.row_alert, parent, false);

        TextView name = (TextView) view.findViewById(R.id.row_alert_name);
        TextView score = (TextView) view.findViewById(R.id.row_alert_place);
        ImageView image = (ImageView) view.findViewById(R.id.row_alert_image);
        name.setText(names[position]);
        score.setText(time[position]);
        Picasso.with(context).load(images[position]).into(image);

        return view;
    }

    ;
}

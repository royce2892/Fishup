package com.ponniroshu.fishup;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by nithin on 18-11-2015.
 */

public class ArticleListAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    ProgressDialog progressDialog;
    boolean fromHome;
    private List<Feed> articles;


    public ArticleListAdapter(Context context, List<Feed> list, boolean _fromHome) {
        this.fromHome = _fromHome;
        this.context = context;
        this.articles = list;
        layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        if (fromHome & articles.size() > 2)
            return 2;
        else
            return articles.size();
    }

    @Override
    public Object getItem(int position) {
        return articles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        Feed article = (Feed) getItem(position);

        if (convertView == null) {

            convertView = layoutInflater.inflate(R.layout.card_layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.position = position;
            viewHolder.username = (TextView) convertView.findViewById(R.id.user_name);
            viewHolder.pic = (ImageView) convertView.findViewById(R.id.image);
            viewHolder.timestamp = (TextView) convertView.findViewById(R.id.timeStamp);

            convertView.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) convertView.getTag();
        Picasso.with(context)
                .load(article.image)
                .resize(700,700)
                .into(viewHolder.pic);

        viewHolder.username.setText(article.username);
        viewHolder.timestamp.setText(article.time);
//        Utils.setListViewHeightBasedOnItems();
        return convertView;
    }


    private void cancel() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }

    static class ViewHolder {
        TextView username, timestamp;
        ImageView pic;
        int position;
    }


}

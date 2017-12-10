package com.appjex.nsqn;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterChat extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<Chat> items;

    public AdapterChat(Activity activity, ArrayList<Chat> items){
        this.activity=activity;
        this.items=items;
    }

    @Override
    public int getCount(){
        return items.size();
    }

    public void clear(){
        items.clear();
    }

    public void addAll(ArrayList<Chat> chat){
        for (int i=0; i<chat.size(); i++){
            items.add(chat.get(i));
        }
    }

    @Override
    public Object getItem(int arg0){
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_chat, null);
        }

        Chat dir = items.get(position);

        TextView title = (TextView) v.findViewById(R.id.title_chat);
        title.setText(dir.getNombre());

        TextView topic = (TextView) v.findViewById(R.id.topic_chat);
        topic.setText(dir.getTema());

        TextView location = (TextView) v.findViewById(R.id.place_chat);
        location.setText(dir.getLocacion());

        return v;
    }

}

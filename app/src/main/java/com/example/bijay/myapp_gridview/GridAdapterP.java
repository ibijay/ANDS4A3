package com.example.bijay.myapp_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Bijay on 25-05-2016.
 */
public class GridAdapterP extends ArrayAdapter<Pic> {
    Context context;
    int layoutresourceid;
    ArrayList<Pic> picArrayList = new ArrayList<>();

    public GridAdapterP(Context context,int layoutresourceid, ArrayList<Pic> picArrayList){
        super(context,layoutresourceid,picArrayList);
        this.context=context;
        this.layoutresourceid=layoutresourceid;
        this.picArrayList=picArrayList;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layoutresourceid,null);

        ImageView iv =(ImageView) convertView.findViewById(R.id.imageView);

        Pic pic = picArrayList.get(position);
        iv.setImageBitmap(pic.getImage());
        return convertView;
    }
}

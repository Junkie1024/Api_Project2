package com.example.api_project;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class List_Adapter extends BaseAdapter {
    Context c;
    ArrayList<List_Products> pro;

    LayoutInflater inflater;

    public List_Adapter(Context c, ArrayList<List_Products> pro) {
        this.c = c;
        this.pro = pro;
    }

    public Context getC() {
        return c;
    }

    public ArrayList<List_Products> getPro() {
        return pro;
    }

    @Override
    public int getCount() {
        return pro.size();
    }

    @Override
    public Object getItem(int position) {
        return pro.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null)
        {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(convertView  ==  null)
        {
            convertView = inflater.inflate(R.layout.activity_list_textview,parent,false);
        }

        //ImageView pimg = convertView.findViewById(R.id.profilepic);
        TextView pname  = convertView.findViewById(R.id.ownername);

       // Picasso.get().load(pro.get(position).getPimg()).into(pimg);
        pname.setText(pro.get(position).getname());




        return convertView;
    }
}

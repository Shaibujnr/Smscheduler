package com.et.smscheduler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbdulGafar on 4/27/2016.
 */
public class MyAdapter extends ArrayAdapter<Details> {
    private ArrayList<Details> mList;
    private Context callingContext;
    private int Rlid; //Resource layout id



    public MyAdapter(Context context, int resource, ArrayList<Details> objects) {
        super(context, resource, objects);
        callingContext = context;
        mList = objects;
        Rlid = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) callingContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_view,parent,false);

        }
        TextView title = (TextView) convertView.findViewById(R.id.item_title);
        TextView details = (TextView) convertView.findViewById(R.id.item_details);
        TextView date_stamp = (TextView) convertView.findViewById(R.id.item_date);

        title.setText(mList.get(position).getmTitle());
        details.setText(mList.get(position).getmContent());
        date_stamp.setText( mList.get(position).getmTime());



        return convertView;
    }
}

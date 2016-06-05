package com.example.momo.glicofinder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.momo.glicofinder.R;
import com.example.momo.glicofinder.model.Icecream;

import java.util.List;

/**
 * Created by Momo on 5/6/2559.
 */
public class IcecreamAdapter extends ArrayAdapter<Icecream>{

    private List<Icecream> icecreams;

    public IcecreamAdapter(Context context, int resource, List<Icecream> icecreams) {
        super(context, resource);
        this.icecreams = icecreams;
    }

    public View getView(final int position, View convertView, ViewGroup parent){
        View v = convertView;
        if(v==null){
            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.icecream_cell,null);
        }
        TextView icecreamName = (TextView) v.findViewById(R.id.icecream_name);

        Icecream icecreamList = getItem(position);
        icecreamName.setText(icecreamList.getName());

        return v;
    }

}

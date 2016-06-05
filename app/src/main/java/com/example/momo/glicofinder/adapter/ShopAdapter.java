package com.example.momo.glicofinder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.momo.glicofinder.R;
import com.example.momo.glicofinder.model.Icecream;
import com.example.momo.glicofinder.model.Shop;

import java.util.List;

/**
 * Created by Momo on 5/6/2559.
 */
public class ShopAdapter extends ArrayAdapter<Shop>{

    public ShopAdapter(Context context, int resource,List<Shop> shops) {
        super(context, resource,shops);
    }


    public View getView(final int position,View convertView,ViewGroup parent) {
        View v = convertView;
        if(v==null){
            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.shop_cell,null);
        }

        TextView shopName = (TextView) v.findViewById(R.id.shop_name_cell);
        Shop shopList = getItem(position);
        shopName.setText(shopList.getName());


        return v;
    }
}
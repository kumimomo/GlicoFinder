package com.example.momo.glicofinder.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;
import android.widget.TextView;

import com.example.momo.glicofinder.R;
import com.example.momo.glicofinder.adapter.IcecreamAdapter;
import com.example.momo.glicofinder.model.Icecream;
import com.example.momo.glicofinder.model.Shop;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ShopInfoActivity extends AppCompatActivity {
    private Shop shop;
    private List<Icecream> icecreams;

    private TextView shopName;
    private TextView shopDesc;
    private ListView icecreamList;
    private IcecreamAdapter icecreamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shop = (Shop) getIntent().getSerializableExtra("shop");
        setContentView(R.layout.activity_shop_info);
        initComponent();
    }

    public void initComponent(){
        shopName = (TextView)findViewById(R.id.shop_name);
        shopDesc = (TextView) findViewById(R.id.shop_desc);

        icecreams = shop.getIcecreams();
        System.out.println("icecreams size: "+icecreams.size());
        for(Icecream ic:icecreams){
            System.out.println("icecream :"+ic.getName());
        }
        icecreamAdapter = new IcecreamAdapter(this,R.layout.icecream_cell,shop.getIcecreams());
        icecreamList = (ListView) findViewById(R.id.icecream_list_view);
        icecreamList.setAdapter(icecreamAdapter);

    }

    protected void onStart() {
        super.onStart();

        shopName.setText(shop.getName());
        shopDesc.setText(shop.getDescripe());

       // icecreams = shop.getIcecreams();
       // icecreamAdapter.notifyDataSetChanged();
    }
}

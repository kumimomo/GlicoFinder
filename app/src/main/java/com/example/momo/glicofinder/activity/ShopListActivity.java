package com.example.momo.glicofinder.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.momo.glicofinder.R;
import com.example.momo.glicofinder.adapter.ShopAdapter;
import com.example.momo.glicofinder.model.Shop;
import com.example.momo.glicofinder.service.ShopService;

import java.util.List;

public class ShopListActivity extends AppCompatActivity {

    private ShopService shopService;
    private List<Shop> shops;

    private TextView shopName;
    private ListView shopListView;
    private ShopAdapter shopAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);
        initComponent();
    }

    public void initComponent(){
        shopName = (TextView)findViewById(R.id.shop_name_cell);
        shopService = new ShopService();
        shops = shopService.getShopList();

        shopAdapter = new ShopAdapter(this,R.layout.shop_cell,shops);
        shopListView = (ListView) findViewById(R.id.shop_list_view);
        shopListView.setAdapter(shopAdapter);

        shopListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ShopListActivity.this,ShopInfoActivity.class);
                intent.putExtra("shop", shops.get(position) );
                startActivity(intent);
            }
        });
    }

    protected void onStart() {
        super.onStart();

        // icecreams = shop.getIcecreams();
        // icecreamAdapter.notifyDataSetChanged();
    }

}

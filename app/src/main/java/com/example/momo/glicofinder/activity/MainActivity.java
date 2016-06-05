package com.example.momo.glicofinder.activity;
//api-key AIzaSyCVXbbzsJRzdChFGmC-f8H-E6UVcvF34nE
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.momo.glicofinder.R;

public class MainActivity extends AppCompatActivity {
    private Button findNearby_bt;
    private Button shopList_bt;
    private Button about_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initialize();
    }

    private void initialize(){
        findNearby_bt = (Button) findViewById(R.id.find_nearby);
        findNearby_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FindNearbyActivity.class);
                startActivity(intent);
            }
        });
        shopList_bt = (Button) findViewById(R.id.shop_list);
        shopList_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShopListActivity.class);
                startActivity(intent);
            }
        });
        about_bt = (Button) findViewById(R.id.random_icecream);
        about_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutIcecreamActivity.class);
                startActivity(intent);
            }
        });

    }
}

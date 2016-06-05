package com.example.momo.glicofinder.activity;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.momo.glicofinder.R;
import com.example.momo.glicofinder.model.Icecream;
import com.example.momo.glicofinder.service.ShopService;

import java.util.List;

public class AboutIcecreamActivity extends AppCompatActivity {
    private ImageButton icecream1;
    private ImageButton icecream2;
    private ImageButton icecream3;
    private ImageButton icecream4;
    private ImageButton icecream5;
    private ImageButton icecream6;
    private ImageButton icecream7;
    private ImageButton icecream8;

    private ShopService shopService;
    private List<Icecream> icecreams;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_icecream);
        this.initialize();
    }

    private void initialize(){
        shopService = new ShopService();
        icecreams = shopService.getIcecreamList();

        icecream1 = (ImageButton) findViewById(R.id.imageButton1);
        icecream1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(0) );
                startActivity(intent);
            }
        });

        icecream2 = (ImageButton) findViewById(R.id.imageButton2);
        icecream2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(1) );
                startActivity(intent);
            }
        });

        icecream3 = (ImageButton) findViewById(R.id.imageButton3);
        icecream3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(2) );
                startActivity(intent);
            }
        });

        icecream4 = (ImageButton) findViewById(R.id.imageButton4);
        icecream4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(3) );
                startActivity(intent);
            }
        });

        icecream5 = (ImageButton) findViewById(R.id.imageButton5);
        icecream5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(4) );
                startActivity(intent);
            }
        });

        icecream6 = (ImageButton) findViewById(R.id.imageButton6);
        icecream6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(5) );
                startActivity(intent);
            }
        });

        icecream7 = (ImageButton) findViewById(R.id.imageButton7);
        icecream7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(6) );
                startActivity(intent);
            }
        });

        icecream8 = (ImageButton) findViewById(R.id.imageButton8);
        icecream8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutIcecreamActivity.this,IcecreamInfoActivity.class);
                intent.putExtra("icecream", icecreams.get(7) );
                startActivity(intent);
            }
        });


    }
}

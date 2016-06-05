package com.example.momo.glicofinder.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.momo.glicofinder.R;
import com.example.momo.glicofinder.model.Icecream;

import java.util.List;

public class IcecreamInfoActivity extends AppCompatActivity {
    private Icecream icecream;
    private List<Icecream> icecreams;

    private TextView icecreamName;
    private TextView icecreamDesc;
    private ImageView icecreamImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        icecream = (Icecream) getIntent().getSerializableExtra("icecream");
        setContentView(R.layout.activity_icecream_info);
        initComponent();
    }

    public void initComponent(){
        icecreamName = (TextView) findViewById(R.id.icecream_name_info);
        icecreamDesc = (TextView) findViewById(R.id.icecream_desc);
        icecreamImg = (ImageView) findViewById(R.id.img_icecream);
    }

    protected void onStart(){
        super.onStart();

        icecreamName.setText(icecream.getName());
        icecreamDesc.setText(icecream.getDescribe());
        icecreamImg.setImageResource(icecream.getImage());
    }
}

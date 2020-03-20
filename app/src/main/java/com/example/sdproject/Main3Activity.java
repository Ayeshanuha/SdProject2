package com.example.sdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    private ImageView burger,pasta,noodles;
     private Button buttonview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        burger= (ImageView) findViewById(R.id.burger);
        pasta=(ImageView) findViewById(R.id.pasta);
        noodles= (ImageView) findViewById(R.id.noodles);
        buttonview1=(Button) findViewById(R.id.button4);
        burger.setOnClickListener(this);
        pasta.setOnClickListener(this);
        noodles.setOnClickListener(this);
        buttonview1.setOnClickListener(this);



    }
    public void onClick(View view)
    {
        if(view.getId()== R.id.burger)
        {
            burger.setVisibility(View.GONE);
            pasta. setVisibility(View.VISIBLE);
            noodles.setVisibility(View.VISIBLE);
        }
        if(view.getId()== R.id.pasta)
        {
            burger.setVisibility(View.VISIBLE);
            pasta. setVisibility(View.GONE);
            noodles.setVisibility(View.VISIBLE);
        }
        if(view.getId()== R.id.noodles)
        {
            burger.setVisibility(View.VISIBLE);
            pasta. setVisibility(View.VISIBLE);
            noodles.setVisibility(View.GONE);
        }
        if(view.getId()== R.id.button4)
        {
            Intent intent=new Intent(this,Main2Activity.class);
            this.startActivity(intent);
        }

    }
}

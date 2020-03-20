package com.example.sdproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;



import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick(View view)
    {
        if(view.getId()==R.id.button2){
            Intent intent=new Intent(this,Main3Activity.class);
            startActivity(intent);

        }
        else if(view.getId()==R.id.button3)
        {
            Intent intent=new Intent(this,Main4Activity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button11)
        {
            Intent intent=new Intent(this,Main5Activity.class);
            startActivity(intent);
        }






    }
}



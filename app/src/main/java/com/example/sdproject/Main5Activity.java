package com.example.sdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android .widget.Toast;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    private Button exitbutton, selectbutton;
    private CheckBox c1, c2, c3, c4, c5, c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        exitbutton = (Button) findViewById(R.id.button7);
        exitbutton.setOnClickListener(this);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        c1 = (CheckBox) findViewById(R.id.checkBox1);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        c5 = (CheckBox) findViewById(R.id.checkBox5);
        c6 = (CheckBox) findViewById(R.id.checkBox6);
        selectbutton = (Button) findViewById(R.id.button12);

        selectbutton.setOnClickListener(this);
    }


        @Override
        public void onClick (View v){
            StringBuffer res = new StringBuffer();
            res.append("chilli mashroom : ").append(c1.isChecked());
            res.append("lollipop : ").append(c2.isChecked());
            res.append("soup : ").append(c3.isChecked());
            res.append("noodle soup: ").append(c4.isChecked());
            res.append("pasta : ").append(c5.isChecked());
            res.append("burger : ").append(c6.isChecked());
            Toast.makeText(Main5Activity.this, res.toString(), Toast.LENGTH_SHORT).show();


            Intent exitintent = new Intent(this, Main2Activity.class);
            this.startActivity(exitintent);
        }

}


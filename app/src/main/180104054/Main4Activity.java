package com.example.sdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private boolean table_flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }
    public void collapseTable(View view)
    {
        TableLayout table =findViewById(R.id.table);
        Button button5=findViewById(R.id.button5);

        table.setColumnCollapsed(1,table_flag);
        table.setColumnCollapsed(2,table_flag);
        if(table_flag)
        {
            table_flag=false;
            button5.setText("Show");
        }
        else
        {
            table_flag=true;
            button5.setText("Hide");
        }


    }
}

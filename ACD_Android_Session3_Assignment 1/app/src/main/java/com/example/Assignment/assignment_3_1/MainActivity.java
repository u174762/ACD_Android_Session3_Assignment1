package com.example.pravar_ag.assignment_3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView andPic;
    Button btnHide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        andPic=(ImageView)findViewById(R.id.img_pic);
        btnHide=(Button)findViewById(R.id.btn_hide);


        btnHide.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(btnHide.getText().toString()=="HIDE")
                {
                andPic.setVisibility(View.INVISIBLE);
                btnHide.setText("SHOW");}
                else{
                    andPic.setVisibility(View.VISIBLE);
                    btnHide.setText("HIDE");
                }

            }
        });

    }








}

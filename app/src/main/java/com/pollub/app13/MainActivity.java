package com.pollub.app13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton  nxt,prv;
    ImageView imgv;
    Integer check=1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nxt =findViewById(R.id.imageButton2);
        prv=findViewById(R.id.imageButton);
        imgv =findViewById(R.id.imageView2);
        imgv.setImageResource(R.drawable.img1);


        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check==1){
                    imgv.setImageResource(R.drawable.img1);
                    check =2;
                }
                else if (check==2){
                    imgv.setImageResource(R.drawable.img2);
                    check =3;
                }
                else if(check==3){
                    imgv.setImageResource(R.drawable.img3);
                    check=1;
                }
            }
        });
        prv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check==1){
                    imgv.setImageResource(R.drawable.img1);
                    check=3;
                }
                else if (check==2){
                    imgv.setImageResource(R.drawable.img2);
                    check=1;
                }
                else if(check==3){
                    imgv.setImageResource(R.drawable.img3);
                    check=2;

                }

            }
        });


    }
}
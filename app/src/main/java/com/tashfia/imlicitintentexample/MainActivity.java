package com.tashfia.imlicitintentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_news,btn_sports  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_news =(Button)findViewById(R.id.btn_news);
        btn_sports =(Button)findViewById(R.id.btn_sports);


        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intentnews=new Intent(MainActivity.this,NewsActivity.class);
                startActivity(intentnews);
                Toast.makeText(MainActivity.this, "News", Toast.LENGTH_SHORT).show();

            }
        });



        btn_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intentsports=new Intent(MainActivity.this,SportsActivity.class);
                startActivity(intentsports);
                Toast.makeText(MainActivity.this, "sports", Toast.LENGTH_SHORT).show();


            }
        });



    }
}

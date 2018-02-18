package com.tashfia.imlicitintentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewsActivity extends AppCompatActivity {
Button btn_prothomalo,btn_jugantor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        btn_jugantor=(Button)findViewById(R.id.btn_jugantor);
        btn_prothomalo=(Button)findViewById(R.id.btn_prothomalo);


        btn_jugantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentjugantor =new Intent(Intent.ACTION_VIEW, Uri.parse("http://WWW.jugantor.com "));
                startActivity(intentjugantor);
                Toast.makeText(NewsActivity.this, "Jugantor", Toast.LENGTH_SHORT).show();
            }
        });


        btn_prothomalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentpalo =new Intent(Intent.ACTION_VIEW, Uri.parse("http://WWW.prothom-alo.com"));
                startActivity(intentpalo);
                Toast.makeText(NewsActivity.this, "Prothom Alo", Toast.LENGTH_SHORT).show();
            }
        });




    }
}

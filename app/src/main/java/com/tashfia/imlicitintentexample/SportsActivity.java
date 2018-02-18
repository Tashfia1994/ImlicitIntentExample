package com.tashfia.imlicitintentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SportsActivity extends AppCompatActivity {

    Button btn_starsports,btn_tensports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        btn_starsports=(Button)findViewById(R.id.btn_starsports);
        btn_tensports=(Button)findViewById(R.id.btn_tensports);

        btn_tensports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttensports = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sportsinspireslife.com/"));
                startActivity(intenttensports);
                Toast.makeText(SportsActivity.this, "Ten Sports", Toast.LENGTH_SHORT).show();
            }
        });


        btn_starsports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentstarsports = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.espn.in/"));
                startActivity(intentstarsports);
                Toast.makeText(SportsActivity.this, "Star Sports", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button share;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share=(Button) findViewById(R.id.share);
        textview=findViewById(R.id.Mytext);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sharetext=textview.getText().toString();
                Intent sendintent=new Intent();
                sendintent.setAction(Intent.ACTION_SEND);
                sendintent.setType("text/plain");
                sendintent.putExtra(Intent.EXTRA_TEXT,sharetext);
                startActivity(sendintent);

            }
        });

    }
}
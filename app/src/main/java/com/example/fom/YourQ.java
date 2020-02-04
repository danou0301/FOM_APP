package com.example.fom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class YourQ extends AppCompatActivity {

    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_q);
        buttonStart = (Button) findViewById(R.id.button27);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openFirstActivity();
            }
        });
    }

    public void openFirstActivity(){
        Intent intent = new Intent(getApplicationContext(), RecordPlayQ1.class);
        startActivity(intent);
    }
}

package com.example.fom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActi extends AppCompatActivity {

    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        buttonStart = (Button) findViewById(R.id.RegisterButton);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(getApplicationContext(), EmptyQ.class);
        startActivity(intent);
    }
}

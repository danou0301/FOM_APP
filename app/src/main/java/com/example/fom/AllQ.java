package com.example.fom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AllQ extends AppCompatActivity {

    private Button q1;
    private Button q2;
    private Button q3;
    private Button q4;
    private Button q5;
    private Button q6;
    private Button q7;
    private Button q8;
    private Button q9;
    private Button q10;
    private Button adding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_q);


        q1 = (Button) findViewById(R.id.button5);
        q1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q2 = (Button) findViewById(R.id.button6);
        q2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q3 = (Button) findViewById(R.id.button7);
        q3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q4 = (Button) findViewById(R.id.button8);
        q4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q5 = (Button) findViewById(R.id.button9);
        q5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q6 = (Button) findViewById(R.id.button10);
        q6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q7 = (Button) findViewById(R.id.button11);
        q7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){all_quest_acti();
            }
        });

        q8 = (Button) findViewById(R.id.button12);
        q8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q9 = (Button) findViewById(R.id.button13);
        q9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        q10 = (Button) findViewById(R.id.button14);
        q10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                all_quest_acti();
            }
        });

        adding = (Button) findViewById(R.id.button22);
        adding.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), YourQ.class);
                startActivity(intent);
            }
        });


    }


     public void all_quest_acti(){
         Bundle extras = getIntent().getExtras();
         Intent intent = new Intent(getApplicationContext(), RecordPlayQ1.class);
         if(extras != null)
         {
             intent.putExtra("NEXT_STEP", extras.getInt("Step"));

         }
         startActivity(intent);
     }
}

package com.example.fom;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
//import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Console;

public class RecordPlayQ1 extends AppCompatActivity {
    private static int VIDEO_REQUEST = 101;
    private Uri videoUri = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_play_q1);
        Button myButton;

        myButton = (Button) findViewById(R.id.buttonSaveVid);
        myButton.setOnClickListener(new View.OnClickListener() {

            int counter = 1;

            @Override
            public void onClick(View view) {
                System.out.println(counter);
                Bundle extras = getIntent().getExtras();
//                Intent intent = new Intent(getApplicationContext(), RecordPlayQ1.class);
                if(extras != null)
                {
                    int passCount = extras.getInt("NEXT_STEP");
                    if (passCount == 1) {
                        Intent intentNext = new Intent(getApplicationContext(), ScdQ.class);
                        startActivity(intentNext);
                    } else if (passCount == 2) {
                        Intent intentNext = new Intent(getApplicationContext(), ThirdQ.class);
                        startActivity(intentNext);
                    } else {
                        Intent intentNext = new Intent(getApplicationContext(), DoneQ.class);
                        startActivity(intentNext);
                    }

                }

            }
        });

    }

    public void captureVideo(View view) {
        Intent videoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (videoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(videoIntent, VIDEO_REQUEST);
        }
    }

    public void playVideo(View view) {
        Intent playIntent = new Intent(this, VideoPlayActivity.class);
        playIntent.putExtra("videoUri", videoUri.toString());
        startActivity(playIntent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == VIDEO_REQUEST && resultCode == RESULT_OK) {
            System.out.println(data.getData().toString());
            videoUri = data.getData();
            Data.getInstance().path1 = data.getData().toString();
            System.out.println(Data.getInstance().path1);
        }
    }
}

package com.example.fom;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;

public class DoneQ extends AppCompatActivity {

    private Button startAgain;
    private StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_q);
        mStorageRef = FirebaseStorage.getInstance().getReference();


        startAgain = (Button) findViewById(R.id.newStart);

        startAgain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String path, fileName;

                for (int i = 1; i<=3; i++){

                    if (i == 1){
                        path = Data.getInstance().path1;
                    }else if (i == 2){
                        path = Data.getInstance().path2;
                    } else {
                        path = Data.getInstance().path3;
                    }

                    System.out.println("Upload path: " + path);
                    Uri videoUri =  Uri.parse(path);

                    fileName = Data.getInstance().Myname + "-" + Data.getInstance().hero + "-" + Data.getInstance().date + "-" + i + ".mp4";
                    System.out.println("Upload name: " + fileName);

                    StorageReference riversRef = mStorageRef.child(fileName);

                    riversRef.putFile(videoUri)
                            .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                                @Override
                                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                    // Get a URL to the uploaded content
                                    System.out.println("Success");
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception exception) {
                                    // Handle unsuccessful uploads
                                    System.out.println("Error");

                                }
                            });
                }

                //Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                //startActivity(intent);
            }
        });


    }
}

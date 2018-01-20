package com.londonappbrewery.iampoor;

import android.app.Activity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button asKbutton;
        asKbutton = (Button) findViewById(R.id.askButton);
        final ImageView Imageball= (ImageView)findViewById(R.id.image_eightBall);
        final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,

        };
         asKbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Log.d("8 Ball", "the button has been pressed");
                 Random RandomBallGenerator = new Random();
                 int number=RandomBallGenerator.nextInt(5);
                 Log.d("8 Ball", "the random number is ");
                 Imageball.setImageResource(ballArray[number]);


             }
         });

    }
}

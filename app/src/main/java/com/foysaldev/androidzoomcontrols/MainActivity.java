package com.foysaldev.androidzoomcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.ImageViewID);
        zoomControls = findViewById(R.id.ZoomControlsid);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();
                imageView.setScaleX((float) x +1);
                imageView.setScaleX((float) y +1);
                Toast.makeText(MainActivity.this, "Zoom In", Toast.LENGTH_SHORT).show();
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if (x > 1 && y > 1) {
                    imageView.setScaleX((float) x -1);
                    imageView.setScaleX((float) y -1);
                }

                Toast.makeText(MainActivity.this, "Zoom Out", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
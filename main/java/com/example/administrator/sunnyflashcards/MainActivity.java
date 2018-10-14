package com.example.administrator.sunnyflashcards;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.drawable.Drawable;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Drawable greenShape = getDrawable(R.drawable.greenshape);
        final Drawable redShape = getDrawable(R.drawable.redshape);
        final Drawable grayShape = getDrawable(R.drawable.grayshape);

        findViewById(R.id.Question).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.Question).setVisibility(findViewById(R.id.Question).INVISIBLE);
                findViewById(R.id.Answer).setVisibility(findViewById(R.id.Answer).VISIBLE);
            };
        });

        findViewById(R.id.Answer).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.Question).setVisibility(findViewById(R.id.Question).VISIBLE);
                findViewById(R.id.Answer).setVisibility(findViewById(R.id.Answer).INVISIBLE);
            };
        });

        findViewById(R.id.Answer1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.Answer1).setBackground(greenShape);
            };
        });

        findViewById(R.id.Answer2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.Answer1).setBackground(greenShape);
                findViewById(R.id.Answer2).setBackground(redShape);
            };
        });

        findViewById(R.id.Answer3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.Answer1).setBackground(greenShape);
                findViewById(R.id.Answer3).setBackground(redShape);
            };
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.Question).setVisibility(findViewById(R.id.Question).VISIBLE);
                findViewById(R.id.Answer).setVisibility(findViewById(R.id.Answer).INVISIBLE);
                findViewById(R.id.Answer1).setBackground(grayShape);
                findViewById(R.id.Answer2).setBackground(grayShape);
                findViewById(R.id.Answer3).setBackground(grayShape);
            };
        });

        findViewById(R.id.show).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.show).setVisibility(findViewById(R.id.show).INVISIBLE);
                findViewById(R.id.notShow).setVisibility(findViewById(R.id.notShow).VISIBLE);
                findViewById(R.id.Answer1).setVisibility(findViewById(R.id.Answer1).INVISIBLE);
                findViewById(R.id.Answer2).setVisibility(findViewById(R.id.Answer2).INVISIBLE);
                findViewById(R.id.Answer3).setVisibility(findViewById(R.id.Answer3).INVISIBLE);
            };
        });

        findViewById(R.id.notShow).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                findViewById(R.id.show).setVisibility(findViewById(R.id.show).VISIBLE);
                findViewById(R.id.notShow).setVisibility(findViewById(R.id.notShow).INVISIBLE);
                findViewById(R.id.Answer1).setVisibility(findViewById(R.id.Answer1).VISIBLE);
                findViewById(R.id.Answer2).setVisibility(findViewById(R.id.Answer2).VISIBLE);
                findViewById(R.id.Answer3).setVisibility(findViewById(R.id.Answer3).VISIBLE);
            };
        });

    }
}

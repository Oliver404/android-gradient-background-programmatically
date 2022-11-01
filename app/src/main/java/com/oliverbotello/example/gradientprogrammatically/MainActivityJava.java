package com.oliverbotello.example.gradientprogrammatically;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivityJava extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignGradient();
    }

    private void assignGradient() {
        GradientDrawable gradient = new GradientDrawable();

        gradient.setColors(randomColors());
        gradient.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradient.setGradientType(GradientDrawable.LINEAR_GRADIENT);
        gradient.setShape(GradientDrawable.RECTANGLE);
        findViewById(R.id.content).setBackground(gradient);
    }

    private int[] randomColors() {
        return new int[] {getRandomColor(), getRandomColor()};
    }

    private int getRandomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        return Color.rgb(r, g, b);
    }
}

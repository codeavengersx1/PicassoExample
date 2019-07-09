package com.codeavengers.picassoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private static final String IMAGE_URL = "https://images.unsplash.com/photo-1562555199-732a21a30a36?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1534&q=80";

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Init the ImageView
        * */
        mImageView = findViewById(R.id.imageView);

        /*
        * Code to load image from URL #Janmabhar
        * */
        Picasso.get().load(IMAGE_URL).into(mImageView);
    }
}

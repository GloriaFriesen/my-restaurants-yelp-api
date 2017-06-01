package com.epicodus.myrestaurants.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Typeface;

import com.epicodus.myrestaurants.R;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.emberButton) Button mEmberButton;
    @Bind(R.id.enterZip) EditText mZipEditText;
    @Bind(R.id.myRestaurantsTextView) TextView mMyRestaurantsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mEmberButton.setOnClickListener(this);
        Typeface pacificoFont = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        mMyRestaurantsTextView.setTypeface(pacificoFont);
    }

    @Override
    public void onClick(View v) {
        if (v == mEmberButton) {
            String location = mZipEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}

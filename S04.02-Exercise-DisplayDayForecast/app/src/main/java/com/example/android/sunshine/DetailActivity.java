package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView textViewWeatherForDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // DONE (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        String weatherForDay = intent.getStringExtra(Intent.EXTRA_TEXT);

        this.textViewWeatherForDay = (TextView) findViewById(R.id.tv_weather_for_day);
        this.textViewWeatherForDay.setText(weatherForDay);
    }
}
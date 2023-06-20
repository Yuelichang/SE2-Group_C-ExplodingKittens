package com.example.se2_exploding_kittens.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.se2_exploding_kittens.R;

public class MainActivity extends AppCompatActivity {
    private Button joinGameButton;
    private Button hostGameButton;


    SensorManager sensorManager;
    private Sensor lightSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        joinGameButton = findViewById(R.id.join_game_button);
        hostGameButton = findViewById(R.id.host_game_button);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

        joinGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JoinGameActivity.class);
                startActivity(intent);
            }
        joinGameButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, JoinGameActivity.class);
            startActivity(intent);
        });

        hostGameButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HostGameActivity.class);
            startActivity(intent);
        });
    }


}
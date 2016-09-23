package com.cmpe277.temperaturehumidity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText inputTemp;
    private EditText inputHumid;
    private String TEMPERATURE = "TEMPERATURE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTemp = (EditText) findViewById(R.id.temperature);
        inputHumid = (EditText) findViewById(R.id.humidity);
    }

    public void onSet(View v){

        int temperature = Integer.parseInt(inputTemp.getText().toString());
        //int humidity = Intent.parseIntent(inputHumid.getText().toString());
        if(temperature != 0 ){
            Intent intent = new Intent("poultry.farm.current.temperature");
            intent.putExtra(TEMPERATURE, temperature);
            sendBroadcast(intent);
        }

    }

    public void onCancel(View v){
        inputTemp.setText("");
        inputHumid.setText("");
    }
}

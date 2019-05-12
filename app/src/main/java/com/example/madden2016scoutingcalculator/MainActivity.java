package com.example.madden2016scoutingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "chrisMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        Button calculateButton = findViewById(R.id.calculate_Button);

        calculateButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View V) {
                        EditText fortyTime_UserInput = findViewById(R.id.fortyTime_UserInput);
                        EditText threeConeDrill_UserInput = findViewById(R.id.threeConeDrill_UserInput);
                        EditText twentyYardShuttle_UserInput = findViewById(R.id.twentyYardShuttle_UserInput);

                        TextView speedOutput = findViewById(R.id.speedOutput);
                        TextView accelerationOutput = findViewById(R.id.accelerationOutput);
                        TextView agilityOutput = findViewById(R.id.agilityOutput);

                        double num3 = Double.parseDouble(fortyTime_UserInput.getText().toString());
                        double num1 = Double.parseDouble(threeConeDrill_UserInput.getText().toString());
                        double num2 = Double.parseDouble(twentyYardShuttle_UserInput.getText().toString());

                        double acc, agi;
                        acc = -65.78539 * (num1 - (0.9 * num2)) + 298.87444;
                        agi = -86.14428 * (num2 - (0.5 * num1)) + 148.54528;

                        String strAcc, strAgi;
                        strAcc = Integer.toString((int)acc);
                        strAgi = Integer.toString((int)agi);

                        speedOutput.setText(apple(num3));
                        accelerationOutput.setText(strAcc);
                        agilityOutput.setText(strAgi);
                    }
                }

        );
    }

    private String apple(double a) {
        // result initialization
        String result = "";

        String[] speed_array =  {
                "4.24-99",
                "4.27-98",
                "4.30-97",
                "4.32-96",
                "4.35-95",
                "4.38-94",
                "4.41-93",
                "4.43-92",
                "4.46-91",
                "4.49-90",
                "4.52-89",
                "4.54-88",
                "4.57-87",
                "4.60-86",
                "4.63-85",
                "4.65-84",
                "4.68-83",
                "4.71-82",
                "4.74-81",
                "4.76-80",
                "4.79-79",
                "4.82-78",
                "4.85-77",
                "4.87-76",
                "4.90-75",
                "4.93-74",
                "4.96-73",
                "4.98-72",
                "5.01-71",
                "5.04-70",
                "5.07-69",
                "5.09-68",
                "5.12-67",
                "5.15-66",
                "5.18-65",
                "5.20-64",
                "5.23-63",
                "5.26-62",
                "5.29-61",
                "5.31-60",
                "5.34-59",
                "5.37-58",
                "5.40-57",
                "5.42-56",
                "5.45-55",
                "5.48-54",
                "5.51-53",
                "5.53-52",
                "5.56-51"
        };

        String string_a = Double.toString(a);

        for(int i = 0; i <= speed_array.length; i++) {

            if(i == speed_array.length) {
                result = "Speed is 50 or lower";
                break;
            }
            else if(speed_array[i].contains(string_a)) {
                result = speed_array[i].substring(speed_array[i].lastIndexOf("-") + 1);
                break;
            }
        }
        return result;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }

}

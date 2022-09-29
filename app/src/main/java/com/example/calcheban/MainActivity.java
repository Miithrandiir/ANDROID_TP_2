package com.example.calcheban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRAZClick(View view) {
        EditText value1 = (EditText) findViewById(R.id.editTextTextPersonName);
        value1.setText(null);

        EditText value2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        value2.setText(null);
    }

    public void onCalcClick(View view) {
        EditText valueView1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText valueView2 = (EditText) findViewById(R.id.editTextTextPersonName2);

        String valueStr1 = valueView1.getText().toString();
        String valueStr2 = valueView2.getText().toString();

        if(!valueStr1.isEmpty() && !valueStr2.isEmpty()) {

            double value1 = Double.parseDouble(valueStr1);
            double value2 = Double.parseDouble(valueStr2);

            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

            double res = 0;

            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.radioButton_plus:
                    res = value1 + value2;
                    break;
                case R.id.radioButton_moins:
                    res = value1 - value2;
                    break;
                case R.id.radioButton_diviser:
                    res = value1 / value2;
                    break;
                case R.id.radioButton_multiplier:
                    res = value1 * value2;
                    break;
            }

            TextView textView = (TextView) findViewById(R.id.textView_Resultat);
            textView.setText(String.valueOf(res));

        }

    }

    public void onQuitClick(View view)
    {
        this.finish();
    }
}
package com.example.bruno.simplemath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AppMathActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonadd, buttontimes, buttondivide;
    private TextView resultLabel;
    private EditText firstNumber, secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_math);
        init();
    }

    private void init() {
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttontimes = (Button) findViewById(R.id.buttontimes);
        buttondivide = (Button) findViewById(R.id.buttondivide);
        resultLabel = (TextView) findViewById(R.id.resultLabel);
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);
        buttonadd.setOnClickListener(this);
        buttontimes.setOnClickListener(this);
        buttondivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (firstNumber.getText().toString().matches("") || secondNumber.getText().toString().matches("")) {
            return;
        }
        Integer firstN = Integer.parseInt(firstNumber.getText().toString());
        Integer secondN = Integer.parseInt(secondNumber.getText().toString());
        switch (view.getId()) {
            case R.id.buttonadd:
                resultLabel.setText(String.valueOf(firstN + secondN));
                break;
            case R.id.buttontimes:
                resultLabel.setText(String.valueOf(firstN + secondN));
                break;
            case R.id.buttondivide:
                resultLabel.setText(String.valueOf(firstN + secondN));
                break;
            default:
                break;
        }
    }
}

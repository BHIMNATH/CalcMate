package com.abnstudio.calcmate;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , buttonDot , buttonAC , buttonEqual, buttonBackspace, buttonAns, buttonSqrt ;
    TextView display ;
    float mValueOne, mValueTwo, lastAns = 0;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttondot);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonAC = findViewById(R.id.buttonac);
        buttonEqual = findViewById(R.id.buttoneql);
        buttonBackspace = findViewById(R.id.buttonbackspace);
        buttonAns = findViewById(R.id.buttonAns);
        display = findViewById(R.id.edt1);
        buttonSqrt = findViewById(R.id.buttonsqrt);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "1");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "2");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText()+"3");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "4");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "5");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "6");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "7");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "8");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + "9");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText()+"0");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (display == null){
                        display.setText("");
                    }else {
                        mValueOne = Float.parseFloat(display.getText() + "");
                        mAddition = true;
                        display.setText(null);
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    mSubtract = true;
                    display.setText(null);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    mMultiplication = true;
                    display.setText(null);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    mDivision = true;
                    display.setText(null);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(display.getText() + "");
                try {
                    if (mAddition) {
                        lastAns = mValueOne + mValueTwo;
                        display.setText( lastAns + "");
                        mAddition = false;
                    }

                    if (mSubtract) {
                        lastAns = mValueOne - mValueTwo;
                        display.setText( lastAns + "");
                        mSubtract = false;
                    }

                    if (mMultiplication) {
                        lastAns = mValueOne * mValueTwo;
                        display.setText(lastAns + "");
                        mMultiplication = false;
                    }

                    if (mDivision) {
                        lastAns = mValueOne / mValueTwo;
                        display.setText( lastAns + "");
                        mDivision = false;
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText("0");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText() + ".");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String str = display.getText().toString();
                    if (str.length() > 1) {
                        str = str.substring(0, str.length() - 1);
                        display.setText(str);
                    } else {
                        display.setText("0");
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        buttonAns.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    display.setText("ANS");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText((int) (Math.sqrt(Float.parseFloat(display.getText().toString()))));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}

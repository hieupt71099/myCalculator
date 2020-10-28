package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button dot;
    Button equal;
    Button plus;
    Button minus;
    Button multiple;
    Button divide;
    Button ce;
    Button c;
    Button bs;
    Button lunisolar;
    TextView output;
    String firstnum = "";
    String toantu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.one);
        num2 = findViewById(R.id.two);
        num3 = findViewById(R.id.three);
        num4 = findViewById(R.id.four);
        num5 = findViewById(R.id.five);
        num6 = findViewById(R.id.six);
        num7 = findViewById(R.id.seven);
        num8 = findViewById(R.id.eight);
        num9 = findViewById(R.id.nine);
        num0 = findViewById(R.id.zero);
        output = findViewById(R.id.screen);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.add);
        minus = findViewById(R.id.sub);
        multiple = findViewById(R.id.mul);
        divide = findViewById(R.id.div);
        ce = findViewById(R.id.ce);
        c = findViewById(R.id.c);
        bs = findViewById(R.id.bs);
        lunisolar = findViewById(R.id.lunisolar);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                        output.setText("1");
                }
                else {
                    output.setText(output.getText() + "1");
                }

            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("2");
                } else {
                    output.setText(output.getText() + "2");
                }
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("3");
                }
                else {
                    output.setText(output.getText() + "3");
                }

            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("4");
                }
                else {
                    output.setText(output.getText() + "4");
                }

            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("5");
                }
                else {
                    output.setText(output.getText() + "5");
                }

            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("6");
                }
                else {
                    output.setText(output.getText() + "6");
                }

            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("7");
                }
                else {
                    output.setText(output.getText() + "7");
                }

            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("8");
                }
                else {
                    output.setText(output.getText() + "8");
                }

            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (output.getText().equals("0") ||
                        output.getText().equals("+")||
                        output.getText().equals("-")||
                        output.getText().equals("*")||
                        output.getText().equals("/")){
                    output.setText("9");
                }
                else {
                    output.setText(output.getText() + "9");
                }

            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(".");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = 0;
                if (toantu.equals("+")) {
                    result =  Integer. parseInt(firstnum) +  Integer. parseInt( (String) output.getText());
                }
                else if (toantu.equals("-")) {
                    result =  Integer. parseInt(firstnum) -  Integer. parseInt( (String) output.getText());
                }
                else if (toantu.equals("*")) {
                    result =  Integer. parseInt(firstnum) *  Integer. parseInt( (String) output.getText());
                }
                else if (toantu.equals("/")) {
                    result =  Integer. parseInt(firstnum) /  Integer. parseInt( (String) output.getText());
                }
                output.setText(String.valueOf(result));
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstnum = (String) output.getText();
                toantu =  "+";
                output.setText(toantu);
            }
    });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstnum = (String) output.getText();
                toantu = "-";
                output.setText(toantu);
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstnum = (String) output.getText();
                toantu = "*";
                output.setText(toantu);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstnum = (String) output.getText();
                toantu = "/";
                output.setText(toantu);
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstnum.equals("")){
                    output.setText("0");}
                else {output.setText(firstnum);
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("0");
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "";
                result = output.getText().toString();
                if ((result != null) && (result.length() > 1)) {
                    result = result.substring(0, result.length() - 1);
                    output.setText(result);
                }
                else {
                    output.setText("0");
                }

            }
        });
        lunisolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int result = 0;
               result = - Integer. parseInt( (String) output.getText());
               output.setText(String.valueOf(result));
            }
        });

    }
}
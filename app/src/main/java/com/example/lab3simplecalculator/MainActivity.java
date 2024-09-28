package com.example.lab3simplecalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none, add, minus, multiply, divide}

    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.resultsedit), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btn00click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "0");
    }

    public void btn01click(View view) {
        TextView eText = (TextView)findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "1");
    }

    public void btn02click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "2");
    }

    public void btn03click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "3");
    }

    public void btn04click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "4");
    }

    public void btn05click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "5");
    }

    public void btn06click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "6");
    }

    public void btn07click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "7");
    }

    public void btn08click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "8");
    }

    public void btn09click(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + "9");
    }

    public void btnAddclick(View view) {
        optr = Operator.add;
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusclick(View view) {
        optr = Operator.add;
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyclick(View view) {
        optr = Operator.add;
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");

    }

    public void btnDivideclick(View view) {
        optr = Operator.add;
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearclick(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText("");
    }

    public void btnDotclick(View view) {
        TextView eText = (TextView) findViewById(R.id.resultsedit);
        eText.setText(eText.getText() + ".");
    }

    public void btnResultclick(View view) {
        if (optr != Operator.none) {
            TextView eText = (TextView)findViewById(R.id.resultsedit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;

            if (optr == Operator.add) {
                result = data1 + data2;
            } else if (optr == Operator.minus) {
                result = data1 - data2;
            } else if (optr == Operator.multiply) {
                result = data1 * data2;
            } else if (optr == Operator.divide) {
                result = data1 / data2;
            }

            optr = Operator.none;
            data1 = result;
            if ((result - (int) result) != 0) {
                eText.setText(String.valueOf(result));
            } else {
                eText.setText(String.valueOf((int) result));
            }
        }
    }
}
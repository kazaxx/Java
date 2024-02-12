package com.example.calcullate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText number_filed_1, number_filed_2;
    private Button plus, minus, divide, percent, root, with;

    private TextView result, resultt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        number_filed_1 = findViewById(R.id.number_filed_1);
        number_filed_2 = findViewById(R.id.number_filed_2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        percent = findViewById(R.id.percent);
        root = findViewById(R.id.root);
        with = findViewById(R.id.with);
        resultt = findViewById(R.id.resultt);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                resultt.setText("");
                int num1 = Integer.parseInt(number_filed_1.getText().toString());
                int num2 = Integer.parseInt(number_filed_2.getText().toString());
                int plus = num1 * num2;
                String res = "Умножение чисел: " + plus;
                resultt.setText(res);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                resultt.setText("");
                int num1 = Integer.parseInt(number_filed_1.getText().toString());
                int num2 = Integer.parseInt(number_filed_2.getText().toString());
                int minus = num1 - num2;
                String res = "Вычитание чисел: " + minus;
                resultt.setText(res);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                resultt.setText("");
                int num1 = Integer.parseInt(number_filed_1.getText().toString());
                int num2 = Integer.parseInt(number_filed_2.getText().toString());
                int divide = num1 / num2;
                String res = "Деление чисел: " + divide;
                resultt.setText(res);
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                resultt.setText("");
                int num1 = Integer.parseInt(number_filed_1.getText().toString());
                int num2 = Integer.parseInt(number_filed_2.getText().toString());


                int percent1 = (num1 * 100) / num2;
                String res1 = "Процент числа 1 от числа 2: " + percent1 + "%";


                int percent2 = (num2 * 100) / num1;
                String res2 = "Процент числа 2 от числа 1: " + percent2 + "%";


                String finalResult = res1 + "\n" + res2;
                result.setText(finalResult);
            }
        });


        with.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                resultt.setText("");
                int num1 = Integer.parseInt(number_filed_1.getText().toString());
                int num2 = Integer.parseInt(number_filed_2.getText().toString());
                int sum = num1 + num2;
                String res = "Сумма чисел: " + sum;
                resultt.setText(res);
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                resultt.setText("");
                int num1 = Integer.parseInt(number_filed_1.getText().toString());
                int num2 = Integer.parseInt(number_filed_2.getText().toString());
                double cor1 = Math.sqrt(num1);
                double cor2 = Math.sqrt(num2);

                String res = "Корень из числа 1: " + String.format("%.2f", cor1) + "\nКорень из числа 2: " + String.format("%.2f", cor2);
                result.setText(res);
            }
        });

    }
}

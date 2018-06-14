package com.vehiclest.vst.calculator;

import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout my_layout =findViewById(R.id.my_layout);


        final TextView text = findViewById(R.id.tv_text);
        final Button  button_clear = findViewById(R.id.clear_button);
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String clear= text.getText().toString();
                if(clear.length()!=0) {
                    clear = clear.substring(0, clear.length() - 1);
                    text.setText(clear);
                }

            }
        });
        Button button_0= findViewById(R.id.button_0);
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             text.append("0");
            }
        });

        Button button_1= findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("1");
            }
        });
        
        Button button_2= findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("2");
            }
        });
        Button button_3= findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("3");
            }
        });
        Button button_4= findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("4");
            }
        });
        Button button_5= findViewById(R.id.button_5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("5");
            }
        });
        Button button_6= findViewById(R.id.button_6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("6");
            }
        });
        Button button_7= findViewById(R.id.button_7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("7");
            }
        });
        Button button_8= findViewById(R.id.button_8);
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("8");
            }
        });
        Button button_9= findViewById(R.id.button_9);
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("9");
            }
        });
        Button button_plus= findViewById(R.id.button_plus);
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("+");
            }
        });
        Button button_min= findViewById(R.id.button_minus);
        button_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("-");
            }
        });
        Button button_mul= findViewById(R.id.button_mul);
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("*");
            }
        });
        Button button_div= findViewById(R.id.button_div);
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("/");
            }
        });
        Button button_point= findViewById(R.id.button_dot);
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append(".");
            }
        });
        Button button_bracket_1= findViewById(R.id.button_left_bracket);
        button_bracket_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("(");
            }
        });
        Button button_bracket_2= findViewById(R.id.button_right_bracket);
        button_bracket_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append(")");
            }
        });
        Button button_equal= findViewById(R.id.equal);
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equalCheck= text.getText().toString();
                if (!equalCheck.contains("=")){
                    text.append("=");
//                    calculate(text);


                }
                Expression expression = new ExpressionBuilder(equalCheck).build();
                double result = expression.evaluate();
                text.setText(Double.toString(result));


            }
        });


    }

    public void calculate(View view) {
//        findViewById(R.id.tv_text);
    }
}

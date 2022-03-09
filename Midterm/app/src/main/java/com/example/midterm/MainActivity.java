/*
  Name: Yagnik Virani
  Student ID :A00227162
 */

package com.example.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //number1 and number2 to store input into it and result is for store the result after operation
    double number1 = 0, number2 = 0, result = 0;

    //textview for showing number and result  name is screen1textview
    TextView screen1textview;

    //operation variables such as Add for addition, Sub for subtraction , Mul for multiplication and Div for division and decimal
    boolean Add, Sub, Mul, Div, decimal;

    //buttons for 0 to 9 numbers
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    //buttons for operations and equal, clear and for point
    Button btnAdd, btnSub, btnMul, btnDiv, btnEq, btnclr, btnpoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get screen1 textview by it's id and store into screen1textview
        screen1textview = (TextView) findViewById(R.id.screen1);

        // get b0 button by it's id and store into btn0
        btn0 = (Button) findViewById(R.id.b0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 0 onClick event
                screen1textview.setText(screen1textview.getText() + "0");
            }
        });

        // get b1 button by it's id and store into btn1
        btn1 = (Button) findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 1 onClick event
                screen1textview.setText(screen1textview.getText() + "1");
            }

        });

        // get b2 button by it's id and store into btn2
        btn2 = (Button) findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 2 onClick event
                screen1textview.setText(screen1textview.getText() + "2");
            }
        });

        // get b3 button by it's id and store into btn3
        btn3 = (Button) findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 3 onClick event
                screen1textview.setText(screen1textview.getText() + "3");
            }
        });

        // get b4 button by it's id and store into btn4
        btn4 = (Button) findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 4 onClick event
                screen1textview.setText(screen1textview.getText() + "4");
            }
        });

        // get b5 button by it's id and store into btn5
        btn5 = (Button) findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 5 onClick event
                screen1textview.setText(screen1textview.getText() + "5");
            }
        });

        // get b6 button by it's id and store into btn6
        btn6 = (Button) findViewById(R.id.b6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 6 onClick event
                screen1textview.setText(screen1textview.getText() + "6");
            }
        });

        // get b7 button by it's id and store into btn7
        btn7 = (Button) findViewById(R.id.b7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 7 onClick event
                screen1textview.setText(screen1textview.getText() + "7");
            }
        });

        // get b8 button by it's id and store into btn8
        btn8 = (Button) findViewById(R.id.b8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 8 onClick event
                screen1textview.setText(screen1textview.getText() + "8");
            }
        });

        // get b9 button by it's id and store into btn9
        btn9 = (Button) findViewById(R.id.b9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for 9 onClick event
                screen1textview.setText(screen1textview.getText() + "9");
            }
        });

        // get point button by it's id and store into btnpoint
        btnpoint = (Button) findViewById(R.id.btnpoint);
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set screen1textview value for . onClick event
                    screen1textview.setText(screen1textview.getText() + ".");
                    decimal = true;
            }
        });

        // get addition button by it's id and store into btnAdd
        btnAdd = (Button) findViewById(R.id.btnadd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if screen1textview length is 0, then set text null
                if (screen1textview.getText().length() == 0) {
                    screen1textview.setText(null);
                }
                else
                {
                    number1 = Float.parseFloat(screen1textview.getText() + "");
                    screen1textview.setText(number1 + "+");
                    Add = true;
                    screen1textview.setText(null);
                }

            }
        });

        // get subtraction button by it's id and store into btnSub
        btnSub = (Button) findViewById(R.id.btnsub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if screen1textview length is 0, then set text null
                if (screen1textview.getText().length() == 0) {
                    screen1textview.setText(null);
                }
                else{
                    number1 = Float.parseFloat(screen1textview.getText() + "");
                    screen1textview.setText(number1 + "-");
                    Sub = true;
                    screen1textview.setText(null);
                }
            }
        });

        // get multiplication button by it's id and store into btnMul
        btnMul = (Button) findViewById(R.id.btnmul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if screen1textview length is 0, then set text null
                if (screen1textview.getText().length() == 0) {
                    screen1textview.setText(null);
                }
                else{
                    number1 = Float.parseFloat(screen1textview.getText() + "");
                    screen1textview.setText(number1 + "*");
                    Mul = true;
                    screen1textview.setText(null);
                }
            }
        });


        // get division button by it's id and store into btnDiv
        btnDiv = (Button) findViewById(R.id.btndiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if screen1textview length is 0, then set text null
                if (screen1textview.getText().length() == 0) {
                    screen1textview.setText(null);
                }
                else {
                    number1 = Float.parseFloat(screen1textview.getText() + "");
                    screen1textview.setText(number1 + "/");
                    Div = true;
                    screen1textview.setText(null);
                }
            }
        });

        // get equal button by it's id and store into btnEq
        btnEq = (Button) findViewById(R.id.btneql);
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            //check condition after click on equal button and perform operation base on that condition
            public void onClick(View v) {
                //For addition, add numbers and store into result variable and print all in screen
                if (Add) {
                    number2 = Float.parseFloat(screen1textview.getText() + "");
                    result = number1 + number2;
                    screen1textview.setText(number1 + "+"+ number2+"= " +result);
                }

                //For Subtraction, subtract numbers and store into result variable and print all in screen
                if (Sub) {
                    number2 = Float.parseFloat(screen1textview.getText() + "");
                    result = number1 - number2;
                    screen1textview.setText(number1 + "-"+ number2+"= " +result);
                }

                //For Multiplication, multiply numbers and store into result variable and print all in screen
                if (Mul) {
                    number2 = Float.parseFloat(screen1textview.getText() + "");
                    result = number1 * number2;
                    screen1textview.setText(number1 + "*"+ number2+"= " +result);
                }

                //For Division, divide numbers and store into result variable and print all in screen
                if (Div) {
                    number2 = Float.parseFloat(screen1textview.getText() + "");
                    result = number1 / number2;
                    screen1textview.setText(number1 + "/"+ number2+"= " +result);
                }
            }
        });


        // get clear button by it's id and store into btnclr
        btnclr = (Button) findViewById(R.id.btnclear);
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear screen text
                screen1textview.setText("");
                number1 = 0.0;
                number2 = 0.0;
            }
        });
    }
}

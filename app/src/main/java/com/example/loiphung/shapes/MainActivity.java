package com.example.loiphung.shapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calculate = findViewById(R.id.button3);
        ImageView circle = findViewById(R.id.circle);
        ImageView square = findViewById(R.id.square);
        ImageView tri = findViewById(R.id.triangle);
        final TextView length1Text = findViewById(R.id.length1text);
        final TextView length2Text = findViewById(R.id.length2text);
        final TextView answerText = findViewById(R.id.areaText);

        length1Text.setText("Length 1: ");
        length2Text.setText("Length 2: ");
        answerText.setText(" ");


        final EditText length1 = findViewById(R.id.length1);
        final EditText length2 = findViewById(R.id.length2);



        final TextView shapeText = findViewById(R.id.shapeSelected);

        shapeText.setText("No shape selected");
        calculate.setText("Calculate");


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double l1, l2 = 0;
                double answer = 0;

                if(shapeText.getText() == "No shape selected"){

                    Toast t = Toast.makeText(MainActivity.this, "No shape selected", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                else if(shapeText.getText() == "Circle Selected"){
                    //if values are empty
                    if (length1.getText().toString().isEmpty()){
                        Toast t = Toast.makeText(MainActivity.this, "Please enter missing value", Toast.LENGTH_LONG);
                        t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        t.show();
                        return;
                    }

                    l1 = Integer.parseInt(length1.getText().toString());


                    answer = 3.14 * l1 * l1;
                    //Toast.makeText(MainActivity.this, "Area of Circle is " + answer, Toast.LENGTH_LONG).show();
                    answerText.setText("Area of Circle is: " + answer);


                }
                else if (shapeText.getText() == "Triangle Selected"){

                    if (length1.getText().toString().isEmpty() || length2.getText().toString().isEmpty()){
                        Toast t = Toast.makeText(MainActivity.this, "Please enter missing value", Toast.LENGTH_LONG);
                        t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        t.show();
                        return;
                    }

                    l1 = Integer.parseInt(length1.getText().toString());
                    l2 = Integer.parseInt(length2.getText().toString());


                    answer = (l1 * l2) / 2;
                    //Toast.makeText(MainActivity.this, "Area of Triangle is " + answer, Toast.LENGTH_LONG).show();
                    answerText.setText("Area of Triangle is: " + answer);

                }
                else if (shapeText.getText() == "Square Selected"){

                    if (length1.getText().toString().isEmpty() || length2.getText().toString().isEmpty()){
                        Toast t = Toast.makeText(MainActivity.this, "Please enter missing value", Toast.LENGTH_LONG);
                        t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        t.show();
                        return;
                    }

                    l1 = Integer.parseInt(length1.getText().toString());
                    l2 = Integer.parseInt(length2.getText().toString());


                    answer = l1 * l2;
                    //Toast.makeText(MainActivity.this, "Area of Square is " + answer, Toast.LENGTH_LONG).show();
                    answerText.setText("Area of Square is: " + answer);

                }
                else{

                    Toast t = Toast.makeText(MainActivity.this, "No shape selected", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }



            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeText.setText("Circle Selected");
                length1Text.setText("Radius: ");
                length2Text.setText("");
                findViewById(R.id.length2).setEnabled(false);

            }
        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeText.setText("Triangle Selected");
                length1Text.setText("Height: ");
                length2Text.setText("Base: ");
                findViewById(R.id.length2).setEnabled(true);

            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeText.setText("Square Selected");
                length1Text.setText("Length: ");
                length2Text.setText("Width: ");
                findViewById(R.id.length2).setEnabled(true);

            }
        });


    }// end on create

    @Override
    protected void onStart() {
        super.onStart();



    }
}

package com.example.loiphung.shapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        Button calulate = findViewById(R.id.button3);
        ImageView circle = findViewById(R.id.circle);
        ImageView square = findViewById(R.id.square);
        ImageView tri = findViewById(R.id.triangle);
        TextView length1Text = findViewById(R.id.length1text);
        TextView length2Text = findViewById(R.id.length2text);

        length1Text.setText("Length 1: ");
        length2Text.setText("Length 2: ");


        final EditText length1 = findViewById(R.id.length1);
        final EditText length2 = findViewById(R.id.length2);


        final TextView shapeText = findViewById(R.id.shapeSelected);

        shapeText.setText("No shape selected");


        calulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double l1, l2;

                if(shapeText.getText() == "No shape selected"){
                    Toast.makeText(MainActivity.this, "No shape selected", Toast.LENGTH_LONG).show();
                }
                else if(shapeText.getText() == "Circle Selected"){

                    l1 = Integer.parseInt(length1.getText().toString());

                    double answer;
                    answer = 3.14 * l1 * l1;
                    Toast.makeText(MainActivity.this, "Area of Circle is " + answer, Toast.LENGTH_LONG).show();


                }
                else if (shapeText.getText() == "Triangle Selected"){

                    l1 = Integer.parseInt(length1.getText().toString());
                    l2 = Integer.parseInt(length2.getText().toString());

                    double answer;
                    answer = (l1 * l2) / 2;
                    Toast.makeText(MainActivity.this, "Area of Triangle is " + answer, Toast.LENGTH_LONG).show();

                }
                else if (shapeText.getText() == "Square Selected"){

                    l1 = Integer.parseInt(length1.getText().toString());
                    l2 = Integer.parseInt(length2.getText().toString());

                    double answer;
                    answer = l1 * l2;
                    Toast.makeText(MainActivity.this, "Area of Square is " + answer, Toast.LENGTH_LONG).show();

                }


            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeText.setText("Circle Selected");

            }
        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeText.setText("Triangle Selected");

            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeText.setText("Square Selected");

            }
        });






    }// end on create

    @Override
    protected void onStart() {
        super.onStart();



    }
}

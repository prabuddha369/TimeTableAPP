package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton radioButton1,radioButton2;
    private TextView textView;
    private final String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday"};
    private final String[] yr={"1st year","2nd year","3rd year","4th year"};
    private String Day,YR;
    private final String[][][][] TimeTable={
            {
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE A
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE B
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE C
            },//1st Year
            {
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE A
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE B
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE C
            },//2nd Year
            {
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE A
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE B
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE C
            },//3rd Year
            {
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE A
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE B
                    {
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Monday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Tuesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Wednesday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Thursday
                            {"X subject, Y teacher, Z room number","X subject, Y teacher, Z room number", "X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number","X subject, Y teacher, Z room number"},//Friday
                    },//For CSE C
            }//4th Year

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);
        Button button6=findViewById(R.id.button6);
        Button button7=findViewById(R.id.button7);
        Button button8=findViewById(R.id.button8);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        textView=findViewById(R.id.textViewResult);
        Spinner spinner = findViewById(R.id.spinner);
        Spinner spinnerB = findViewById(R.id.spinnerB);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,days);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Day=adapterView.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });


        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,yr);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerB.setAdapter(adapter1);

        spinnerB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                YR=adapterView.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });


        Toast.makeText(MainActivity.this, "Select Your Year,Your Section,Day and Time", Toast.LENGTH_LONG).show();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR){
                    case "1st year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][0]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][0]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][0]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][0]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][0]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][0]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][0]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][0]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][0]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][0]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][0]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][0]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][0]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][0]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][0]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][0]);
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR){
                    case "1st year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][1]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][1]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][1]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][1]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][1]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][1]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][1]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][1]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][1]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if(radioButton1.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][1]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][1]);
                                    break;
                            }
                        }
                        else {
                            switch (Day){
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][1]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][1]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][1]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][1]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][1]);
                                    break;
                            }
                        }
                        break;
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR) {
                    case "1st year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][2]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][2]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][2]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][2]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][2]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][2]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][2]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][2]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][2]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][2]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][2]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][2]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][2]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][2]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][2]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][2]);
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR) {
                    case "1st year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][3]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][3]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][3]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][3]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][3]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][3]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][3]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][3]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][3]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][3]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][3]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][3]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][3]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][3]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][3]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][3]);
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR) {
                    case "1st year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][4]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][4]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][4]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][4]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][4]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][4]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][4]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][4]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][4]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][4]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][4]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][4]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][4]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][4]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][4]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][4]);
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR) {
                    case "1st year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][5]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][5]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][5]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][5]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][5]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][5]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][5]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][5]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][5]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][5]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][5]);
                                    break;
                            }
                        }
                        else{
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][5]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][5]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][5]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][5]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][5]);
                                    break;
                            }
                        }
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR) {
                    case "1st year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][6]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][6]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][6]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][6]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][6]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][6]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][6]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][6]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][6]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][6]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][6]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][6]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][6]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][6]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][6]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][6]);
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

                switch (YR) {
                    case "1st year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][0][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][0][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][0][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][0][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][0][4][7]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][1][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][1][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][1][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][1][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][1][4][7]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[0][2][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[0][2][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[0][2][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[0][2][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[0][2][4][7]);
                                    break;
                            }
                        }
                        break;
                    case "2nd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][0][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][0][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][0][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][0][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][0][4][7]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][1][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][1][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][1][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][1][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][1][4][7]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[1][2][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[1][2][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[1][2][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[1][2][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[1][2][4][7]);
                                    break;
                            }
                        }
                        break;
                    case "3rd year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][0][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][0][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][0][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][0][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][0][4][7]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][1][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][1][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][1][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][1][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][1][4][7]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[2][2][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[2][2][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[2][2][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[2][2][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[2][2][4][7]);
                                    break;
                            }
                        }
                        break;
                    case "4th year":
                        if (radioButton1.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][0][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][0][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][0][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][0][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][0][4][7]);
                                    break;
                            }
                        } else if (radioButton2.isChecked()) {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][1][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][1][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][1][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][1][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][1][4][7]);
                                    break;
                            }
                        } else {
                            switch (Day) {
                                case "Monday":
                                    textView.setText(TimeTable[3][2][0][7]);
                                    break;
                                case "Tuesday":
                                    textView.setText(TimeTable[3][2][1][7]);
                                    break;
                                case "Wednesday":
                                    textView.setText(TimeTable[3][2][2][7]);
                                    break;
                                case "Thursday":
                                    textView.setText(TimeTable[3][2][3][7]);
                                    break;
                                case "Friday":
                                    textView.setText(TimeTable[3][2][4][7]);
                                    break;
                            }
                        }
                        break;
                }
            }
        });

    }

    private void startAnimation()
    {
        Animation animation= AnimationUtils.loadAnimation(this, R.anim.anim);
        textView.startAnimation(animation);
    }
}
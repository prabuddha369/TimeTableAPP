package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private RadioButton radioButton1,radioButton2;
    private TextView textView;
    private Spinner spinner,spinnerB;
    private Toolbar toolbar;
    private final String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday"};
    private final String[] sec={"CSE1A","CSE1B","CSE1C","CST","CSBS","AIML1A","AIML1B"};
    private String s,B;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        textView=findViewById(R.id.textViewResult);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,days);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                s=adapterView.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        spinnerB=findViewById(R.id.spinnerB);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,sec);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerB.setAdapter(adapter1);
        spinnerB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                B=adapterView.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });


        Toast T2=Toast.makeText(MainActivity.this, "NO CLASS ALLOTMENT!", Toast.LENGTH_SHORT);
        Toast TX=Toast.makeText(MainActivity.this, "Grp X class", Toast.LENGTH_SHORT);
        Toast TY=Toast.makeText(MainActivity.this, "Grp Y class", Toast.LENGTH_SHORT);
        Toast.makeText(MainActivity.this, "Select Your Branch,Your Group,Day and Time", Toast.LENGTH_LONG).show();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();

                T2.cancel();
                TX.cancel();
                TY.cancel();

                switch (s)
                {
                    case "Monday":
                      switch (B)
                      {
                          case "CSE1A":
                              break;
                          case "CSE1B":
                              break;
                          case "CSE1C":
                              break;
                          case "CST":
                          case "CSBS":
                              textView.setText(null);
                              T2.show();
                              break;
                          case "AIML1A":
                              break;
                          case "AIML1B":
                              break;
                      }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Physics for Computing Science LAB Grp X\n\nRoom No.-504\n\nTeacher -");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }

                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Physics for Computing Science\n\nRoom No.-220\n\nTeacher -Dr S. Karan");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                if ( radioButton1.isChecked()){
                                    textView.setText(null);
                                    TY.show();}
                                else
                                    textView.setText("Subject -Fundamental of Computer Science LAB Grp Y\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Principle of Electrical Engineering\n\nRoom No.-519\n\nTeacher -Pallav Dutta");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();

                T2.cancel();
                TX.cancel();
                TY.cancel();
                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                if ( radioButton1.isChecked())
                                    textView.setText("Subject -Physics for Computer Science LAB Grp X\n\nRoom No.-504\n\nTeacher -");
                                else{
                                    textView.setText(null);
                                    TX.show();}
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Business Communication and Value Science\n\nRoom No.-220\n\nTeacher -Mrs. S. Basu");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                if ( radioButton2.isChecked())
                                    textView.setText("Subject -Fundamental of Computer Science LAB Grp Y\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                                else{
                                    textView.setText(null);
                                    TY.show();}
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Business Communication and Value Science\n\nRoom No.-519\n\nTeacher -Guest Faculty");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();
             
                T2.cancel();
                TX.cancel();
                TY.cancel();
                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Discrete Maths\n\nRoom No.-407\n\nTeacher -Debanshu Bose");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Mathematics-1\n\nRoom No.-514\n\nTeacher -DEBANSHU BOSE");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Physics for Computing Science\n\nRoom No.-406\n\nTeacher -");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Fundamentals of Computer Science\n\nRoom No.-220\n\nTeacher -Jayanta Pal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                if ( radioButton2.isChecked())
                                    textView.setText("Subject -Fundamental of Computer Science LAB Grp Y\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                                else{
                                    textView.setText(null);
                                    TY.show();}
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Skill Development 1:Soft Skill\n\nRoom No.-\n\nTeacher -");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Principles of Electrical Engineering\n\nRoom No.-407\n\nTeacher -Pallav Dutta");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();
             
                T2.cancel();
                TX.cancel();
                TY.cancel();
                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Physics-1\n\nRoom No.-420\n\nTeacher -Nibedita Khatua");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Fundamentals of Computing Science\n\nRoom No.-407\n\nTeacher -Jayanta Pal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                if(radioButton1.isChecked())
                                    textView.setText("Subject -Workshop & Manufacturing Practices LAB GrpX\n\nRoom No.-\n\nTeacher -MR. A. GUPTA");
                                else
                                    textView.setText("Subject -Workshop & Manufacturing Practices LAB GrpY\n\nRoom No.-\n\nTeacher -DR. S.CHABRI");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Satistics Probability and Calculus\n\nRoom No.-215\n\nTeacher -");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Discrete Maths\n\nRoom No.-220\n\nTeacher -Dr. Shilpa Pal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Physics-1\n\nRoom No.-514\n\nTeacher -DR. INDRANI SARKAR");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Principle of Electrical Engineering LAB Grp X\n\nRoom No.-204\n\nTeacher -Susovan Goswami");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -ENG Training\n\nRoom No.-516 & 514\n\nTeacher -Guest Faculty5");
                                break;
                            case "CSBS":
                                if ( radioButton2.isChecked())
                                    textView.setText("Subject -Principles of Electrical Engineering LAB Grp Y\n\nRoom No.-\n\nTeacher -Biswadeep Gupta Bakshi");
                                else{
                                    textView.setText(null);
                                    TY.show();}
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();
             
                T2.cancel();
                TX.cancel();
                TY.cancel();
                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Mathematics-1\n\nRoom No.-419\n\nTeacher -DEBANSHU BOSE");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Fundamentals of Computing Science\n\nRoom No.-407\n\nTeacher -Jayanta Pal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                if(radioButton1.isChecked())
                                    textView.setText("Subject -Workshop & Manufacturing Practices LAB GrpX\n\nRoom No.-\n\nTeacher -MR. A. GUPTA");
                                else
                                    textView.setText("Subject -Workshop & Manufacturing Practices LAB GrpY\n\nRoom No.-\n\nTeacher -DR. S.CHABRI");
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Satistics Probability and Calculus\n\nRoom No.-220\n\nTeacher -MS. P. Mondal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Professional Communication\n\nRoom No.-514\n\nTeacher -MRS. R RAY");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Principle of Electrical Engineering LAB Grp X\n\nRoom No.-204\n\nTeacher -Susovan Goswami");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -ENG Training\n\nRoom No.-516 & 514\n\nTeacher -Guest Faculty5");
                                break;
                            case "CSBS":
                                if ( radioButton1.isChecked()){
                                    textView.setText(null);
                                    TY.show();}
                                else
                                    textView.setText("Subject -Principles of Electrical Engineering LAB Grp Y\n\nRoom No.-\n\nTeacher -Biswadeep Gupta Bakshi");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
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
             
                T2.cancel();
                TX.cancel();
                TY.cancel();
                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Theme based Project-1\n\nRoom No.-\n\nTeacher -");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Statistics Probability and Calculus\n\nRoom No.-407\n\nTeacher -MS. P. Mondal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                if(radioButton1.isChecked())
                                    textView.setText("Subject -Workshop & Manufacturing Practices LAB GrpX\n\nRoom No.-\n\nTeacher -MR. A. GUPTA");
                                else
                                    textView.setText("Subject -Workshop & Manufacturing Practices LAB GrpY\n\nRoom No.-\n\nTeacher -DR. S.CHABRI");
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Professional Communication\n\nRoom No.-419\n\nTeacher -MRS. S. BASU");
                                break;
                            case "CSBS":
                                textView.setText("Break!");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Physics-1\n\nRoom No.-514\n\nTeacher -DR. D. K. TRIPATHI");
                                break;
                            case "CSBS":
                                textView.setText("Subject -Discrete Maths\n\nRoom No.-515\n\nTeacher -Dr. Shilpa Pal");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();
             
                T2.cancel();
                TX.cancel();
                TY.cancel();
                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText("Subject -Physics for Computing Science\n\nRoom No.-501\n\nTeacher -Guest Faculty");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Mathematics-1\n\nRoom No.-514\n\nTeacher -MS. P. MONDAL");
                                break;
                            case "CSBS":
                                if(radioButton1.isChecked()){
                                    textView.setText("Subject -Fundamentals of Computer Science LAB Grp X\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");}
                                else
                                    textView.setText("Subject -Physics for Computing Science LAB Grp Y\n\nRoom No.-\n\nTeacher -");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                if(radioButton1.isChecked())
                                    textView.setText("Subject -Physics-1 LAB Grp X\n\nRoom No.-504\n\nTeacher -DR. D. K. TRIPATHI");
                                else
                                    textView.setText("Subject -Physics-1 LAB Grp Y\n\nRoom No.-504\n\nTeacher -DR. INDRANI SARKAR");
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Mathematics-1\n\nRoom No.-408\n\nTeacher -MS. P. MONDAL");
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();

                T2.cancel();
                TX.cancel();
                TY.cancel();
                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":

                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Physical Training\n\nRoom No.-514\n\nTeacher -Sayantan Bakshi");
                                break;
                            case "CSBS":
                                if(radioButton1.isChecked())
                                    textView.setText("Subject -Fundamentals of Computer Science LAB Grp X\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                                else
                                    textView.setText("Subject -Physics for Computing Science LAB Grp Y\n\nRoom No.-\n\nTeacher -");
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                if(radioButton1.isChecked())
                                    textView.setText("Subject -Physics-1 LAB Grp X\n\nRoom No.-504\n\nTeacher -DR. D. K. TRIPATHI");
                                else
                                    textView.setText("Subject -Physics-1 LAB Grp Y\n\nRoom No.-504\n\nTeacher -DR. INDRANI SARKAR");
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startAnimation();

                T2.cancel();
                TX.cancel();
                TY.cancel();

                switch (s)
                {
                    case "Monday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Tuesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Wednesday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText("Subject -Physical Training\n\nRoom No.-514\n\nTeacher -Sayantan Bakshi");
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Thursday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                if(radioButton1.isChecked())
                                    textView.setText("Subject -Physics-1 LAB Grp X\n\nRoom No.-504\n\nTeacher -DR. D. K. TRIPATHI");
                                else
                                    textView.setText("Subject -Physics-1 LAB Grp Y\n\nRoom No.-504\n\nTeacher -DR. INDRANI SARKAR");
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
                        }
                        break;
                    case "Friday":
                        switch (B)
                        {
                            case "CSE1A":
                                break;
                            case "CSE1B":
                                break;
                            case "CSE1C":
                                break;
                            case "CST":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "CSBS":
                                textView.setText(null);
                                T2.show();
                                break;
                            case "AIML1A":
                                break;
                            case "AIML1B":
                                break;
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
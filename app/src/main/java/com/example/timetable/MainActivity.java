package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8;
    private RadioButton radioButton1,radioButton2;
    private TextView textView;
    private EditText editTextDay;
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
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        textView=findViewById(R.id.textViewResult);
        editTextDay = findViewById(R.id.editTextDay);
        Toast T1=Toast.makeText(MainActivity.this, "Write a working day name!", Toast.LENGTH_SHORT);
        Toast T2=Toast.makeText(MainActivity.this, "NO CLASS ALLOTMENT!", Toast.LENGTH_SHORT);
        Toast TX=Toast.makeText(MainActivity.this, "Grp X class", Toast.LENGTH_SHORT);
        Toast TY=Toast.makeText(MainActivity.this, "Grp Y class", Toast.LENGTH_SHORT);
        Toast.makeText(MainActivity.this, "Select Your Group", Toast.LENGTH_SHORT).show();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("tuesday") && radioButton1.isChecked())
                    textView.setText("Subject -Physics for Computing Science LAB Grp X\n\nRoom No.-504\n\nTeacher -");
                else if(s.equals("tuesday") && radioButton2.isChecked()){
                    textView.setText(null);
                    TX.show();}
                else if(s.equals("wednesday"))
                    textView.setText("Subject -Physics for Computing Science\n\nRoom No.-220\n\nTeacher -Dr S. Karan");
                else if(s.equals("thursday") && radioButton2.isChecked())
                    textView.setText("Subject -Fundamental of Computer Science LAB Grp Y\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                else if(s.equals("thursday") && radioButton1.isChecked()){
                    textView.setText(null);
                    TY.show();}
                else if(s.equals("friday"))
                    textView.setText("Subject -Principle of Electrical Engineering\n\nRoom No.-519\n\nTeacher -Pallav Dutta");
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("tuesday")&& radioButton1.isChecked())
                    textView.setText("Subject -Physics for Computer Science LAB Grp X\n\nRoom No.-504\n\nTeacher -");
                else if(s.equals("tuesday") && radioButton2.isChecked()){
                    textView.setText(null);
                    TX.show();}
                else if(s.equals("wednesday"))
                    textView.setText("Subject -Business Communication and Value Science\n\nRoom No.-220\n\nTeacher -Mrs. S. Basu");
                else if(s.equals("thursday") && radioButton2.isChecked())
                    textView.setText("Subject -Fundamental of Computer Science LAB Grp Y\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                else if(s.equals("thursday") && radioButton1.isChecked()){
                    textView.setText(null);
                    TY.show();}
                else if(s.equals("friday"))
                    textView.setText("Subject -Business Communication and Value Science\n\nRoom No.-519\n\nTeacher -Guest Faculty");
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday"))
                    textView.setText("Subject -Discrete Maths\n\nRoom No.-407\n\nTeacher -Debanshu Bose");
                else if(s.equals("tuesday"))
                    textView.setText("Subject -Physics for Computing Science\n\nRoom No.-406\n\nTeacher -");
                else if(s.equals("wednesday"))
                    textView.setText("Subject -Fundamentals of Computer Science\n\nRoom No.-220\n\nTeacher -Jayanta Pal");
                else if(s.equals("thursday") && radioButton2.isChecked())
                    textView.setText("Subject -Fundamental of Computer Science LAB Grp Y\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                else if(s.equals("thursday") && radioButton1.isChecked()){
                    textView.setText(null);
                    TY.show();}
                else if(s.equals("friday"))
                    textView.setText("Subject -Principles of Electrical Engineering\n\nRoom No.-407\n\nTeacher -Pallav Dutta");
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday"))
                    textView.setText("Subject -Fundamentals of Computing Science\n\nRoom No.-407\n\nTeacher -Jayanta Pal");
                else if(s.equals("tuesday"))
                    textView.setText("Subject -Satistics Probability and Calculus\n\nRoom No.-215\n\nTeacher -");
                else if(s.equals("wednesday"))
                    textView.setText("Subject -Discrete Maths\n\nRoom No.-220\n\nTeacher -Dr. Shilpa Pal");
                else if(s.equals("thursday"))
                    textView.setText("Subject -Principle of Electrical Engineering LAB Grp X\n\nRoom No.-\n\nTeacher -Susovan Goswami");
                else if(s.equals("friday") && radioButton2.isChecked())
                    textView.setText("Subject -Principles of Electrical Engineering LAB Grp Y\n\nRoom No.-\n\nTeacher -Biswadeep Gupta Bakshi");
                else if(s.equals("friday") && radioButton1.isChecked()){
                    textView.setText(null);
                    TY.show();}
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday"))
                    textView.setText("Subject -Fundamentals of Computing Science\n\nRoom No.-407\n\nTeacher -Jayanta Pal");
                else if(s.equals("tuesday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("wednesday"))
                    textView.setText("Subject -Satistics Probability and Calculus\n\nRoom No.-220\n\nTeacher -MS. P. Mondal");
                else if(s.equals("thursday"))
                    textView.setText("Subject -Principle of Electrical Engineering LAB Grp X\n\nRoom No.-\n\nTeacher -Susovan Goswami");
                else if(s.equals("friday") && radioButton2.isChecked())
                    textView.setText("Subject -Principles of Electrical Engineering LAB Grp Y\n\nRoom No.-\n\nTeacher -Biswadeep Gupta Bakshi");
                else if(s.equals("friday") && radioButton1.isChecked()){
                    textView.setText(null);
                    TY.show();}
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday"))
                    textView.setText("Subject -Statistics Probability and Calculus\n\nRoom No.-407\n\nTeacher -MS. P. Mondal");
                else if(s.equals("tuesday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("wednesday"))
                    textView.setText("Break!");
                else if(s.equals("thursday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("friday"))
                    textView.setText("Subject -Discrete Maths\n\nRoom No.-515\n\nTeacher -Dr. Shilpa Pal");
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday"))
                    textView.setText("Subject -Physics for Computing Science\n\nRoom No.-501\n\nTeacher -Guest Faculty");
                else if(s.equals("tuesday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("wednesday") && radioButton1.isChecked())
                    textView.setText("Subject -Fundamentals of Computer Science LAB Grp X\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                else if (s.equals("wednesday") && radioButton2.isChecked())
                    textView.setText("Subject -Physics for Computing Science LAB Grp Y\n\nRoom No.-\n\nTeacher -");
                else if(s.equals("thursday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("friday")){
                    textView.setText(null);
                    T2.show();}
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextDay.getText().toString();
                s=s.toLowerCase().trim();
                T1.cancel();
                T2.cancel();
                TX.cancel();
                TY.cancel();
                if(s.equals("monday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("tuesday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("wednesday") && radioButton1.isChecked())
                    textView.setText("Subject -Fundamentals of Computer Science LAB Grp X\n\nRoom No.-316L\n\nTeacher -Jayanta Pal");
                else if (s.equals("wednesday") && radioButton2.isChecked())
                    textView.setText("Subject -Physics for Computing Science LAB Grp Y\n\nRoom No.-\n\nTeacher -");
                else if(s.equals("thursday")){
                    textView.setText(null);
                    T2.show();}
                else if(s.equals("friday")){
                    textView.setText(null);
                    T2.show();}
                else{
                    textView.setText(null);
                    T1.show();}
            }
        });
    }
}
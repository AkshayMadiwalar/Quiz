package com.example.akshay.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;
import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {

    int score=0;
    int n_of_times = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        if (n_of_times == 1) {
            EditText nameText = (EditText) findViewById(R.id.name_id);
            String name = nameText.getText().toString();

            CheckBox first_three_Checkbox = (CheckBox) findViewById(R.id.first_correct_answer);
            if (first_three_Checkbox.isChecked() == true) {
                score = score + 1;
            }
            CheckBox second_two_Checkbox = (CheckBox) findViewById(R.id.second_correct_answer);
            if (second_two_Checkbox.isChecked() == true) {
                score = score + 1;
            }
            CheckBox third_four_Checkbox = (CheckBox) findViewById(R.id.third_correct_answer);
            if (third_four_Checkbox.isChecked() == true) {
                score += 1;
            }
            CheckBox fourth_one_Checkbox = (CheckBox) findViewById(R.id.fourth_correct_answer);
            if (fourth_one_Checkbox.isChecked() == true) {
                score += 1;
            }
            CheckBox fifth_three_Checkbox = (CheckBox) findViewById(R.id.fifth_correct_answer);
            if (fifth_three_Checkbox.isChecked() == true) {
                score += 1;
            }
            CheckBox sixth_one_Checkbox = (CheckBox) findViewById(R.id.sixth_correct_answer);
            if (sixth_one_Checkbox.isChecked() == true) {
                score += 1;
            }
            CheckBox seventh_three_Checkbox = (CheckBox) findViewById(R.id.seventh_correct_answer);
            if (seventh_three_Checkbox.isChecked() == true) {
                score += 1;
            }
            CheckBox eight_two_Checkbox = (CheckBox) findViewById(R.id.eight_correct_answer);
            if (eight_two_Checkbox.isChecked() == true) {
                score += 1;
            }
            CheckBox ninth_two_Checkbox = (CheckBox) findViewById(R.id.ninth_correct_answer);
            if (ninth_two_Checkbox.isChecked() == true) {
                score += 1;
            }
            CheckBox tenth_one_Checkbox = (CheckBox) findViewById(R.id.tenth_correct_answer);
            if (tenth_one_Checkbox.isChecked() == true) {
                score += 1;
            }

            displayResult(name, score);
            n_of_times+=1;
        }
        else{
            Toast.makeText(MainActivity.this, "You cannot Submit now", Toast.LENGTH_SHORT).show();
        }
    }

    public void displayResult(String name,int total_score){
        TextView resultTextView = (TextView) findViewById(R.id.result_display);
        ImageView displayImage = (ImageView) findViewById(R.id.image_id);
        if (total_score>8){
            String message = "Hey " + name + "Congrats !"+"\n Your Score is "+ total_score + " out of 10";
            resultTextView.setText(message);
            displayImage.setImageResource(R.drawable.success);
        }
        else if (total_score>5 && total_score <=8){
            String message = " Good attempt !" + name + "\n Your Score is "+total_score+" out of 10";
            resultTextView.setText(message);
            displayImage.setImageResource(R.drawable.success);
        }
        else{
            String message = "Oh ! You managed to score only "+total_score+" out of 10"+"\n Better luck next time "+name;
            resultTextView.setText(message);
            displayImage.setImageResource(R.drawable.failure);

        }

    }


}

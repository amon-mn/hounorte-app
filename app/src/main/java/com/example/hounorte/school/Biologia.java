package com.example.hounorte.school;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hounorte.R;
import com.example.hounorte.model.Question;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Biologia extends AppCompatActivity {

    private MaterialButton backButton;
    private TextView quest;
    private AppCompatButton alt1, alt2, alt3, alt4, alt5;


    int correct = 0, wrong = 0, total = -1;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
        InitComponents();
        updateQuestion();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void updateQuestion(){
        total++;
        if(total>2){
            /*
            Intent in = new Intent(Historia.this, ResultActivity.class);
            in.putExtra("total", String.valueOf(total));
            in.putExtra("correct", String.valueOf(correct));
            in.putExtra("incorrect", String.valueOf(wrong));
            startActivity(in);
             */
        }
        else{
            reference = FirebaseDatabase.getInstance().getReference().child("module").child("10").child("Biologia").child("questions").child(String.valueOf(total));
            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    Question question = snapshot.getValue(Question.class);

                    assert question != null;
                    quest.setText(question.getQuestion());
                    alt1.setText(question.getAlt1());
                    alt2.setText(question.getAlt2());
                    alt3.setText(question.getAlt3());
                    alt4.setText(question.getAlt4());
                    alt5.setText(question.getAlt5());

                    alt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(alt1.getText().toString().equals(question.getAnswer())){
                                alt1.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        alt1.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                                wrong++;
                                alt1.setBackgroundResource(R.drawable.bg_incorrect_alternatives); //RED

                                if (alt2.getText().toString().equals(question.getAnswer())){

                                    alt2.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){

                                    alt3.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){

                                    alt4.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){

                                    alt5.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        alt1.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt2.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt3.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt4.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt5.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }
                        }
                    });


                    alt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt2.getText().toString().equals(question.getAnswer())){
                                alt2.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        alt2.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                                wrong++;
                                alt2.setBackgroundResource(R.drawable.bg_incorrect_alternatives); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){

                                    alt1.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){

                                    alt3.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){

                                    alt4.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){

                                    alt5.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        alt1.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt2.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt3.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt4.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt5.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }

                        }
                    });

                    alt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt3.getText().toString().equals(question.getAnswer())){
                                alt3.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        alt3.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                                wrong++;
                                alt3.setBackgroundResource(R.drawable.bg_incorrect_alternatives); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){

                                    alt1.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt2.getText().toString().equals(question.getAnswer())){

                                    alt2.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){

                                    alt4.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){

                                    alt5.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        alt1.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt2.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt3.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt4.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt5.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }

                        }
                    });

                    alt4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt4.getText().toString().equals(question.getAnswer())){
                                alt4.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        alt4.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                                wrong++;
                                alt4.setBackgroundResource(R.drawable.bg_incorrect_alternatives); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){
                                    alt1.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                else if(alt2.getText().toString().equals(question.getAnswer())){
                                    alt2.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){
                                    alt3.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){
                                    alt5.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        alt1.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt2.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt3.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt4.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt5.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }

                        }
                    });

                    alt5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt5.getText().toString().equals(question.getAnswer())){
                                alt5.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        alt5.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                                wrong++;
                                alt5.setBackgroundResource(R.drawable.bg_incorrect_alternatives); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){
                                    alt1.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                else if(alt2.getText().toString().equals(question.getAnswer())){
                                    alt2.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){
                                    alt3.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){
                                    alt4.setBackgroundResource(R.drawable.bg_correct_alternatives); //GREEN
                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        alt1.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt2.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt3.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt4.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        alt5.setBackgroundResource(R.drawable.bg_alternatives); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }

                        }
                    });

                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        }
    }

    private void InitComponents(){
        backButton = (MaterialButton) findViewById(R.id.btn_back_quiz);
        quest = (TextView) findViewById(R.id.question);

        alt1 = (AppCompatButton) findViewById(R.id.mb_alt1);
        alt2 = (AppCompatButton) findViewById(R.id.mb_alt2);
        alt3 = (AppCompatButton) findViewById(R.id.mb_alt3);
        alt4 = (AppCompatButton) findViewById(R.id.mb_alt4);
        alt5 = (AppCompatButton) findViewById(R.id.mb_alt5);


    }
}
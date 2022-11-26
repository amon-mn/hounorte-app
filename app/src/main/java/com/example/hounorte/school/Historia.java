package com.example.hounorte.school;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
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


public class Historia extends AppCompatActivity {

    private MaterialButton backButton;
    private TextView quest, alt1, alt2, alt3, alt4, alt5;
    private CardView bg_alt1, bg_alt2, bg_alt3, bg_alt4, bg_alt5;
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
        }
        else{

            reference = FirebaseDatabase.getInstance().getReference().child("module").child("0").child("Portugues").child("questions").child(String.valueOf(total));
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

                    bg_alt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(alt1.getText().toString().equals(question.getAnswer())){
                                bg_alt1.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Corret", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        bg_alt1.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR

                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorret", Toast.LENGTH_SHORT).show();
                                wrong++;
                                bg_alt1.setBackgroundColor(Color.parseColor("#F42B15")); //RED

                                if (alt2.getText().toString().equals(question.getAnswer())){

                                    bg_alt2.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){

                                    bg_alt3.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){

                                    bg_alt4.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){

                                    bg_alt5.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(() -> {
                                    bg_alt1.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                    bg_alt2.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                    bg_alt3.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                    bg_alt4.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                    bg_alt5.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                    updateQuestion();
                                },1500);

                            }
                        }
                    });


                    bg_alt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt2.getText().toString().equals(question.getAnswer())){
                                bg_alt2.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Corret", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        bg_alt2.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorret", Toast.LENGTH_SHORT).show();
                                wrong++;
                                bg_alt2.setBackgroundColor(Color.parseColor("#F42B15")); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){

                                    bg_alt1.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){

                                    bg_alt3.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){

                                    bg_alt4.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){

                                    bg_alt5.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        bg_alt1.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt2.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt3.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt4.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt5.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }

                        }
                    });

                    bg_alt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt3.getText().toString().equals(question.getAnswer())){
                                bg_alt3.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Corret", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        bg_alt3.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR

                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorret", Toast.LENGTH_SHORT).show();
                                wrong++;
                                bg_alt3.setBackgroundColor(Color.parseColor("#F42B15")); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){

                                    bg_alt1.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt2.getText().toString().equals(question.getAnswer())){

                                    bg_alt2.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){

                                    bg_alt4.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){

                                    bg_alt5.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        bg_alt1.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt2.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt3.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt4.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt5.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }

                        }
                    });

                    bg_alt4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt4.getText().toString().equals(question.getAnswer())){
                                bg_alt4.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Corret", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        bg_alt4.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR

                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorret", Toast.LENGTH_SHORT).show();
                                wrong++;
                                bg_alt4.setBackgroundColor(Color.parseColor("#F42B15")); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){

                                    bg_alt1.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt2.getText().toString().equals(question.getAnswer())){

                                    bg_alt2.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){

                                    bg_alt3.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt5.getText().toString().equals(question.getAnswer())){

                                    bg_alt5.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        bg_alt1.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt2.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt3.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt4.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt5.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        updateQuestion();
                                    }
                                },1500);

                            }

                        }
                    });

                    bg_alt5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(alt5.getText().toString().equals(question.getAnswer())){
                                bg_alt5.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Corret", Toast.LENGTH_SHORT).show();
                                        correct++;
                                        bg_alt5.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR

                                    }
                                },1500);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Incorret", Toast.LENGTH_SHORT).show();
                                wrong++;
                                bg_alt5.setBackgroundColor(Color.parseColor("#F42B15")); //RED

                                if (alt1.getText().toString().equals(question.getAnswer())){

                                    bg_alt1.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt2.getText().toString().equals(question.getAnswer())){

                                    bg_alt2.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt3.getText().toString().equals(question.getAnswer())){

                                    bg_alt3.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                else if(alt4.getText().toString().equals(question.getAnswer())){

                                    bg_alt4.setBackgroundColor(Color.parseColor("#3ED14D")); //GREEN

                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        bg_alt1.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt2.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt3.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt4.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
                                        bg_alt5.setBackgroundColor(Color.parseColor("#dbfdbb")); //ORIGIN COLOR
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
        quest = findViewById(R.id.question);

        alt1 = (TextView) findViewById(R.id.alt1);
        alt2 = (TextView) findViewById(R.id.alt2);
        alt3 = (TextView) findViewById(R.id.alt3);
        alt4 = (TextView) findViewById(R.id.alt4);
        alt5 = (TextView) findViewById(R.id.alt5);

        bg_alt1 = (CardView) findViewById(R.id.cv_alt1);
        bg_alt2 = (CardView) findViewById(R.id.cv_alt2);
        bg_alt3 = (CardView) findViewById(R.id.cv_alt3);
        bg_alt4 = (CardView) findViewById(R.id.cv_alt4);
        bg_alt5 = (CardView) findViewById(R.id.cv_alt5);

    }
}
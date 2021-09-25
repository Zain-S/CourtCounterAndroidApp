package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA() {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAScore));
    }
    public void displayForTeamB() {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));
    }
    public void increment3TeamA(View view)
    {
        teamAScore+=3;
        displayForTeamA();
    }
    public void increment2TeamA(View view)
    {
        teamAScore+=2;
        displayForTeamA();
    }
    public void increment1TeamA(View view)
    {
        teamAScore++;
        displayForTeamA();
    }
    public void increment3TeamB(View view)
    {
        teamBScore+=3;
        displayForTeamB();
    }
    public void increment2TeamB(View view)
    {
        teamBScore+=2;
        displayForTeamB();
    }
    public void increment1TeamB(View view)
    {
        teamBScore++;
        displayForTeamB();
    }
    public void reset(View view)
    {
        teamAScore=0;
        teamBScore=0;
        displayForTeamA();
        displayForTeamB();
    }
}
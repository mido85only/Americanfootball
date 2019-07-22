package com.example.mido.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0 ;
    int scoreTeamB = 0;


    public void displayScoreTeamA (int score) {
        TextView scoreView = (TextView)findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void onePointTeamA(View view) {
        scoreTeamA = scoreTeamA +1;
        displayScoreTeamA(scoreTeamA);
    }

    public void towPointsTeamA (View view) {
        scoreTeamA = scoreTeamA +2;
        displayScoreTeamA(scoreTeamA);
    }

    public void threePointsTeamA(View view) {
        scoreTeamA = scoreTeamA +3;
        displayScoreTeamA(scoreTeamA);
    }

    public void sixPointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayScoreTeamA(scoreTeamA);
    }
    public void displayScoreTeamB (int score) {
        TextView scoreView = (TextView)findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void onePointTeamB(View view) {
        scoreTeamB = scoreTeamB +1;
        displayScoreTeamB(scoreTeamB);
    }

    public void towPointsTeamB(View view) {
        scoreTeamB = scoreTeamB+1;
        displayScoreTeamB(scoreTeamB);
    }

    public void threePointsTeamB(View view) {
        scoreTeamB = scoreTeamB +3;
        displayScoreTeamB(scoreTeamB);
    }

    public void sixPointsTeamB(View view) {
        scoreTeamB = scoreTeamB +6;
        displayScoreTeamB(scoreTeamB);
    }

    public void reset_score(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayScoreTeamB(scoreTeamB);
        displayScoreTeamA(scoreTeamA);
    }
}

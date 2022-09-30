package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**Increase the score for Team A by the 1 point **/
    public void addOneFor(View view){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    /** Increase the score for Team A by the 2 Points **/
    public void addTwoFor(View view){
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /** Increase the score for Team A by the 3 points **/
    public void addThreeFor(View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /**Increase the score for Team B by the 1 point **/
    public void addOneForB(View view){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    /** Increase the score for Team A by the 2 Points **/
    public void addTwoForB(View view){
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /** Increase the score for Team A by the 3 points **/
    public void addThreeForB(View view){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /** Display the given score for Team A **/
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /** Display the given score for Team B **/
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

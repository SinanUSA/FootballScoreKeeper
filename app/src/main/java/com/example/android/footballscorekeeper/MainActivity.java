package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscorekeeper.R;

public class MainActivity extends AppCompatActivity {


    int scoreHome = 0;
    int scoreGuest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHome (scoreHome);
        displayForGuest(scoreGuest);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForGuest(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDown (View view) {
        scoreHome = scoreHome + 6;
        displayForHome (scoreHome);
    }

    public void fieldGoal (View view) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    public void extraPoint (View view) {
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }

    public void safety (View view) {
        scoreHome = scoreHome + 2;
        displayForHome(scoreHome);
    }

    public void touchDownG (View view) {
        scoreGuest = scoreGuest + 6;
        displayForGuest (scoreGuest);
    }

    public void fieldGoalG (View view) {
        scoreGuest = scoreGuest + 3;
        displayForGuest(scoreGuest);
    }

    public void extraPointG (View view) {
        scoreGuest = scoreGuest + 1;
        displayForGuest(scoreGuest);
    }

    public void safetyG (View view) {
        scoreGuest = scoreGuest + 2;
        displayForGuest(scoreGuest);
    }

    public void reset (View view) {
        scoreHome = 0;
        scoreGuest = 0;
        displayForHome(scoreHome);
        displayForGuest(scoreGuest);
    }

}

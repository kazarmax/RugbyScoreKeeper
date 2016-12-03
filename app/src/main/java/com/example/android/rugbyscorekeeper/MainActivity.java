package com.example.android.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Team teamA;
    private Team teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA = new Team(R.id.scoreA, R.id.tryCountA, R.id.conversionCountA,
                R.id.penaltyCountA, R.id.dropGoalCountA);

        teamB = new Team(R.id.scoreB, R.id.tryCountB, R.id.conversionCountB,
                R.id.penaltyCountB, R.id.dropGoalCountB);
    }

    public void updateScoresAndStatsForTeam(View v) {
        switch (v.getId()) {
            case R.id.tryButtonA:
                teamA.incrementTryCount();
                displayStatsForTeam(teamA);
                break;

            case R.id.tryButtonB:
                teamB.incrementTryCount();
                displayStatsForTeam(teamB);
                break;

            case R.id.conversionButtonA:
                teamA.incrementConversionCount();
                displayStatsForTeam(teamA);
                break;

            case R.id.conversionButtonB:
                teamB.incrementConversionCount();
                displayStatsForTeam(teamB);
                break;

            case R.id.penaltyButtonA:
                teamA.incrementPenaltyCount();
                displayStatsForTeam(teamA);
                break;

            case R.id.penaltyButtonB:
                teamB.incrementPenaltyCount();
                displayStatsForTeam(teamB);
                break;

            case R.id.dropGoalButtonA:
                teamA.incrementDropGoalCount();
                displayStatsForTeam(teamA);
                break;

            case R.id.dropGoalButtonB:
                teamB.incrementDropGoalCount();
                displayStatsForTeam(teamB);
                break;
        }
    }

    public void resetScores(View v) {
        teamA.resetScores();
        teamB.resetScores();
        displayStatsForTeam(teamA);
        displayStatsForTeam(teamB);
    }

    private void displayStatsForTeam(Team team) {
        TextView scoreView = (TextView) findViewById(team.getScoreTextViewId());
        scoreView.setText(String.valueOf(team.getScore()));

        TextView tryCountView = (TextView) findViewById(team.getTryCountTextViewId());
        tryCountView.setText(String.valueOf(team.getTryCount()));

        TextView conversionCountView = (TextView) findViewById(team.getConversionCountTextViewId());
        conversionCountView.setText(String.valueOf(team.getConversionCount()));

        TextView penaltyCountView = (TextView) findViewById(team.getPenaltyCountTextViewId());
        penaltyCountView.setText(String.valueOf(team.getPenaltyCount()));

        TextView dropGoalCountView = (TextView) findViewById(team.getDropGoalCountTextViewId());
        dropGoalCountView.setText(String.valueOf(team.getDropGoalCount()));
    }

}
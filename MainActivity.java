package com.example.prince.scorecounter;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int LeftScore = 0;
    int LeftSet = 0;
    int RightScore = 0;
    int RightSet = 0;
    int set = 1;
    String WinMessage = "";


    public void ScoreReset() {
        LeftScore = 0;
        RightScore = 0;
        ShowScoreLeft(LeftScore);
        ShowScoreRight(RightScore);
    }

    public void ShowScoreLeft(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LeftScoreView);
        scoreView.setText(score);
    }

    public void ShowScoreRight(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RightScoreView);
        scoreView.setText(score);
    }

    public void LeftPlus(View view) {
        LeftScore += 1;
        ShowScoreLeft(LeftScore);
        if (LeftScore==25)
        {
            LeftSet=LeftSet+1;
        }
    }

    public void LeftMinus(View view) {
        LeftScore = LeftScore - 1;
        ShowScoreLeft(LeftScore);
    }

    public void RightPlus(View view) {
        RightScore = RightScore + 1;
        ShowScoreRight(RightScore);
        if (RightScore==25)
        {
            RightSet=RightSet+1;
        }
    }

    public void RightMinus(View view) {
        RightScore = RightScore - 1;
        ShowScoreRight(RightScore);
    }

}

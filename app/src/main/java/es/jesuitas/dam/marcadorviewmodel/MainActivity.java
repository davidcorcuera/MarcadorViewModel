package es.jesuitas.dam.marcadorviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ScoreViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = new ViewModelProvider(this)
                .get(ScoreViewModel.class);
        displayA(mViewModel.getScoreTeamA());
        displayB(mViewModel.getScoreTeamB());
    }

    public void increment_A_by_3(View view){
        increment("A",3);
    }

    public void increment_A_by_2(View view){
        increment("A",2);
    }

    public void increment_A_by_1(View view){
        increment("A",1);
    }

    public void increment_B_by_3(View view){
        increment("B",3);
    }

    public void increment_B_by_2(View view){
        increment("B",2);
    }

    public void increment_B_by_1(View view){
        increment("B",1);
    }

    public void increment(String team, int points){
        if (team=="A") {
            mViewModel.setScoreTeamA(mViewModel.getScoreTeamA()+points);
            displayA(mViewModel.getScoreTeamA());
        }
        if (team=="B") {
            mViewModel.setScoreTeamB(mViewModel.getScoreTeamB()+points);
            displayB(mViewModel.getScoreTeamB());
        }

    }

    public void displayA(int score){
        TextView t = (TextView) findViewById(R.id.teamA_score);
        t.setText(String.valueOf(score));
    }

    public void displayB(int score){
        TextView t = (TextView) findViewById(R.id.teamB_score);
        t.setText(String.valueOf(score));
    }

    public void reset(View view){
        mViewModel.setScoreTeamA(0);
        mViewModel.setScoreTeamB(0);

        displayA(0);
        displayB(0);
    }
}

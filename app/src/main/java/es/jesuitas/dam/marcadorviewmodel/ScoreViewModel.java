package es.jesuitas.dam.marcadorviewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;


public class ScoreViewModel extends AndroidViewModel {
    private int ScoreTeamA = 0;
    private int ScoreTeamB = 0;

    public ScoreViewModel (Application application) {
        super(application);}

    public int getScoreTeamA(){
        return ScoreTeamA;
    }
    public int getScoreTeamB(){
        return ScoreTeamB;
    }

    public void setScoreTeamA(int s){
        ScoreTeamA = s;
    }
    public void setScoreTeamB(int s){
        ScoreTeamB = s;
    }
}

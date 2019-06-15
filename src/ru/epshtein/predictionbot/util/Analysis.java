/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.epshtein.predictionbot.util;

import java.util.ArrayList;
import java.util.List;
import ru.epshtein.predictionbot.model.MatchPredictions;
import ru.epshtein.predictionbot.model.Prediction;

/**
 *
 * @author i.epstein
 */
public class Analysis {
    
    Prediction matchForecast(List<Prediction> predictions){
        int firstSum = 0;
        int secondSum = 0;
        for(Prediction prediction: predictions){
            firstSum+=prediction.getFirstTeam();
            secondSum+=prediction.getSecondTeam();
        }
        
        return new Prediction(Math.round((float)firstSum/(float)predictions.size()), Math.round((float)secondSum/(float)predictions.size()));
    }
    
    public List<Prediction> getForecasts(List<MatchPredictions> data){
        List<Prediction> result = new ArrayList<>();
        for(MatchPredictions matchPredictions: data){
            result.add(matchForecast(matchPredictions.getPredictions()));
        }
        return result;
    }
    
}

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
public class FileParser {
    
    List<Prediction> parseLine(String line){
        List<Prediction> result = new ArrayList<Prediction>();
        String[] separated = line.split("	");
        //for(int i =0; i<separated.length;i++){System.out.println("test: "+separated[i]);}
        for(String prediction: separated){
            String[] tmp = prediction.split("-");
            result.add(new Prediction(Integer.valueOf(tmp[0]), Integer.valueOf(tmp[1])));
        }
        return result;
    }
    
    public List<MatchPredictions> parseFile(List<String> lines){
        List<MatchPredictions> result = new ArrayList<MatchPredictions>();
        for(String line: lines){
            result.add(new MatchPredictions(parseLine(line)));
        }
        return result;
    }
    
}

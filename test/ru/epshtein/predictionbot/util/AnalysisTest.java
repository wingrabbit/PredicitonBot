/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.epshtein.predictionbot.util;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.epshtein.predictionbot.model.MatchPredictions;
import ru.epshtein.predictionbot.model.Prediction;

/**
 *
 * @author i.epstein
 */
public class AnalysisTest {
    
    public AnalysisTest() {
    }
    
    private List<MatchPredictions> data;
    
    @Before
    public void setUp() {
        data = new FileParser().parseFile(new FileReaderImpl().readFile());
    }

    @Test
    public void testMatchForecast() {
        System.out.println("matchForecast");
        Analysis instance = new Analysis();
        Prediction result = instance.matchForecast(data.get(0).getPredictions());
        System.out.println(result.getFirstTeam()+"-"+result.getSecondTeam());
    }
    
}

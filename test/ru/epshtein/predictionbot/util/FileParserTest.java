/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.epshtein.predictionbot.util;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import ru.epshtein.predictionbot.model.MatchPredictions;
import ru.epshtein.predictionbot.model.Prediction;

/**
 *
 * @author i.epstein
 */
public class FileParserTest {
    
    public FileParserTest() {
    }

    @Before
    public void setUp() throws Exception {
        source = new FileReaderImpl().readFile();
    }

    private List<String> source;
    
    @Test
    public void testParseLine() {
        System.out.println("parseLine");
        FileParser instance = new FileParser();
        //List<Prediction> expResult = null;
        List<Prediction> result = instance.parseLine(source.get(0));
        result.stream().forEach(x -> System.out.println(x.getFirstTeam()+" "+ x.getSecondTeam()));
        /*assertEquals(expResult, result);
        fail("The test case is a prototype.");*/
    }

    @Test
    public void testParseFile() {
        System.out.println("parseFile");
        FileParser instance = new FileParser();
        List<MatchPredictions> result = instance.parseFile(source);
        
        result.forEach(x -> {
            x.getPredictions().forEach(s -> System.out.println(s.getFirstTeam()+" "+ s.getSecondTeam()));
        });
        
    }
}

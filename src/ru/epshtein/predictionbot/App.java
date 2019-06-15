/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.epshtein.predictionbot;

import ru.epshtein.predictionbot.util.Analysis;
import ru.epshtein.predictionbot.util.FileParser;
import ru.epshtein.predictionbot.util.FileReaderImpl;

/**
 *
 * @author i.epstein
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Analysis().getForecasts(new FileParser().parseFile(new FileReaderImpl().readFile()))
                .forEach(x -> System.out.println(x.getFirstTeam()+"-"+x.getSecondTeam()));
        
        /*int tst = 4/5;
        System.out.println(tst);
        int rounded = Math.round((float)4/ (float)5);
        System.out.println(rounded);*/
    }
    
}

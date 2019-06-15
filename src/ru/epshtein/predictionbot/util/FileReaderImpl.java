/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.epshtein.predictionbot.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i.epstein
 */
public class FileReaderImpl {
    
    
    private static final String FILENAME = "data.txt";
    
    public List<String> readFile(){
        List<String> result = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                    if(!sCurrentLine.equals("")){result.add(sCurrentLine);}
            }

            } catch (IOException e) {
                    e.printStackTrace();
            }
        return result;
    }
    
}

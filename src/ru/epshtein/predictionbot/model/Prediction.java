/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.epshtein.predictionbot.model;

/**
 *
 * @author i.epstein
 */
public class Prediction {
    
    private final int firstTeam;
    
    private final int secondTeam;

    public Prediction(int firstTeam, int secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public int getFirstTeam() {
        return firstTeam;
    }

    public int getSecondTeam() {
        return secondTeam;
    }
    
    
    
}

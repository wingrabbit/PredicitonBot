/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.epshtein.predictionbot.util;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i.epstein
 */
public class FileReaderImplTest {
    
    public FileReaderImplTest() {
    }

    @Test
    public void testReadFile() {
        System.out.println("readFile");
        FileReaderImpl instance = new FileReaderImpl();
        //List<String> expResult = null;
        List<String> result = instance.readFile();
        result.stream().forEach(System.out::println);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}

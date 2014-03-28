/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mitogh
 */
public class GeneratorTest {
    Generator instance; 
    
    public GeneratorTest() {
        instance = new Generator();
    }
    /**
     * Test of setLevel method, of class Generator.
     */
    @Test
    public void testSetLevel() {
        System.out.println("Test setLevel with right values.");
        // Assertions with 1
        int[] levels = {1, 2, 3, 4, 5};
        
        // Check for all the five correct values
        for(int i = 0; i < levels.length; i++){
            instance.setLevel(levels[i]);
            assertEquals(levels[i], instance.getLevel());
        }
        
        System.out.println("Test setLevel with wrong values.");
        int[] wrongValues = {0, -1, -10, 234, 35};
        // Check for all the five correct values
        for(int i = 0; i < levels.length; i++){
            instance.setLevel(wrongValues[i]);
            // Level 1 as the default for wrong values
            assertEquals(1, instance.getLevel());
        }
    }
    
    /**
     * Test the levels using the constructors.
     */
    @Test
    public void testConstructorLevel(){        
        int level = 1;  
        System.out.println("Test level without constructor argument");
        Generator defaultLevel = new Generator();
        assertEquals(level, defaultLevel.getLevel());
        
        System.out.println("Test level with wrong level argument");
        Generator wrongLevel = new Generator(-1);
        assertEquals(level, wrongLevel.getLevel());
        
        System.out.println("Test level with correct level argument");
        level = 5;
        Generator rightLevel = new Generator(5);
        assertEquals(level, rightLevel.getLevel());
    }
}
package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(4, 2);
        assertEquals(8, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(1, 0.5);
        assertEquals(0.5, myRectangle.calcArea(), 0.0001);
    }

    @Test
    public void doubleSize(){
        Rectangle myRectangle = new Rectangle(1, 1);
        myRectangle.doubleSize();
        assertEquals(2, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(1, 2);
        myRectangle.doubleSize();
        assertEquals(4, myRectangle.calcArea(), 0.0001);
    }

    @Test
    public void longestLineWithinTest(){

    }
}

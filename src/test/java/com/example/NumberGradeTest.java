package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberGradeTest {

    @Test
    public void testConvertGrade() {

        assertEquals('A', NumberGrade.convertGrade(95));
        assertEquals('A', NumberGrade.convertGrade(90));
        assertEquals('B', NumberGrade.convertGrade(89));
        assertEquals('B', NumberGrade.convertGrade(85));
        assertEquals('C', NumberGrade.convertGrade(75));
        assertEquals('D', NumberGrade.convertGrade(65));
        assertEquals('F', NumberGrade.convertGrade(55));

        assertEquals('A', NumberGrade.convertGrade(100)); // Upper boundary
        assertEquals('F', NumberGrade.convertGrade(0));   // Lower boundary

        assertEquals('A', NumberGrade.convertGrade(91));  // Just above A boundary
        assertEquals('B', NumberGrade.convertGrade(80));  // Just above B boundary
        assertEquals('C', NumberGrade.convertGrade(70));  // Just above C boundary
        assertEquals('D', NumberGrade.convertGrade(60));  // Just above D boundary
        assertEquals('F', NumberGrade.convertGrade(59));  // Just below F boundary

        // Test invalid inputs
        try {
            NumberGrade.convertGrade(-1);  // Below lower boundary
            fail("Expected IllegalArgumentException for grade -1");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberGrade.convertGrade(101);  // Above upper boundary
            fail("Expected IllegalArgumentException for grade 101");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}

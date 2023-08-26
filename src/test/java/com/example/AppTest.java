package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// import org.junit.Test;
// import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void firstTest() {
        assertEquals(1, 1, () -> "Int aren't equal");
    }

}

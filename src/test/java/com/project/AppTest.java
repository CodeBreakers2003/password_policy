package com.project;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest 
{
    //Wachtwoorden moeten minimaal 12 tekens lang zijn
    @Test
    public void wachtwoordLenghtTest() {
        assertTrue(Check.length("mystrongpass"));
        assertFalse(Check.length("weakpass"));
    }

    // Wachtwoorden moeten minstens één hoofdletter, één kleine letter, één cijfer en één symbool bevatten
    @Test
    public void uppercaseTest() {
        assertTrue(Check.uppercase("abC"));
        assertTrue(Check.uppercase("abCdeF"));
    }

    // @Test
    // public void lowercaseTest() {
    //     assertTrue(Check.lowercase("abc"));
    //     // assertFalse(Check.lowercase(null));
    // }
}

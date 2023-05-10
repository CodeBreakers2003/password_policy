package com.project;
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
        assertTrue(Check.checkUppercase("Abc"));
        assertTrue(Check.checkUppercase("abCdeF"));
        assertFalse(Check.checkUppercase("abcde"));
    }

    @Test
    public void lowercaseTest() {
        assertTrue(Check.checkLowercase("abc"));
        assertTrue(Check.checkLowercase("AbcD"));
        assertFalse(Check.checkLowercase("ABCD"));
    }

    @Test
    public void cijferTest() {
        assertTrue(Check.checkNumber("dsf97s9d"));
        assertFalse(Check.checkNumber("sdfds"));
    }
    
    // Wachtwoorden mogen geen usernames bevatten.
    @Test
    public void passwordNotContainUsernameTest() {
        String password = "myusername123";
        String username = "myusername";
        assertTrue(Check.passwordNotContainUsername(password, username));
    
    }

    @Test
    public void passwordContainUsernameTest() {
        String password = "479h8nwHe8uw9p";
        String username = "myusername";
        assertFalse(Check.passwordNotContainUsername(password, username));
    }

    //Wachtwoorden mogen geen namen bevatten.
    @Test
    public void passwordNotContainsNameTest() {
        String password = "JohnDoe123";
        String name = "sam";
        assertTrue(Check.passwordNotContainsName(password, name));
    }

    @Test
    public void passwordContainsNameTest() {
        String password = "JohnDoe123";
        String name = "John";
        assertFalse(Check.passwordNotContainsName(password, name));
    }

    // Wachtwoorden mogen niet overeenkomen met eerder gebruikte wachtwoorden
    @Test
    public void checkForPrevPaswTest() {
        assertTrue(Check.checkForPrevPasw("gadbdr4534gv43gq", "gadbdr4534gv43gq"));
        assertFalse(Check.checkForPrevPasw("gadbdr4534gv43gq", "g8943u89h4n3bbuh"));
    }
    
    //Wachtwoorden ouder dan 90 dagen moeten worden gewijzigd
    @Test
    public void testCheckDateIs90Days() {
        assertFalse(Check.isPasswordOlderThan90Days("10-05-23"));
        assertTrue(Check.isPasswordOlderThan90Days("10-05-21"));
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author m
 */
public class AccountLoginTest {
    
//Username Testing
@Test   
public void testValidUsername() {
    String username = "kyl_1";
    assertTrue(username.length() <=5 && username.contains("_"));
}

@Test
public void testInvalidUsername_NoUnderscore() {
    String username = "kyle!!!!!!";
    assertFalse(username.length() <=5 && username.contains("_"));
}

//Password Testing
@Test
public void testValidPassword() {
    String password = "Ch&&sec@ke99";
    assertTrue(password.matches(".*[0-9].*") && password.length() >=8 && password.matches(".*[!@#$%].*") && password.matches(".*[A-Z].*"));
}

@Test
public void testInvalidPassword() {
    String password = "password";
    assertFalse(password.matches(".*[0-9].*") && password.length() >=8 && password.matches(".*[!@#$%].*") && password.matches(".*[A-Z].*"));
}

// Cell Phone Number Testing
@Test
public void testValidNumber() {
    String number = "+27838968976";
    assertTrue(number.length() ==12);
}

@Test
public void testInvalidNumber() {
    String number = "08966553";
    assertFalse(number.length() ==12);
}

// Successful Login Testing
@Test
public void TestSuccessfulLogin() {
    String username = "kyl_1";
    assertTrue(username.length() <=5 && username.contains("_"));
}

@Test
public void SuccessfulLogin() {
    String password = "Ch&&sec@ke99";
    assertTrue(password.matches(".*[0-9].*") && password.length() >=8 && password.matches(".*[!@#$%].*") && password.matches(".*[A-Z].*"));
}

// Failed Login Testing
@Test
public void testFailedLogin() {
    String username = "kyle";
    assertFalse(username.length() <=5 && username.contains("_"));
}

@Test
public void FailedLogin() {
    String password = "password";
    assertFalse(password.matches(".*[0-9].*") && password.length() >=8 && password.matches(".*[!@#$%].*") && password.matches(".*[A-Z].*"));
}
}


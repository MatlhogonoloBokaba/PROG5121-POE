/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bkatl
 */
public class AccountLoginIT {
    
    @Test
    public void testValidUsername() {
        boolean result = AccountLogin.checkUserName("kyl_1");
        assertTrue(result);
    }
    
    @Test
    public void testInvalidUsername() {
        boolean result = AccountLogin.checkUserName("kyle");
        assertFalse(result);
    }
    
    @Test
    public void testValidPassword() {
        boolean result = AccountLogin.checkPasswordComplexity("Ch&&sec@ke99");
        assertTrue(result);
    }
    
    @Test
    public void testInvalidPassword() {
        boolean result = AccountLogin.checkPasswordComplexity("password");
        assertFalse(result);
    }
    
    @Test
    public void testValidPhoneNumber() {
        boolean result = AccountLogin.checkCellPhoneNumber("+27838968976");
        assertTrue(result);
    }
    
    @Test
    public void testInvalidPhoneNumber() {
        boolean result = AccountLogin.checkCellPhoneNumber("08966553");
        assertFalse(result);
    }
}
    
    
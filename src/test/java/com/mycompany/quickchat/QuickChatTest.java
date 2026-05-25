/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bkatl
 */
public class QuickChatTest {
    
    public QuickChatTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class QuickChat.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QuickChat.main(args);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessage method, of class QuickChat.
     */
    @Test
    public void testCheckMessage() {
        System.out.println("testMessage");
        String message = "Hi Mike,can you join us for dinner tonight?";
        String expResult = "Message ready to send";
        String result = QuickChat.checkMessage(message);
        assertEquals(expResult, result);
        fail("Message exceeds 250 characters by x[enter number here];please reduce the size.");
    }

    /**
     * Test of checkRecipientCell method, of class QuickChat.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String recipient = "+27718693002";
        String expResult = "Cell phone number successfully captured.";
        String result = QuickChat.checkRecipientCell(recipient);
        assertEquals(expResult, result);
        fail("Cell phone number is incorrectly formatted or does not contain an international code.Please correct the cumber and try again.");
    }

    /**
     * Test of createMessageHash method, of class QuickChat.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageID = "";
        int num = 0;
        String message = "";
        String expResult = "";
        String result = QuickChat.createMessageHash(messageID, num, message);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageID method, of class QuickChat.
     */
    @Test
    public void testCreateMessageID() {
        System.out.println("createMessageID");
        String expResult = "Message ID generated:<Message ID>";
        String result = QuickChat.createMessageID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of sentMessage method, of class QuickChat.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        String expResult = "";
        String result = QuickChat.sentMessage();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

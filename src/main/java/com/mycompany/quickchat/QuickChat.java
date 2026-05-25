/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchat;

import java.util.Scanner; 
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class QuickChat {
    
    static Scanner input = new  Scanner(System.in);
    
    static int totalMessages = 0;
    
    public static void main(String[] args) {
        
        System.out.print("Enter your username: ");
        String username = input.next();
        
        System.out.print("Enter your password: ");
        String password = input.next();
        
        if(username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or password cannot be empty.");
        }else{
            System.out.println("Login successful!");
            System.out.println("Welcome to QuickChat");
        }
        
        int option;
        
        do {
                //Feature menu
                System.out.println("1. Send Messages");
                System.out.println("2. Show recently sent messages");
                System.out.println("3. Quit");

                System.out.print("Choose option: ");
                option = input.nextInt();
                input.nextLine();

                switch (option) {
                    
                    case 1:
                        System.out.print("How many messages do you want to send? ");
                        int numMessages = input.nextInt();
                        input.nextLine();

                        for (int i = 0; i < numMessages; i++) {
                            
                            Random random = new Random();
                            
                            long number = 1000000000L + (long)(random.nextDouble() * 9000000000L);
                            
                            String messageID = String.valueOf(number);
                        
                            //Cell Phone Number Input
                        System.out.print("Enter recipient number: ");
                        String recipient = input.nextLine();
                        
                        if(recipient.startsWith("+27") && recipient.length() <= 12) {
                            System.out.print("Cell phone number successfullyncaptured.");
                        }else{
                            System.out.print("Invalid phone number.");
                        }
                        
                        //Message Input
                        System.out.print("Enter message: ");
                        String message = input.nextLine();
                        
                        if(message.length() <= 250) {
                            System.out.print("Message ready to send.");
                        }else{
                            int extra = message.length() -250;
                            
                            System.out.println("Message exceeds 250 characters by" + extra);
                        }
                        
                        //Message Hash
                        String[] words = message.split(" ");
                        
                        String firstWord = words[0].toUpperCase();
                        
                        String lastWord = words[words.length - 1].toUpperCase();
                        
                        String messageHash = messageID.substring(0, 2) + ":" + i + ":" + firstWord + lastWord;
                        
                        System.out.println("Message Hash: " + messageHash);
                        
                        //Options
                        System.out.println("1. Send Message");
                        System.out.println("2. Disregard Message");
                        System.out.println("3. Store Message");
                        
                        System.out.print("Choose option: ");
                        int choice = input.nextInt();
                        input.nextLine();
                        
                        if(choice == 1) {
                            System.out.println("Message successfully sent.");
                        }else if(choice == 2){
                            System.out.println("Message disregarded.");
                        }else if(choice == 3){
                            System.out.println("Message successfully stored.");
                        }else{
                            System.out.println("Invalid option.");
                        }
                        
                        //Display Message
                        System.out.println("""
                                           ---------------------
                                           Message ID: %s
                                           Recipient: %s
                                           Message: %s
                                           ---------------------
                                           """.formatted(messageID,recipient,message));
                        
                        totalMessages++;
                }
                
                break;
                 
                    case 2:
                    System.out.println("Coming Soon.");
                    break;
                 
                    case 3:
                    System.out.println("Goodbye.");
                    break;
                 
                    default:
                    System.out.println("Invalid option.");
                    break;
        }
        
        }while(option != 3);
        System.out.println("Total Messages sent: " + totalMessages);
        
        input.close();
    }
    public static String checkMessage(String message) {

    if (message.length() <= 250) {
        return "Message ready to send";
    } else {
        int extra = message.length() - 250;
        return "Message exceeds 250 characters by " + extra;
    }
}

public static String checkRecipientCell(String recipient) {

    if (recipient.startsWith("+27") && recipient.length() <= 12) {
        return "Cell phone number successfully captured";
    } else {
        return "Invalid phone number";
    }
}

public static String createMessageHash(String messageID, int num, String message) {

    String[] words = message.split(" ");

    String firstWord = words[0].toUpperCase();
    String lastWord = words[words.length - 1].toUpperCase();

    return messageID.substring(0, 2) + ":" + num + ":" + firstWord + lastWord;
}

public static String createMessageID() {

    Random random = new Random();

    long number = 1000000000L + (long)(random.nextDouble() * 9000000000L);

    return String.valueOf(number);
}

public static String sentMessage() {
    return "Message successfully sent";
}
}  




        
                        
                        
                        


                

        
        

    
       
    


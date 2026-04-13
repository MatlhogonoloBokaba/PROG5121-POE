/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author MBokaba
 */
public class AccountLogin {
    
    public static void main(String[] args) {
         Scanner myInput = new Scanner(System.in);

        // This is where User inputs their name
         System.out.println("Enter First name: ");
         String firstName = myInput.nextLine();
         
       // This is where User inputs their last name
        System.out.println("Enter Last name: ");
         String lastName = myInput.nextLine();
         
        // This is where User creates a username
        System.out.println("Enter your username: ");
         String username = myInput.nextLine();
         
       // Username If statements
        if(username.contains("_") && username.length() <=5 ) {
             System.out.println("Username successfully captured.");
         }else {
             System.out.println("Username is not correctly formatted;please ensure that your username contains an underscore and is no more than five characters in length.");
         }
         
       // This is where the User creates a password
        System.out.println("Create a password: ");
         String password = myInput.nextLine();
         
       // Password If statements
        if(password != null && password.matches(".*[0-9].*") && password.length() >=8 && password.matches(".*[!@#$%].*") &&  password.matches(".*[A-Z].*")) {
             System.out.println("Password successfully captured.");
         }else {
             System.out.println("Password is not correctly formatted;please ensure that the password contains atleast eight characters,a capital letter,a number,,and a special character.");
         }
         
      // This is where the User inputs their cell phone number
        System.out.println("Enter your number: ");
         String number = myInput.nextLine();
         
      // Setting the regex to check the cell phone number and check for patterns
        String regex = "^\\+\\d{1,3}\\d{1,10}";
         
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(number);
         
     // Number If statements
        if(number != null && matcher.matches() && number.length() == 12) {
             System.out.println("Cell phone number successfully added.");
         }else {
             System.out.println("Cell phone number is incorrectly formatted or does not include an international code.");
         }
     // Print out if User inputs are valid or invalid             
         if(username.contains("_") && username.length() <=5 && password != null && password.matches(".*[0-9].*") && password.length() >=8 && password.matches(".*[A-Z].*")) {
             System.out.println("Welcome " + firstName + " " + lastName + " it is great to see you again.");
         }else {
             System.out.println("Please try again");
         }
    }
}
    
        
        
        
     
        


         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
         
         
         
         
    
    


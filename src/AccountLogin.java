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
         
         //User inputs
         System.out.println("Enter First name: ");
         String firstName = myInput.nextLine();
         
         System.out.println("Enter Last name: ");
         String lastName = myInput.nextLine();
         
         System.out.println("Enter your username: ");
         String username = myInput.nextLine();
         
         if(checkUserName(username)) {
             System.out.println("Username successfully captured.");
         }else {
             System.out.println("Username is not correctly formatted;please ensure that your username contains an underscore and is no more than five characters in length.");
         }
         
         System.out.println("Create a password: ");
         String password = myInput.nextLine();
         
         if(checkPasswordComplexity(password)) {
             System.out.println("Password successfully captured.");
         }else {
             System.out.println("Password is not correctly formatted;please ensure that the password contains atleast eight characters,a capital letter,a number,,and a special character.");
         }

         System.out.println("Enter your number: ");
         String number = myInput.nextLine();
         
         String regex = "^\\+\\d{1,3}\\d{1,10}";
         
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher= pattern.matcher(number);

        // Check if User inputs meet the requirements
         if(checkCellPhoneNumber(number)) {
             System.out.println("Cell phone number successfully added.");
         }else {
             System.out.println("Cell phone number is incorrectly formatted or does not include an international code.");
         }
                    
         if(checkUserName(username) && checkPasswordComplexity(password) && checkCellPhoneNumber(number)) {
             System.out.println("Welcome " + firstName + " " + lastName + " it is great to see you again.");
         }else {
             System.out.println("Please try again");
         }
    }

    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <=5;   
    }

    public static boolean checkPasswordComplexity(String password) {
        return password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%].*");    
    }

    public static boolean checkCellPhoneNumber(String number) {
        String regex = "^\\+\\d{11}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
    
        
        
        
     
        


         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
         
         
         
         
    
    


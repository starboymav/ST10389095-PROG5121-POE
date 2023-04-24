/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ST10389095;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class ST10389095 {
    static AccessSystem objAccess = new AccessSystem();
    static Scanner rifumo = new Scanner(System.in);
    static User objUsers = new User();
    static String username;
    static String firstName;
    static String password;
    static String lastName;
   

    static String accessUsername, AccessPassword;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call method to get user input
        getUserInput();

        //call method to register user and display registration status
        System.out.println("REGISTRATION STATUS : " + objAccess.registerUser());
        System.out.println("_");

        //Call method to get username and password from user for access
        getUserAccessInput();

        //Call a method to validate the username and password if they match the saved ones
        System.out.println(objAccess.returnAccessStatus(accessUsername, AccessPassword));
    }
    public static void getUserInput() {
        //Assign values to variable - Get user Input
        System.out.println("*** RIFUMO POE SYSTEM ***"); //Heading
        System.out.print("Kindly enter your Username: ");
        username = rifumo.next();
        System.out.print("Kindly enter your First Name: ");
        firstName = rifumo.next();
        System.out.print("Kindly enter your Last Name: ");
        lastName = rifumo.next();
        
        System.out.print("Kindly enter your Password: ");
        password = rifumo.next();

        //Call method to check if username meets requirements
        objUsers = new User(username, firstName, password);
    }
    public static void getUserAccessInput() {
        System.out.println("*** RIFUMO'S LOGIN SYSTEM ***"); //Heading
        
//Ask user to enter previously registered username and password
        System.out.print("Kindly Enter Your Registered Username: ");
        accessUsername = rifumo.next();
        System.out.print("Kindly Enter Your Registered Password: ");
        AccessPassword = rifumo.next();
        System.out.println("_");
    }
    }
    


package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    /*
     1) First Name start with Capital letter and it has minimum 3 charachter
     */
    public static void validFirstName() {
        System.out.print("Enter First Name : ");
        Scanner scanner = new Scanner(System.in);
        String FirstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", FirstName));
    }
    /*
     2) Last Name start with Capital letter and it has minimum 3 charachter
     */
    public static void validLastName() {
        System.out.print("Enter Last Name : ");
        Scanner scanner = new Scanner(System.in);
        String LastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", LastName));
    }
    /*
    3) Email has 3 mandatory parts (abc, com & co) and 2 optional (def & in) with precise @ and . positions
     * E.g. abc.def@com.co.in
     */
    public static void validEmail() {
        System.out.print("Enter Email : ");
        Scanner scanner = new Scanner(System.in);
        String Email = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$", Email));
    }
    /* Mobile Number Format
    4) Mobile number starts with 2 digit country code and 10 digit number and there is space between country code and mobile number
     */
    public static void validMobileNumber() {
        System.out.println("Enter Mobile Number : ");
        Scanner scanner = new Scanner(System.in);
        String MobileNum = scanner.nextLine();
        System.out.println(Pattern.matches("^[0-9]{0,2}\\s[0-9]{10}", MobileNum));
    }
    /*
    5)Password Rule 1:- Password contains minimum 8 characters
     */
    public static void validPasswordRule1() {
        System.out.print("Enter Password : ");
        Scanner scanner = new Scanner(System.in);
        String Password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[a-z]).{8,}$", Password));
    }
}

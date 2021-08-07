package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    /*
     1) First Name start with Capital letter and it has minimum 3 charachter
     */
    public static void validFirstName() {
        System.out.print("Enter First Name : ");
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", FirstName));
    }
    /*
     2) Last Name start with Capital letter and it has minimum 3 charachter
     */
    public static void validLastName() {
        System.out.print("Enter Last Name : ");
        Scanner sc = new Scanner(System.in);
        String LastName = sc.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", LastName));
    }
    /*
    3) For printing Email Pattern
     * E.g. abc.def@com.co.in
     */
    public static void validEmailId() {
        System.out.print("Enter Email : ");
        Scanner sc = new Scanner(System.in);
        String Email = sc.next();
        System.out.println(Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$", Email));
    }
    /* Mobile Number Format
    4) Mobile number starts with 2 digit country code and 10 digit number and there is space between country code and mobile number
     */
    public static void validMobileNumber() {
        System.out.println("Enter Mobile Number : ");
        Scanner sc = new Scanner(System.in);
        String MobileNum = sc.nextLine();
        System.out.println(Pattern.matches("^[0-9]{0,2}\\s[0-9]{10}", MobileNum));
    }
    /*
    5)Password Rule 1:- Password contains minimum 8 characters
     */
    public static void validPasswordRule1() {
        System.out.println("Password Should have minimum 8 charachters");
        System.out.print("Enter Password : ");
        Scanner sc = new Scanner(System.in);
        String Password = sc.next();
        System.out.println(Pattern.matches("^(?=.*[a-z]).{8,}$", Password));
    }
    /*
    6)Password Rule 2:- Password Should have at least 1 Upper Case
     */
    public static void validPasswordRule2() {
        System.out.println("Password Should have at least 1 Upper Case");
        System.out.print("Enter Password Rule 2  : ");
        Scanner sc = new Scanner(System.in);
        String Password = sc.next();
        System.out.println(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z]).{8,}$", Password));
    }
    /*
    7)Password Rule 3:- Password Should have at least 1 Numeric number
     */
    public static void validPasswordRule3() {
        System.out.println("Paaword Should have at least 1 Numeric Number");
        System.out.print("Enter Password Rule 3  : ");
        Scanner sc = new Scanner(System.in);
        String Password = sc.next();
        System.out.println(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$", Password));
    }
    /*
    8)Password Rule 4:- Password Should have at least 1 Special Character (@#$%^&-+=)
     */
    public static void validPasswordRule4() {
        System.out.println("Password Should have at least 1 Special Character ");
        System.out.print("Enter password Rule 4  : ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        System.out.println(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$", password));
    }
    /*
    9)Check whether the Email Sample is true or not.
     */
    public static void validEmail(String Email) {
        System.out.println("Checking the Email Samples");
        final String EMAIL_PATTERN = "^[A-Za-z0-9+-_.]+@[A-Za-z0-9+_.]+$";
        boolean result = Email.matches(EMAIL_PATTERN);
        System.out.println(result);
    }
}









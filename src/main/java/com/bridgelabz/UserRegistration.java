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
     * Email has 3 mandatory parts (abc, com & co) and 2 optional (def & in) with precise @ and . positions
     * E.g. abc.def@com.co.in
     */
    public static void validEmail() {
        System.out.print("Enter Email : ");
        Scanner scanner = new Scanner(System.in);
        String Email = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$", Email));
    }
}

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
}

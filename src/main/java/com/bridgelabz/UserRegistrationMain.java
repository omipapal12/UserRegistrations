package com.bridgelabz;
import java.util.Scanner;

public class UserRegistrationMain {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***Welcome to User Registration***");
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();
        userRegistration.validEmail();
        userRegistration.validMobileNumber();
        userRegistration.validPasswordRule1();
    }
}

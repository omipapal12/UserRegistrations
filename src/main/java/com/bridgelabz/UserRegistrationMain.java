package com.bridgelabz;

public class UserRegistrationMain {
    public static void main(String[] args) {
    //Welcome message of User Registration
     System.out.println("***Welcome to User Registration***");
    //Creating Object
        UserRegistration userRegistration = new UserRegistration();
    //Calling method throw object reference
        userRegistration.validFirstName();
        userRegistration.validLastName();
        userRegistration.validEmailId();
        userRegistration.validMobileNumber();
        userRegistration.validPasswordRule1();
        userRegistration.validPasswordRule2();
        userRegistration.validPasswordRule3();
        userRegistration.validPasswordRule4();
        userRegistration.validEmail("abc@yahoo.com");
        userRegistration.validEmail("abc-100@yahoo.com");
        userRegistration.validEmail("abc111@abc.com");
        userRegistration.validEmail("abc-100@abc.net");
        userRegistration.validEmail("abc.100@abc.com.au");
        userRegistration.validEmail("abc@1.com");
        userRegistration.validEmail("abc@gmail.com.com");
        userRegistration.validEmail("abc+100@gmail.com");
    }
}

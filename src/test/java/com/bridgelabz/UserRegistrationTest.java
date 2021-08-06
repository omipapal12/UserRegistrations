package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    /*
     ~ Test for The First_Name
     */
    @Test
    public void givenValid_FirstName_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("Omkar");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False() {
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("omkar");
        Assert.assertFalse(result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False_Numeric_number(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("Omkar1");
        Assert.assertFalse(result);
    }
    /*
    ~ Test for The Last_Name
     */
    @Test
    public void givenValid_LastName_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("Papal");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("papal");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False_Numeric_number(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("papal2");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Email
     */
    @Test
    public void givenValid_Email_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("omkarpapal@gmail.com.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("ovp@.com.me");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False_Special_Character(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("ovp@vtp@gmail.com");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Mobile Number
     */
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber("91 7709547162");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber("91 90807060504");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_False_Number_Should_10(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber("91  987654321");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Password
     */
    @Test
    public void givenValid_Password_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("Omkar@123");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("Omkar.786");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False_Should_8_Character(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("ovp@1");
        Assert.assertFalse(result);
    }
}

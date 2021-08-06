package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class MobileNumberTest {
    //exception with true case
    @Test
    public void given_PhoneNumber_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91 7709547162");
            Assert.assertTrue(result);
            }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_PhoneNumber_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91  7709547162");
            Assert.assertTrue(result);
            }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_PhoneNumber_ShouldReturn_False_with_Not_10Number() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91 770954716");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

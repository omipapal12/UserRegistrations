package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {
    //exception with true case
    @Test
    public void given_Password_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validPassword("Omkar@8949");
            Assert.assertTrue(result);
            }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_Password_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validPassword("omkar+papal");
            Assert.assertFalse(result);
            }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //exception with false case
    @Test
    public void given_Password_Should_Return_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validPassword("Omkar@1");
            Assert.assertFalse(result);
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
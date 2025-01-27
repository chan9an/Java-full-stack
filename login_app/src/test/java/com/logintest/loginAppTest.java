package com.logintest;

import com.lpu.loginTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class loginAppTest {

    @Test
    public void testLoginSuccess() {
        loginTest loginTestObj = new loginTest();
        String validUser = "abcd";
        String validPass = "qwerty";
        int result = loginTestObj.login(validUser, validPass);
        assertEquals(1, result);
    }

    @Test
    public void testLoginFailureInvalidUsername() {
        loginTest loginTestObj = new loginTest();
        String invalidUser = "wrongUser";
        String validPass = "qwerty";
        int result = loginTestObj.login(invalidUser, validPass);
        assertEquals(0, result);
    }

    @Test
    public void testLoginFailureInvalidPassword() {
        loginTest loginTestObj = new loginTest();
        String validUser = "abcd";
        String invalidPass = "wrongPass";
        int result = loginTestObj.login(validUser, invalidPass);
        assertEquals(0, result);
    }

    @Test
    public void testLoginFailureBothInvalid() {
        loginTest loginTestObj = new loginTest();
        String invalidUser = "wrongUser";
        String invalidPass = "wrongPass";
        int result = loginTestObj.login(invalidUser, invalidPass);
        assertEquals(0, result);
    }
}

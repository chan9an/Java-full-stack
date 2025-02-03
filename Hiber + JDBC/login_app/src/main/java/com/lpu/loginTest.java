package com.lpu;
import java.util.ResourceBundle;

public class loginTest {

    public int login(String user, String pass){

        ResourceBundle rb = ResourceBundle.getBundle("config");
        String uname = rb.getString("username");
        String upass = rb.getString("password");
        if(user.equals(uname) && pass.equals(upass)){

        return 1;
        }
        else{
            return 0;
        }

    }

    
   /*  public static void main(String[] args) {
        System.out.println("Hello world!");
    }    */
}
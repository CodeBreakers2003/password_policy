package com.project;

public class App {
    public static void main( String[] args ) {
        // System.out.println( "Hello World!" );
        // isPasswordValidUsername("a", "abck");
        String pass = "hello ari chan";
        System.out.println(pass.contains("aril"));
        System.out.println(pass.contains("hi"));

    
}


public static boolean isPasswordValidUsername(String password, String username) {
        if (password.contains(username)) {
            System.out.println("true");
            return true;
        }  
        System.out.println("false");
    return false;
    }



}

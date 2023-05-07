package com.project;

public class Check {

    public static boolean length(String password) {
        return password.length() >= 12;
    }


    public static boolean uppercase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean lowercase(String input) {
        return false;
    }

    public static boolean passwordNotContainUsername(String password, String username) {
        if (password.contains(username)) {
            return true;
        }  
    return false;
    }

    public static boolean passwordNotContainsName(String password, String name) {
        if (password.contains(name)) {
            return false;
        }  
    return true;
    }
}

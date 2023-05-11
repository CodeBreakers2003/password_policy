package com.project;

public class Check {

    public static boolean checkLength(String password) {
        return password.length() >= 12;
    }


    public static boolean checkUppercase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLowercase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return true;
            }
        }
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

    public static boolean checkForPrevPasw(String hash1, String hash2) {
        return (hash1 == hash2);
    }
}

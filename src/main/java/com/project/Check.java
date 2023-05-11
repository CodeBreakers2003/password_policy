package com.project;

public class Check {

    // Checks the password lenght
    public static boolean checkLength(String password) {
        return password.length() >= 12;
    }

    // Checks the password for uppercase characters
    public static boolean checkUppercase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Checks the password for lowercase characters
    public static boolean checkLowercase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Checks the password for numbers
    public static boolean checkNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Checks if the password contains the username
    public static boolean passwordNotContainUsername(String password, String username) {
        if (!password.contains(username)) {
            return true;
        }  
    return false;
    }

    // Cheks if the password contians the user name
    public static boolean passwordNotContainsName(String password, String name) {
        if (password.contains(name)) {
            return false;
        }  
    return true;
    }

    // Cheks if the password matches a prevous used password
    public static boolean checkForPrevPasw(String hash1, String hash2) {
        return (hash1 == hash2);
    }

    public static boolean isPasswordOlderThan90Days(String dateString) {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yy"));
        long daysBetween = ChronoUnit.DAYS.between(date, today);
        if (daysBetween >= 90) {
            return true;
        } else {
            return false;
        }
  
      // Checks if password passes all requirements
    public static boolean validatePassword(String password, String username, String name, String previousPasswordHash) {
        if (!checkLength(password)) {
            return false;
        }

        if (!checkUppercase(password)) {
            return false;
        }

        if (!checkLowercase(password)) {
            return false;
        }

        if (!checkNumber(password)) {
            return false;
        }

        if (!passwordNotContainUsername(password, username)) {
            return false;
        }

        // if (!passwordNotContainsName(password, name)) {
        //     return false;
        // }

        // if (checkForPrevPasw(CryptoUtils.getHash(password), previousPasswordHash)) {
        //     return false;
        // }

        return true;
    }
}

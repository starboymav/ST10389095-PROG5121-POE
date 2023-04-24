/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ST10389095;

import static ST10389095.ST10389095.objUsers;
/**
 *
 * @author acer
 */
class AccessSystem {
    User[] arrUser = new User[5];
    int cnt = 0;

//method to check if username contains a dash (-)and if it's no more than 5 characters long
    public boolean checkUsername() {
        boolean isUsernameValid = false;

        if ((objUsers.getUsername().contains("_")) && (objUsers.getUsername().length() <= 5)) {
            isUsernameValid = true;
        } else {
            isUsernameValid = false;
        }

        return isUsernameValid;
    }

    //Method to check if password is at least 8 characters long
    public boolean checkPassword() {
        boolean isPasswordValid = false;

        boolean isCapital = false;
        boolean isNumeric = false;
        boolean isSpecialChar = false;
        boolean isValidLength = false;

        for (int i = 0; i < objUsers.getPassword().length(); i++) {
            {
                char passwordChar = objUsers.getPassword().charAt(i);
                String validSpecialChar = "-@*/_+#!*&^%";

                //Password must contain number
                if (Character.isDigit(passwordChar)) {
                    isNumeric = true;
                }

                //Paasword must contain Capital Letter
                if (Character.isUpperCase(passwordChar)) {
                    isCapital = true;
                }
                //Password must contain special character
                if (validSpecialChar.contains(String.valueOf(passwordChar))) {
                    isSpecialChar = true;
                }
            }

            //Password must be minimum 10 characters
            if (objUsers.getPassword().length() >= 8) {
                isValidLength = true;
            }
            //Check if all conditions are met
            if (isNumeric && isSpecialChar && isCapital && isValidLength) {
                isPasswordValid = true;
            }
        }
        return isPasswordValid;
    }
    //Method to validate User entering System

    public String registerUser() {
        String regMsg = "";

        if (checkUsername()) {
            if (checkPassword()) {
                //Call Method to save/Register User Details
                arrUser[cnt] = objUsers;
                cnt++;
                regMsg = "Username Successfully Registered !";
            } else {
                regMsg = "Error! - Password is incorrect, please ensure that the Password contains at least 8 characters, a capital letter, a number and a special character";
            }
        } else {
            regMsg = "Error! - User Name is incorrect, please ensure that your User Name contains an Underscore and is no more than 5 characters in length";
        }
        return regMsg;
    }

    public boolean grantUserAccess(String accessUsername, String AccessPassword) {
        boolean isAccessGranted = false;

        if ((accessUsername.equals(objUsers.getUsername()) && (AccessPassword.equals(objUsers.getPassword())))) {
            isAccessGranted = true;
        }
        return isAccessGranted;
    }

//Method to return Access Status
    public String returnAccessStatus(String accessUsername, String accessPassword) {
        String accessStatus = "Access Failed";
        if (grantUserAccess(accessUsername, accessPassword)) {
            accessStatus = "Access Successfully Granted";
        }
        return accessStatus;
    }
    
}

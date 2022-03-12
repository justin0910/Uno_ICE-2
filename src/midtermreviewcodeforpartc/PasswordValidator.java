/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author JUSTIN JOSEPH
 */
public class PasswordValidator {

    public boolean passwordValidator(String password) {
        
        boolean validPassword;
        int specialCharCount = 0;
        //iterate over each character to see if it is a special character
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                //now we know there is at least one special character
                specialCharCount++;
            }
        }
        if (specialCharCount > 0 && password.length() > 7) {
            validPassword = true;
        }
        else {
            validPassword = false;
        }
        return validPassword;
    }
}

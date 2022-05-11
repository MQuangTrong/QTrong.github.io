/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tran Quoc
 */
public class untity {
    public static boolean checkPhone(String sdt){
       boolean result = false;
        Pattern pattern = Pattern.compile("\\b[0]+[0-9]{9,12}\\b");
        Matcher matcher = pattern.matcher(sdt);
        if (matcher.find()) {
            result = true;
        }
        return result;
        
    }
    public static boolean checkStk(String stk){
       boolean result = false;
        Pattern pattern = Pattern.compile("\\b+[0-9]{10,15}\\b");
        Matcher matcher = pattern.matcher(stk);
        if (matcher.find()) {
            result = true;
        }
        return result;
        
    }
    public static boolean checkPass(String password){
        boolean result = false;
        Pattern pattern = Pattern.compile("\\b[0-9]{6}\\b");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            result = true;
        }
        return result;
        
    }
    public static boolean checkTien(String money){
        boolean result = false;
        Pattern pattern = Pattern.compile("\\b[0-9]\\b");
        Matcher matcher = pattern.matcher(money);
        if (matcher.find()) {
            result = true;
        }
        return result;
        
    }
    public static boolean checkEmail(String email){
        boolean result = false;
        Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]+@[a-zA-Z]{4,10}+\\.[a-zA-Z0-9]{2,4}\\b");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            result = true;
        }
        return result;
        
    }
}

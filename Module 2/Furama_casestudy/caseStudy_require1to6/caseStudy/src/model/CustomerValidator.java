package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidator {
    public static boolean checkDayOfBirth(String string) {
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches ();
    }
    public static boolean checkCMND(String string) {
        String regex = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches ();
    }
    public static boolean checkEmail(String string) {
        String regex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches ();
    }

}

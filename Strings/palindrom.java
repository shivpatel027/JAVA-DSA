package Strings;
import java.util.*;

public class palindrom {
    public static boolean isPalindrom(String name) {
        for(int i = 0; i < name.length()/2; i++) {
            if(name.charAt(i) == name.charAt(name.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "racecar";
        System.out.println(isPalindrom(name));
    }
}

package Strings;
import java.util.*;
public class initialization {
    public static void printChar(String name) {
        for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }
    public static void main(String args[]) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        String str = "abcde";
        String st = new String("xyz");

        //Strings are IMMUTABLE - String can't be edited
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // int len = name.length();
        // System.out.println(len);

        // String firstName = "Shiv ";
        // System.out.println(firstName.concat("Patel"));

        String name = "shiv";
        System.out.println(name.charAt(3));

        printChar(name);
    }
    
    
}
package Assignment_1;

import java.util.*;

public class ToggleCaseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here---> ");
        String s = sc.nextLine();
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                newStr = newStr + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                newStr = newStr + Character.toUpperCase(ch);
            } else {
                newStr = newStr + ch;
            }
        }
        System.out.println("the toggled string is-> " + newStr);
        sc.close();
    }
}

package Assignment_1;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here---> ");
        String s = sc.nextLine();

        boolean[] seen = new boolean[256];
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen[ch]) {
                newStr += ch;
                seen[ch] = true;
            }
        }

        System.out.println("The string after removal -> " + newStr);
        sc.close();
    }
}
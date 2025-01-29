package Assignment_1;

import java.util.*;

public class CheckPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here--> ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("it is not palindrome....");
                break;
            } else {
                System.out.println("it is palindrome....");
                break;
            }
        }
        sc.close();
    }
}

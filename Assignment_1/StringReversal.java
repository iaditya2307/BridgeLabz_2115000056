package Assignment_1;

import java.util.*;

public class StringReversal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here--> ");
        String str = sc.nextLine();
        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            revStr = str.charAt(i) + revStr;
        }
        System.out.println("hence the reversed string is :-> " + revStr);
        sc.close();
    }
}

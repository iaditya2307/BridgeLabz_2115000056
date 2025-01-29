package Assignment_1;

import java.util.*;

public class FindLongestWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence here---> ");
        String s = sc.nextLine();
        sc.close();
        String[] arr = s.split("\\s+");
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > str.length()) {
                str = arr[i];
            }
        }
        System.out.println("The longest word in the sentence is -> " + str);
    }
}

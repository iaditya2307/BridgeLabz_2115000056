package Assignment_1;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here---> ");
        String s = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) >= 1) {
                newStr = newStr + s.charAt(i);
                hm.put(s.charAt(i), 0);
            }
        }
        System.out.println("the string after removed-> " + newStr);
        sc.close();
    }

}

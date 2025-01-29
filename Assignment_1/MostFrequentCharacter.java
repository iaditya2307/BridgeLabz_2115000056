package Assignment_1;

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here---> ");
        String s = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        char totalCharacter = ' ';
        int totalFreq = 0;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > totalFreq) {
                totalFreq = entry.getValue();
                totalCharacter = entry.getKey();
            }
        }
        System.out.println("Most Frequent Character: '" + totalCharacter + "'");
        sc.close();
    }
}

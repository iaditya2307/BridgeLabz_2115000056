package Assignment_1;

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here---> ");
        String s = sc.nextLine();

        int[] freq = new int[256]; // ASCII character frequency array
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char totalCharacter = ' ';
        int totalFreq = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > totalFreq) {
                totalFreq = freq[i];
                totalCharacter = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + totalCharacter + "'");
        sc.close();
    }
}

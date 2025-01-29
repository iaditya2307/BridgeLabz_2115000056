package Assignment_1;

import java.util.*;

public class ReplaceWordInSentence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence here");
        String s1 = sc.nextLine();
        System.out.println("enter the word to replace");
        String w1 = sc.nextLine();
        System.out.println("enter the replaced word");
        String w2 = sc.nextLine();
        String answer = s1.replaceAll("\\b" + w1 + "\\b", w2);
        System.out.println("the answer is --> " + answer);
        sc.close();
    }
}

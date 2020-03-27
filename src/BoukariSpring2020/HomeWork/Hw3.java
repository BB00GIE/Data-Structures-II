package BoukariSpring2020.HomeWork;
import java.util.*;

public class Hw3 {

    public static void main(String[] args) {
        /*
        System.out.println(Palindrome("civic"));
        System.out.println(Palindrome("radar"));
        System.out.println(Palindrome("level"));
        System.out.println(Palindrome("data"));
        System.out.println(Palindrome("rotor"));
        System.out.println(Palindrome("sorting"));
        System.out.println(Palindrome("kayak"));
        System.out.println(Palindrome("mom"));
        System.out.println(Palindrome("reviver"));
        System.out.println(Palindrome("racecar"));
        System.out.println(Palindrome("intelligence"));
        System.out.println(Palindrome("madam"));
        System.out.println(Palindrome("refer"));

        */
        System.out.println(Palindrom2("you can cage a swallow, cant you, but you cant swallow a cage, can you?"));
        System.out.println(Palindrom2("A nut for a jar of tuna."));
        System.out.println(Palindrom2("Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era."));
        System.out.println(Palindrom2("King, are you glad you are king?"));
        System.out.println(Palindrom2("Taco cat"));
        System.out.println(Palindrom2("Was it a car or a cat I saw?"));
        System.out.println(Palindrom2("Data Structures and Algorithms."));


    }

    private static boolean Palindrome(String word) {

        boolean palindrome = true;

        Stack<Character> tar = new Stack<Character>();
        Stack<Character> test = new Stack<Character>();

        for (int i = 0; i < word.length(); i++){
            tar.push(word.charAt(i));
        }
        for(int i = word.length()-1; i >= 0; i--){
            test.push(word.charAt(i));
        }

        while (!tar.isEmpty() && !test.isEmpty()){
            if (tar.pop() != test.pop()){
                palindrome = false;
            }
        }

        return palindrome;
    }


    private static  boolean Palindrom2(String sentence){
        boolean palindrome = true;

        String[] words = sentence.toLowerCase().split("\\W+");
        Stack<String> tar = new Stack<String>();
        Stack<String> test = new Stack<String>();

        for( int i = 0; i < words.length; i ++) {
            tar.push(words[i]);
        }
        for(int i = words.length-1; i >= 0; i--) {
            test.push(words[i]);
        }

        while (!tar.isEmpty() && !test.isEmpty()){
            String a = tar.pop();
            String b = test.pop();
            if ( !a.equals(b)){
                palindrome = false;
            }
        }


        return palindrome;
    }


}

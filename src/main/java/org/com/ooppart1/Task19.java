package org.com.ooppart1;

import java.util.Scanner;

/**
 * Create a class called AlphabetChecker with a method checkVowelOrConsonant(char letter).
 * The method should accept a character (alphabet) and determine if it is a vowel (a, e, i, o, u) or a consonant.
 * The program should display an appropriate message based on the input letter. Ensure the method handles both uppercase and lowercase letters.
**/
public class Task19 {

   static class AlphabetChecker {

       public static void checkVowelOrConsonant(char letter){
            Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
            for(char vowel : vowels){
                if(vowel == Character.toLowerCase(letter)) {
                    System.out.println("It`s a vowel");
                    return;
                }
            }
           System.out.println("It`s a consonant");
       }
   }



    public static void main(String[] args) {
        AlphabetChecker.checkVowelOrConsonant('a');
        AlphabetChecker.checkVowelOrConsonant('e');
        AlphabetChecker.checkVowelOrConsonant('h');
        AlphabetChecker.checkVowelOrConsonant('1');
        AlphabetChecker.checkVowelOrConsonant('3');
        AlphabetChecker.checkVowelOrConsonant('k');
    }
}



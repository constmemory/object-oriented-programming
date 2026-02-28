/*
Write a Java program that prompts the user to enter a single character.
Determine whether the entered character is a vowel or a consonant.
(Vowels: a, e, i, o, u - case insensitive)
*/

import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter : ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The entered character is a vowel.");
            } 
            else {
                System.out.println("The entered character is a consonant.");
            }
        } 
        else {
            System.out.println("Please enter a valid alphabet!");
        }

        sc.close();
    }
}

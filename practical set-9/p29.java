/*
Write a Java program that uses an ArrayList<Integer> to store marks of students. Perform the following operations :  
● Add at least 5 marks.  
● Display all marks.  
● Find and display the highest and lowest marks using Collections.max() and Collections.min().
*/

import java.util.*;

public class p29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(82);
        marks.add(90);
        marks.add(68);
        marks.add(88);

        System.out.println("Marks :");
        for (int m : marks) {
            System.out.println(m);
        }

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("\nHighest Marks : " + highest);
        System.out.println("Lowest Marks : " + lowest);
    }
}

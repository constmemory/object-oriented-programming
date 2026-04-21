/*
Write a generic method searchElement that accepts a LinkedList<T> and an
element T to search. Return true if the element exists, otherwise false.
● Test with LinkedList<Integer> for roll numbers.  
● Test with LinkedList<String> for names.
*/

import java.util.*;

public class p32 {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println("Search 102 in roll numbers : " + searchElement(rollNumbers, 102));

        System.out.println("Search 105 in roll numbers : " + searchElement(rollNumbers, 105));

        LinkedList<String> names = new LinkedList<>();
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");

        System.out.println("\nSearch 'Priya' in names : " + searchElement(names, "Priya"));

        System.out.println("Search 'Neha' in names : " + searchElement(names, "Neha"));
    }
}

/*
Develop a Java program that prompts the user to enter a distance in meters. 
Your program should then convert this distance to feet (1 meter = 3.28084 feet) 
and display the result formatted to two decimal places.
*/

import java.util.*;
public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters : ");
        double meters = sc.nextDouble();

        if (meters < 0) {
            System.out.println("Please enter valid input!");
        } 
        else {
            double feet = meters * 3.28084;
            System.out.printf("Distance in feet : %.2f", feet);
        }

        sc.close();
    }
}

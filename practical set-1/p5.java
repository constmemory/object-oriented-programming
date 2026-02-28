/*
Write a program that takes the lengths of three sides of a triangle as input.
Calculate and print the area of the triangle. Ensure that the program validates if
the given side lengths can actually form a triangle (sum of any two sides must be
greater than the third side) before calculating the area (use Heron's formula :
Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2).
*/

import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a : ");
        double a = sc.nextDouble();

        System.out.print("Enter side b : ");
        double b = sc.nextDouble();

        System.out.print("Enter side c : ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Please enter valid input!");
        }
        else if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area of triangle : %.2f", area);
        }
        else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }
}

/*
Write a Java program to solve a system of two linear equations with two variables
(e.g., ax + by =  e and cx + dy = f). Prompt the user to enter the coefficients 
a, b, c, d, e, f. Calculate and display the  values of x and y using Cramer's rule.
Include error handling for cases where the denominator is zero Cramer's rule : 
D = ad − bc, Dx = ed − bf, Dy = af − ce, x = Dx / D, y = Dy / D
*/

import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b : ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c : ");
        double c = sc.nextDouble();

        System.out.print("Enter value of d : ");
        double d = sc.nextDouble();

        System.out.print("Enter value of e : ");
        double e = sc.nextDouble();

        System.out.print("Enter value of f : ");
        double f = sc.nextDouble();

        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        if (D == 0) {
            System.out.println("The system has no unique solution (Denominator is zero).");
        }
        else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("Value of x : %f\n", x);
            System.out.printf("Value of y : %f", y);
        }

        sc.close();
    }
}

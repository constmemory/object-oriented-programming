/*
Write a Java program that demonstrates method overloading to calculate
the volume of different 3D shapes. Implement overloaded methods named
calculateVolume() for a Cube (takes one side length), a RectangularCube
(takes length, width, height), and a Sphere (takes radius).
*/

import java.util.*;

class VolumeCalculator {
    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(double radius, int sphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator v = new VolumeCalculator();

        System.out.print("Enter side of cube : ");
        double side = sc.nextDouble();
        System.out.printf("Volume of cube : %.2f\n", v.calculateVolume(side));

        System.out.print("\nEnter length of rectangular cube : ");
        double l = sc.nextDouble();

        System.out.print("Enter width of rectangular cube : ");
        double w = sc.nextDouble();

        System.out.print("Enter height of rectangular cube : ");
        double h = sc.nextDouble();

        System.out.printf("Volume of rectangular cube : %.2f\n", v.calculateVolume(l, w, h));

        System.out.print("\nEnter radius of sphere : ");
        double r = sc.nextDouble();

        System.out.printf("Volume of sphere : %.2f", v.calculateVolume(r, 1));

        sc.close();
    }
}

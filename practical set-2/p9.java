/*
Define a Java class named Rectangle. It should have two double data fields : width
and height. In your main method, create two Rectangle objects : one with width 4
and height 40, and another with width 3.5 and height 35.9. For each rectangle,
display its width, height, calculated area, and perimeter. Then, compare the two
rectangles based on their areas and print which one has a larger area.
*/

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.printf("Area : %.2f\n", getArea());
        System.out.printf("Perimeter : %.2f\n", getPerimeter());
    }
}

public class p9 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 :");
        r1.display();

        System.out.println("\nRectangle 2 :");
        r2.display();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has larger area.");
        }
        else if (r1.getArea() < r2.getArea()) {
            System.out.println("\nRectangle 2 has larger area.");
        }
        else {
            System.out.println("\nBoth rectangles have equal area.");
        }
    }
}

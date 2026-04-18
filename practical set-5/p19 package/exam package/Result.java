package exam;

import student.Student;

public class Result extends Student {
    int marks1, marks2, marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        displayStudent();

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total : " + total);
        System.out.printf("Average : %.2f\n", average);
    }

    public static void main(String[] args) {
        Result r = new Result(101, "Rahul", 75, 80, 85);

        r.displayResult();
    }
}

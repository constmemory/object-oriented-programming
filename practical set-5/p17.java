/*
Write the Java code for an interface named Exam which declares a single abstract method boolean 
isPassed(int mark). This method should take an integer mark as an argument. Write the Java code 
for another interface named Classify which declares a single abstract method String getDivision
(double average). This method should take a double average as an argument. Create a class named 
Result that implements both the Exam and Classify interfaces. Provide concrete implementations 
for isPassed() and getDivision() methods. In your main method, create an instance of Result, 
set some marks and average, and demonstrate the use of both interface methods.
*/

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }
}

public class p17 {
    public static void main(String[] args) {
        Result r = new Result();

        int mark = 55;
        double average = 65.5;

        System.out.println("Mark : " + mark);
        System.out.println("Passed : " + r.isPassed(mark));

        System.out.println("Average : " + average);
        System.out.println("Division : " + r.getDivision(average));
    }
}

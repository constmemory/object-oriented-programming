/*
Create a file named students.txt. Write at least three student
records (roll number, name, marks) into the file. Read the file
content and display all student records on the console. Handle
exceptions like IOException properly using try-catch-finally.
*/

import java.io.*;

public class p27 {
    public static void main(String[] args) {
        File file = new File("students.txt");

        try {
            FileWriter fw = new FileWriter(file);

            fw.write("101 Rahul 85\n");
            fw.write("102 Priya 90\n");
            fw.write("103 Amit 78\n");

            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Student Records:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("Error handling file!");
        }
        finally {
            System.out.println("\nFile operation completed.");
        }
    }
}

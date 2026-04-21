/*
Write a Java program that reads a text file named data.txt. The program should count
and display : The total number of lines, The total number of words, The total number
of characters (excluding spaces and newline characters), Use FileReader / BufferedReader
for reading the file. Handle exceptions like FileNotFoundException and IOException.
*/

import java.io.*;

public class p28 {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }

            br.close();

            System.out.println("Number of lines : " + lineCount);
            System.out.println("Number of words : " + wordCount);
            System.out.println("Number of characters (excluding spaces) : " + charCount);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}

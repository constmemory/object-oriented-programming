/*
Write a program that will count the number of characters, words,
and lines in a file. Words are separated by whitespace characters.
The file name should be passed as a command-line argument.
*/

import java.io.*;

public class p26 {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Number of lines : " + lineCount);
            System.out.println("Number of words : " + wordCount);
            System.out.println("Number of characters : " + charCount);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide file name as command-line argument!");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}

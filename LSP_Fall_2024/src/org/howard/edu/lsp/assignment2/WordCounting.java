package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounting {
    public static void main(String[] args) {
        // Define the file name and construct the file path
        String fileName = "words.txt";
        String filePath = new File("src", String.join(File.separator, 
            WordCounting.class.getPackageName().replace('.', File.separatorChar), fileName)).getAbsolutePath();
        System.out.println("The path which it expects the file to be: " + filePath);

        // Use HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Print the content of the input file
        System.out.println("Content of the input file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Echo the content
                for (String word : line.split("\\s+")) {
                    // Convert word to lowercase
                    word = word.toLowerCase();

                    // Process only valid words
                    if (isValidWord(word)) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the word counts
        System.out.println("\nWord counts:");
        wordCounts.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    // Helper method to check if a word is valid
    private static boolean isValidWord(String word) {
        return !word.matches("\\d+") && word.length() > 3;
    }
}
//Niya Traynham


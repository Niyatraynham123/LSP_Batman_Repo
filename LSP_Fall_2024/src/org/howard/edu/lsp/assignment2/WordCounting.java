//package org.howard.edu.lsp.assignment2;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class WordCounting {
//    public static void main(String[] args) {
//        // Get the current directory
//        String currentDirectory = System.getProperty("user.dir");
//        
//        // Get the package name and replace dots with slashes for file path
//        String packageName = WordCounting.class.getPackageName().replace('.', '/');        
//        
//        // File name
//        String fileName = "words.txt";
//        
//        // Construct the final path to words.txt
//        String filePath = currentDirectory + "/src/" + packageName + "/" + fileName;
//        System.out.println("The expected file path is: " + filePath);
//
//        // Echoing the input file
//        System.out.println("\n--- Input File Content ---");
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);  // Echo the line
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Map to store word occurrences
//        Map<String, Integer> wordCounts = new HashMap<>();
//
//        // Now, re-read the file to process the word counts
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                // Split by non-letter characters to account for punctuation
//                String[] words = line.split("[^a-zA-Z]+");
//                for (String word : words) {
//                    // Convert to lowercase
//                    word = word.toLowerCase();
//
//                    // Consider only valid words: not numbers and length greater than 3
//                    if (!word.matches("\\d+") && word.length() > 3) {
//                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Output the word counts
//        System.out.println("\n--- Word Counts ---");
//        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}

//package org.howard.edu.lsp.assignment2;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class WordCounting {
//    public static void main(String[] args) {
//    	// Get the current directory
//    	String currentDirectory = System.getProperty("user.dir");
//        
//    	// Get the package name
//        String P_name = WordCounting.class.getPackageName().replace('.', '/');    	
//        
//        // words.txt file
//        String fileName = "words.txt";
//        
//        // final path to the word.txt file
//        String filePath = currentDirectory + "/src/" + P_name + "/" + fileName;
//        System.out.println("The path which it expects the file to be: " + filePath);
//
//        // I have used HashMap to store the occurrences of the word
//        Map<String, Integer> WordCounting = new HashMap<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] words = line.split("\\s+");
//                for (String word : words) {
//                    // change the word into lowercase
//                    word = word.toLowerCase();
//
//                    // only considers a word valid when -> it's not a number & is greater than length 3
//                    if (!word.matches("\\d+") && word.length() > 3) {
//                    	WordCounting.put(word, WordCounting.getOrDefault(word, 0) + 1);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (Map.Entry<String, Integer> entry : WordCounting.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}



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



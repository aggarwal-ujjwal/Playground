package readWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    public static void main(String[] args) {
        String filename = "C://Users//ujjwa//IdeaProjects/Playground/src/main/resources/Error.txt";
        Map<Integer, Integer> wordLengthCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 2) {
                        // Remove punctuation from the first and last character
                        word = word.substring(1, word.length() - 1)
                                .replaceAll("[^a-zA-Z0-9]", "");

                        // Calculate the length of the word after removing punctuation
                        int length = word.length();

                        // Update the count of word length
                        wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
                    }
                }
            }

            // Find the word length with the highest count
            int maxCount = 0;
            int mostCommonLength = 0;
            for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
                int length = entry.getKey();
                int count = entry.getValue();
                if (count > maxCount) {
                    maxCount = count;
                    mostCommonLength = length;
                }
            }

            System.out.println("Most common word length: " + mostCommonLength);
        } catch (IOException e) {
            System.out.println("Unable to read the file: " + e.getMessage());
        }
    }
}
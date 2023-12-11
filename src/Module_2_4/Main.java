package Module_2_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // The file 'illiad.txt' is read from the root folder.
        File file = new File("illiad.txt");
        // A set to keep track of unique words.
        Set<String> uniqueWords = new HashSet<>();
        // Scanner to read the file.
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            // Get the next word, convert to lower case, and remove non-letter characters.
            String word = scanner.next().toLowerCase().replaceAll("[^a-z]", "");
            uniqueWords.add(word);
        }
        scanner.close();
        System.out.println("Number of unique words: " + uniqueWords.size());
    }
}

package Module_2_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class CaesarCipherCracker {

    public final List<String> words = new ArrayList<>();

    // Constructor to load words from a file into the 'words' list
    public CaesarCipherCracker(File wordsFile) {
        try {
            Scanner scanner = new Scanner(wordsFile);
            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public int findShift(String message) {
        for (int shift = 1; shift < 26; shift++) {
            String decryptedMessage = new CaesarCipher(shift).decrypt(message);

            // Check if all words in the decrypted message are valid words
            boolean allWordsValid = true;
            for (String word : decryptedMessage.split(" ")) {
                if (!words.contains(word)) {
                    allWordsValid = false;
                    break;
                }
            }

            if (allWordsValid) {
                return shift;
            }
        }
        return -1; // Return -1 if no valid shift is found
    }

    public String decrypt(String message) {
        int shift = findShift(message);
        return shift != -1 ? new CaesarCipher(shift).decrypt(message) : "Decryption failed";
    }
}


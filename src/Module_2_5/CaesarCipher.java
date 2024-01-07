package Module_2_5;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

    // Maps to store the encryption and decryption character mappings
    private final Map<Character, Character> decryptionMap = new HashMap<>();
    private final Map<Character, Character> encryptionMap = new HashMap<>();

    // Constructor, where 's' denotes the shift
    public CaesarCipher(int s) {
        // Validate the shift to be within 1 and 25
        if (s <= 0 || s > 25) {
            throw new IllegalArgumentException("Shift must be between 1 and 25");
        }


        for (int i = 0; i < 26; i++) {
            char plainChar = (char) ('a' + i);
            char encryptedChar = (char) ('a' + ((i + s) % 26));

            encryptionMap.put(plainChar, encryptedChar);
            decryptionMap.put(encryptedChar, plainChar);
        }
    }

    public String encrypt(String message) {
        // Translate the message using the encryption map
        return translateString(message, encryptionMap);
    }

    public String decrypt(String message) {
        // Translate the message using the decryption map
        return translateString(message, decryptionMap);
    }

    //"oMe" denotes the original message
    private String translateString(String oMe, Map<Character, Character> translationMap) {
        StringBuilder translatedMessage = new StringBuilder();

        // Iterate through each character of the original message
        for (char c : oMe.toCharArray()) {
            if (Character.isLetter(c)) {
                translatedMessage.append(translationMap.get(Character.toLowerCase(c)));
            } else {
                translatedMessage.append(c);
            }
        }

        return translatedMessage.toString();
    }

}

package Module_2_5;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        CaesarCipher s1 = new CaesarCipher(1);
        String encryptedMessageShift1 = s1.encrypt("defend the east wall of the castle");
        System.out.println(encryptedMessageShift1);
        String decryptedMessageShift1 = s1.decrypt(encryptedMessageShift1);
        System.out.println(decryptedMessageShift1);

        CaesarCipher s2 = new CaesarCipher(3);
        String encryptedMessageShift3 = s2.encrypt("frank liu");
        System.out.println(encryptedMessageShift3);
        String decryptedMessageShift3 = s2.decrypt(encryptedMessageShift3);
        System.out.println(decryptedMessageShift3);
    }
}


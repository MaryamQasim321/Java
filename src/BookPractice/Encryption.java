package BookPractice;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a four-digit integer to encrypt: ");
        int integer = in.nextInt();
        int[] digits = new int[4];

        // Encryption
        for (int i = 3; i >= 0; i--) {
            int temp_int = integer;
            digits[i] = (temp_int % 10 + 7) % 10;
            temp_int = temp_int / 10;
        }

        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        int temp_p = digits[1];
        digits[1] = digits[3];
        digits[3] = temp_p;

        int encrypted = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
        System.out.println("Encrypted: " + encrypted);

        // Decryption
        for (int i = 3; i >= 0; i--) {
            digits[i] = (digits[i] + 3) % 10;
        }

        int temp_d = digits[2];
        digits[2] = digits[0];
        digits[0] = temp_d;

        int temp_dd = digits[3];
        digits[3] = digits[1];
        digits[1] = temp_dd;

        int decrypted = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
        System.out.println("Decrypted: " + decrypted);
    }
}

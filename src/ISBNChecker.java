import javax.swing.*;

public class ISBNChecker {
    public static void main(String[] args) {

        // Request UserInput
        String userNumber = JOptionPane.showInputDialog("Enter ISBN").toLowerCase().replace("x", "10");
        System.out.println(checkISBN(userNumber));
    }
    
    public static String checkISBN(String isbn) {
        int len = isbn.length();
        String output = "Invalid";

        // Determine if there's 10 Digits in the ISBN
        if (len == 10) {

            // Calculate the sum of the ISBN Digits
            int sum = 0;
            for (int i = 0; i < len; i++) {
                int num = isbn.charAt(i);
                sum += (len - i) * (num - '0');
            }

            // Generate a 13 Digit ISBN if it's divisible by 11 (valid)
            if (sum % 11 == 0) {
                output = "978" + isbn.substring(0, 9) + (10 - (sum % 10));
            }

        // Determine if there's 13 Digits in the ISBN
        } else if (len == 13) {

            // Calculate the sum of the ISBN Digits
            int sum = 0;
            for (int i = 0; i < len; i++) {
                int num = 1;
                if (i % 2 == 1) {
                    num = 3;
                }
                sum += num * (isbn.charAt(i) - '0');
            }

            // Check if it's divisible by 10 to determine if it's valid
            if (sum % 10 == 0) {
                output = "Valid";
            }
        }
        return output;
    }
}
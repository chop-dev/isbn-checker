import javax.swing.*;

public class ISBNChecker {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Enter ISBN").toLowerCase().replace("x", "10");
        System.out.println(checkISBN(userInput));
    }

    public static String checkISBN(String isbn) {
        int len = isbn.length();
        String output = "Invalid";

        // Determine if there's 10 Digits in the ISBN
        if (len == 10) {

            // Calculate the sum of the 10 digits to determine validity
            int sum = 0;
            for (int i = 0; i < len; i++) {
                int num = isbn.charAt(i);
                sum += (len - i) * (num - '0');
            }

            // Generate the new 13 digit ISBN
            String newISBN  = isbn;
            newISBN = "978" + newISBN.substring(0,9);

            int newSum = 0;
            for (int i = 0; i < newISBN.length(); i++) {
                int weight = 1;
                if (i % 2 == 1) {
                   weight = 3;
                }

                newSum += ((((int) newISBN.charAt(i)) - 48) * weight);
            }

            // Generate the last digit and create the new ISBN
            newSum = 10 - (newSum % 10);
            newISBN += newSum;

            // Determine if it was a valid 10 digit
            if (sum % 11 == 0) {
                output = newISBN;
            }

        // Determine if there's 13 Digits in the ISBN
        } else if (len == 13) {

            // Calculate the sum of the ISBN Digits
            int sum = 0;
            for (int i = 0; i < len; i++) {
                int weight = 1;
                if (i % 2 == 1) {
                    weight = 3;
                }
                sum += weight * (isbn.charAt(i) - '0');
            }

            // Check if it's divisible by 10 to determine if it's valid
            if (sum % 10 == 0) {
                output = "Valid";
            }
        }
        return output;
    }
}

// References:
// https://isbn-information.com/check-digit-for-the-13-digit-isbn.html
// https://www.codingame.com/training/easy/isbn-check-digit#:~:text=ISBN%2D13%20check%20digit%20is,%2F%2010%20%3D%209%20remainder%203%20.
// https://www.futurelearn.com/info/courses/maths-puzzles/0/steps/14005
// https://stackoverflow.com/questions/17108621/converting-isbn10-to-isbn13
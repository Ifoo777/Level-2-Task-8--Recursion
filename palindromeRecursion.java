import java.util.Scanner;

public class palindromeRecursion {

    // Create a method
    public static boolean isPalindrome(String s) {

        if (s.length() == 0 || s.length() == 1)
            return true;

        // This condition checks to see if the string is a palindrome or not
        if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length() - 1)))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;

    }

    public static void main(String[] args) {

        // Create an empty string
        String value = "";
        // Invoke a scanner object
        Scanner userInput = new Scanner(System.in);
        // Display output
        System.out.println("Enter a word");
        // Assign userInput to a variable word
        String word = userInput.nextLine();
        int len = word.length();

        // Prints out the string
        if (isPalindrome(word))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");

    }

}

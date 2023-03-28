import java.util.Scanner;

public class lcmRecursion {

    public static void main(String[] args) {

        // main method for getting input from users
        String inputNum1, inputNum2;

        // Invoke a scanner object for the user
        Scanner userInput = new Scanner(System.in);
        // Display output to the user
        System.out.println("Please enter Number 1: ");
        inputNum1 = userInput.next();
        // Display output to the user
        System.out.println("Please enter Number 2");
        inputNum2 = userInput.next();

        // Method call for LCM & conversion of input string to integer
        System.out.println(
                "LCM of these numbers are: " + getLCM(Integer.parseInt(inputNum1), Integer.parseInt(inputNum2)));
    }

    /**
     * @param inputNum1
     * @param inputNum2
     */

    // This method takes in two values returns greatest common diviser
    public static int GCD(int inputNum1, int inputNum2) {
        int value;

        //
        if (inputNum1 == inputNum2) {
            return inputNum1;
        }

        if (inputNum1 < inputNum2) { // Recursion if x < y ; switch to make x > y

            value = inputNum1;
            inputNum1 = inputNum2;
            inputNum2 = value;
        }

        return (GCD(inputNum1 - inputNum2, inputNum2));// Euclidean algorithm: GCD(x,y)=GCD(x-y,y)

    }

    /**
     * @param inputNum1
     * @param inputNum2
     * @return
     * 
     */

    // LCM method signature. two
    // values returns LCM
    public static int getLCM(int inputNum1, int inputNum2) {

        // by definition, x*y=GCD(x,y)*LCM(x,y)
        return (inputNum1 * inputNum2 / (GCD(inputNum1, inputNum2)));

    }
}

import java.util.Scanner;

public class SafeInput {


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    return retVal;
                } else {
                    System.out.println("Input must be between " + low + " and " + high + ". Try again.");
                }
            } else {
                pipe.nextLine();
                System.out.println("Please enter an integer. Try again.");
            }
        }
    }
}

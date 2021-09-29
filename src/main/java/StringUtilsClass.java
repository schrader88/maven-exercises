import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Something: ");

        String userInput = scanner.nextLine();

        boolean isNumeric = StringUtils.isNumeric(userInput);
        String switchCase = StringUtils.swapCase(userInput);
        String reverseString = StringUtils.reverse(userInput);

        System.out.println("Is the String a Number: " + isNumeric);
        System.out.println("Flipped Case: " + switchCase);
        System.out.println("Reversed: " + reverseString);
    }
}

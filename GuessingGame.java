package other;

import java.util.Scanner;

public class GuessingGame {


    public static void containsBinarySearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper bound: " );
        int low = 0;
        int high = scanner.nextInt();

        while (low <= high) {
            int middle = (low + high) / 2;
            System.out.println("Guess is: " + middle);
            System.out.println("Enter h for higher or l for lower or c for correct: ");
            String highLow = scanner.next();
            if (highLow.equals("l")) {
                high = middle - 1;
            } else if (highLow.equals("h")){
                low = middle + 1;
            } else {
                System.out.println("your number was: " + middle);
                return;
            }
        }
        System.out.println("invalid");


    }

    public static void main(String[] args) {

        containsBinarySearch();
    }
}

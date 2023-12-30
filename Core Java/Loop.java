// 1.3 Loop control and decision making

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Example of if-else statement
        int value = 10;

        if (value > 0) System.out.println("The number is positive.");
        else if (value < 0) System.out.println("The number is negative.");
        else    System.out.println("The number is zero.");

        System.out.println();

        // Example of while loop
        int num = 1;
        System.out.println("Counting from 1 to 5 using a while loop:");
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        System.out.println();

        // Example of for loop
        System.out.println("Counting from 1 - 5 using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Example of switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day number (1-7): ");
        int daynum = scanner.nextInt();

        String day;
        switch (daynum) {
            case 1:
                day = "Sunday: No work day";
                break;
            case 2:
                day = "Monday: Work Day";
                break;
            case 3:
                day = "Tuesday: Work Day";
                break;
            case 4:
                day = "Wednesday: Work Day";
                break;
            case 5:
                day = "Thursday: Work Day";
                break;
            case 6:
                day = "Friday: Work Day";
                break;
            case 7:
                day = "Saturday: No work day";
                break;
            default:
                day = "Invalid day number";
        }

        System.out.println("Day: " + day);

        scanner.close();
    }
}

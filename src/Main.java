import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the two integers is: " + sum);

        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("The division of the two integers is: " + division);

        }
    }
}


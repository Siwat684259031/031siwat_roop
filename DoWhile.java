import java.util.*;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int number1, number2;
        number1 = 4;
        number2 = 23;

        do {
            System.out.println("==1. Add       ==");
            System.out.println("==2. Multiply  ==");
            System.out.println("==3. Subtract  ==");
            System.out.println("==0. Exit      ==");
            System.out.print("Enter (0-3) :");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            }if (choice == 2) {
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            }if (choice == 3) {
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            }

        } while (choice != 0);
    }
}

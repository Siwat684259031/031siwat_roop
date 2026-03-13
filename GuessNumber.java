import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        int score = 100;
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int guess = rand.nextInt(100);
            int number;
            boolean isCorrect = false;

            while (!isCorrect) {
                IO.print("Please Enter Guess Number : ");
                number = sc.nextInt();
                if (number > guess) {
                    IO.println("To Much");
                }
                if (number < guess) {
                    IO.println("Less Number");
                }
                if (number == guess) {
                    isCorrect = true;
                }
                score--;
            }
            IO.println("Congraturation");
            IO.println("Your score is " + score);
        } catch (InputMismatchException e) {
            IO.print("Incorrect Input");
        }catch (Exception e) {
            IO.print("Error");
        }
    }
}
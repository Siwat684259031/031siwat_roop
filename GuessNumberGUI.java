import javax.swing.JOptionPane;
import java.util.Random;

public class GuessNumberGUI {
    public static void main(String[] args) {
        int score = 100;
        Random rand = new Random();
        int targetNumber = rand.nextInt(100) + 1;
        boolean isCorrect = false;

        JOptionPane.showMessageDialog(null, "Welcome to Guessing Game (1-100)!");

        while (!isCorrect) {
            String input = JOptionPane.showInputDialog("Enter your guess (Score: " + score + "):");
            
            if (input == null) return;

            try {
                int guess = Integer.parseInt(input);
                
                if (guess > targetNumber) {
                    JOptionPane.showMessageDialog(null, "Too High!");
                } else if (guess < targetNumber) {
                    JOptionPane.showMessageDialog(null, "Too Low!");
                } else {
                    isCorrect = true;
                    JOptionPane.showMessageDialog(null, "Congratulations! Correct!\nYour score is: " + score);
                }
                
                score--;
                if (score <= 0) {
                    JOptionPane.showMessageDialog(null, "Game Over!");
                    break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Numbers only please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
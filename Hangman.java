package CognoriseTasks;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    private static String[] words = {"apple", "banana", "orange", "grape", "kiwi"};
    private static Random random = new Random();
    private static String word = words[random.nextInt(words.length)];
    private static char[] display;
    private static int attemptsLeft = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display = new char[word.length()];
        for (int i = 0; i < display.length; i++) {
            display[i] = '_';
        }

        while (attemptsLeft > 0) {
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.println("Current word: " + String.valueOf(display));
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);
            checkGuess(guess);
            if (isWordGuessed()) {
                System.out.println("Congratulations! You guessed the word: " + word);
                break;
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("Sorry, you ran out of attempts. The word was: " + word);
        }
    }

    private static void checkGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                display[i] = guess;
                found = true;
            }
        }
        if (!found) {
            attemptsLeft--;
            drawHangman();
        }
    }

    private static void drawHangman() {
        switch (attemptsLeft) {
            case 6:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 5:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    O");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 4:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    O");
                System.out.println("  |    |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 3:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    O");
                System.out.println("  |   /|");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 2:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    O");
                System.out.println("  |   /|\\");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 1:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    O");
                System.out.println("  |   /|\\");
                System.out.println("  |   /");
                System.out.println("__|__");
                break;
            case 0:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    O");
                System.out.println("  |   /|\\");
                System.out.println("  |   / \\");
                System.out.println("__|__");
                break;
        }
    }

    private static boolean isWordGuessed() {
        for (char c : display) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}

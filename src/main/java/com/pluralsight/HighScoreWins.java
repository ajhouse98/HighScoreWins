package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String gameScore = scanner.nextLine();

        // Separating teams from score
        String[] divide = gameScore.split(Pattern.quote("|"));

        String teams = divide[0];
        String scores = divide[1];

        String[] groups = teams.split(Pattern.quote(":"));
        String[] points = scores.split(Pattern.quote(":"));

        // Separating Team 1 from Team 2
        String T1 = groups[0], T2 = groups[1];
        int s1 = Integer.parseInt(points[0]), s2 = Integer.parseInt(points[1]);

        if (s1 > s2) {
            System.out.println("Winner is: " + T1);

        }
        else if (s2 > s1) {
            System.out.println("Winner is: " + T2);
        }
        else if (s1 == s2) {
            System.out.println("It's a tie!");
        }
    }
}

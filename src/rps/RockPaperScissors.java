package rps;

import java.util.Scanner;

public class RockPaperScissors {
    private Player player;
    private Fist aiFist;

    public RockPaperScissors(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aiFist = new Fist();
    }

    public void playGame() {
        //Initialize the Scanner and print a welcome message
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println(player.toString());

        //Use a while(true) loop and only break the loop if the user wants to quit
        while (true) {

            //Get the user's move through user input
            System.out.print("What is your move? To make a move, enter rock, paper or scissors. To quit the game, enter quit. ");
            String userMove = scanner.nextLine().toLowerCase();

            //Check if the user wants to quit the game
            if (userMove.equals("quit")) {
                break;
            }

            //Check if the user's move is valid (rock, paper or scissors)
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Your move isn't valid! Try again...");
                continue;
            }

            //Print the user's move
            System.out.print("[Your move: " + userMove + ".] ");

            //Get a random number between 0 and 2 using the play method from Fist.java
            int aiRandomNumber = aiFist.play();

            //Convert the random number to a string using conditionals and print the AI's move
            String aiMove;
            if (aiRandomNumber == 0) {
                aiMove = "rock";
            } else if (aiRandomNumber == 1) {
                aiMove = "paper";
            } else {
                aiMove = "scissors";
            }
            System.out.print("[AI's move: " + aiMove + ".] ---> ");

            //Print the results of the game: tie, lose or win
            if (userMove.equals(aiMove)) {
                System.out.println("[It's a tie!]");
            } else if ((userMove.equals("rock") && aiMove.equals("scissors")) || (userMove.equals("paper") && aiMove.equals("rock")) || (userMove.equals("scissors") && aiMove.equals("paper"))) {
                System.out.println("[You won!]");
                player.score++;
            } else {
                System.out.println("[You lost!]");
                player.score--;
            }
        }
        System.out.println("Thanks for playing Rock, Paper, Scissors!");
        System.out.println(player.toString());
    }
}
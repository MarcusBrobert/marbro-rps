package rps;

public class Player {
    private int score;
    private String name;

    //Constructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    //Getters and setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }

    //A method that when called upon returns the player's name and score
    @Override
    public String toString() {
        return "Name: " + this.name + ". Score: " + this.score + ".";
    }
}
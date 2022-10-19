package rps;

public class Player {

    //@TODO: If the fields are not declared as private they can be manipulated from outside
    int score;
    private String name;

    //constructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void rageQuit() { System.exit(0); }

    @Override
    public String toString() {
        return "Name: " + this.name + ". Score: " + this.score + ".";
    }
}
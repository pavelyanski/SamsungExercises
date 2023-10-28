import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Unit unit1 = new Unit("U1");
        Unit unit2 = new Unit("U2");

        Game game2 = new Game();
        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");

        Game.print();
    }
}
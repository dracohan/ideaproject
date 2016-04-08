package c06;

/**
 * Created by root on 4/13/15.
 */
//: Chess.java
// Inheritance, constructors and arguments
class Game {
    Game() {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        //super(i);
        System.out.println("BoardGame constructor");
    }
}
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
} ///:~

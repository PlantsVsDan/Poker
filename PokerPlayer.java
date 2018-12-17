/**
 * File:        PokerPlayer.java
 * Description: A class representing a Poker Player.
 * Created:     12/14/2018
 *
 * @author danIv
 * @version 1.0
 */

public class PokerPlayer extends CardPlayer {
    private double balance;

    public PokerPlayer(String name, int max_size, double balance) {
        super(name, max_size);
        this.balance = balance;
    }
}
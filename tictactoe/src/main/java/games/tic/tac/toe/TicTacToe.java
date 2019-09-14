package games.tic.tac.toe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {

    private static final int BOARD_SIDE = 600;

    public TicTacToe(String s, GameBoard gameBoard) {
        super(s);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(new Rectangle(BOARD_SIDE, BOARD_SIDE));
        this.setVisible(true);
        this.add(gameBoard);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        TicTacToe ticTacToe = new TicTacToe("Welcome to Tic-Tac-Toe Game", new GameBoard());
        ticTacToe.repaint();
    }

}

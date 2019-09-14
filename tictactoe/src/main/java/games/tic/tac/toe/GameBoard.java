package games.tic.tac.toe;

import javax.swing.*;
import java.awt.*;
import java.util.stream.IntStream;

public class GameBoard extends JPanel {

    private boolean isXTurn = true;

    public boolean isXTurn() {
        return isXTurn;
    }

    public void setXTurn(boolean XTurn) {
        isXTurn = XTurn;
    }

    public GameBoard() {
        super();
        this.setVisible(true);
        this.setLayout(new GridLayout(3, 3));
        this.addTiles();
        this.repaint();
    }

    private void addTiles() {
        IntStream.range(0, 3)
                .forEach(row -> IntStream.range(0, 3)
                        .forEach(column -> this.add(new Tile(row, column))));
    }



}

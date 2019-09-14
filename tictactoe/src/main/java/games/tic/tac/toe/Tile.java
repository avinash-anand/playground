package games.tic.tac.toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.awt.Color.*;

public class Tile extends JButton implements MouseListener {

    private boolean clicked = false;
    private final int x;
    private final int y;

    public Tile(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        this.setVisible(true);
        this.setBackground(yellow);
        this.setBorder(BorderFactory.createLineBorder(blue));
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(String.format("tile %d,%d clicked!", this.x, this.y));
        if (!clicked) {
            this.clicked = true;
            GameBoard parent = (GameBoard) this.getParent();
            int height = this.getHeight();
            Font font = new Font(Font.SANS_SERIF, Font.BOLD, height);
            this.setFont(font);
            if (parent.isXTurn()) {
                this.setForeground(red);
                this.setText("X");
            } else {
                this.setForeground(green);
                this.setText("0");
            }
            parent.setXTurn(!parent.isXTurn());
            this.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

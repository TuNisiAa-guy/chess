package me.tunisiaa;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    public static final int SIZE = 100;
    public static final Color DARK = new Color(0x422809);
    public static final Color LIGHT = new Color(0xC4A275);
    private final int posX;
    private final int posY;

    public Cell(Color c, int posX, int posY){
        this.setLayout(new GridBagLayout());
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.posX = posX;
        this.posY = posY;
        this.setSize(SIZE, SIZE);
        this.setBackground(c);
        //this.setBounds(posX*Cell.SIZE, posY*Cell.SIZE, (posX+1)*Cell.SIZE, (posY+1)*Cell.SIZE);
    }
}

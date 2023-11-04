package me.tunisiaa;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    public final static int SIZE = 100;
    public static Color dark = new Color(0x422809);
    public static Color light = new Color(0xC4A275);
    public Cell(Color c, int posX, int posY){
        this.setBackground(c);
        this.setBounds(posX*Cell.SIZE, posY*Cell.SIZE, (posX+1)*Cell.SIZE, (posY+1)*Cell.SIZE);
    }
}

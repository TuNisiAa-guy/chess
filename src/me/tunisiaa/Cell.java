package me.tunisiaa;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    public static int SIZE = 100;
    public static Color dark = new Color(0x422809);
    public static Color light = new Color(0xC4A275);
    public Cell(Color c, int posX, int posY){
        this.setBackground(c);
        this.setBounds(posX*SIZE, posY*SIZE, (posX+1)*SIZE, (posY+1)*SIZE);
    }
}

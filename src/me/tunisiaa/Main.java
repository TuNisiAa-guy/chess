package me.tunisiaa;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        ChessBoard cb = new ChessBoard();
        jf.add(cb);
        jf.setLayout(new FlowLayout());
        jf.pack();
        jf.setVisible(true);
    }
}
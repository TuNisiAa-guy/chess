package me.tunisiaa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        ChessBoard cb = new ChessBoard();
        jf.add(cb);
        jf.setVisible(true);
    }
}
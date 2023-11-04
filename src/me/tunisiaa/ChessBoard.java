package me.tunisiaa;

import javax.swing.*;

public class ChessBoard extends JPanel {
    public static final int SIZE = 8;
    public Cell[][] cells;
    public ChessBoard(){
        fill();
    }
    public void fill(){
        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++) {
                this.cells[i][j] = new Cell((i + j) % 2 == 0 ? Cell.dark : Cell.light, j, i);
            }
        }
    }
}

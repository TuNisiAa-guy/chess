package me.tunisiaa;

import javax.swing.*;

public class ChessBoard extends JPanel {
    public static final int SIZE = 8;
    public Cell[][] cells;
    public ChessBoard(){
        this.cells = new Cell[SIZE][SIZE];
        fill();
    }
    public void fill(){
        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++) {
                Cell c = new Cell((i + j) % 2 == 0 ? Cell.dark : Cell.light, j, i);
                this.cells[i][j] = c;
                this.add(c);
            }
        }
    }
}

package com.projects;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPosition();

        for (Coordinates coordinates : board.pieces.keySet()) {
            System.out.println(board.pieces.get(coordinates));
        }
        int a = 1;
    }
}
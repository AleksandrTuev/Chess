package com.projects;

import com.projects.piece.Pawn;
import com.projects.piece.Piece;

import java.util.HashMap;

public class Board {
     HashMap<Coordinates, Piece> pieces = new HashMap<>();

     public void setPieces(Coordinates coordinates, Piece piece) {
          piece.coordinates = coordinates;
          pieces.put(coordinates, piece);
     }

     public void setupDefaultPiecesPosition() {
          for (File file : File.values()) {
               setPieces(new Coordinates(file, 2), new Pawn(Color.WHITE, new Coordinates(file, 2)));
               setPieces(new Coordinates(file, 7), new Pawn(Color.BLACK, new Coordinates(file, 7)));
          }
     }
}
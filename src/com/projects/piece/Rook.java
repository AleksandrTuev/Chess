package com.projects.piece;

import com.projects.Color;
import com.projects.Coordinates;

public class Rook extends Piece{ //Ладья
    public Rook(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    public String toString() {
        return "Rook{" +
                "color=" + color +
                ", coordinates=" + coordinates +
                '}';
    }
}

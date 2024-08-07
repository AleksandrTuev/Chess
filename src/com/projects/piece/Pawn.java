package com.projects.piece;

import com.projects.Color;
import com.projects.Coordinates;

public class Pawn extends Piece{ //Пешка
    public Pawn(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "color=" + color +
                ", coordinates=" + coordinates +
                '}';
    }
}

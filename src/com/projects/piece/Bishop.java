package com.projects.piece;

import com.projects.Color;
import com.projects.Coordinates;

public class Bishop extends Piece{ //Слон
    public Bishop(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    public String toString() {
        return "Bishop{" +
                "color=" + color +
                ", coordinates=" + coordinates +
                '}';
    }
}

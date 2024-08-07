package com.projects.piece;

import com.projects.Color;
import com.projects.Coordinates;

public class Knight extends Piece{ //Конь
    public Knight(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "color=" + color +
                ", coordinates=" + coordinates +
                '}';
    }
}

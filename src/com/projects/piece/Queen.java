package com.projects.piece;

import com.projects.Color;
import com.projects.Coordinates;

public class Queen extends Piece{ //Ферс
    public Queen(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    public String toString() {
        return "Queen{" +
                "color=" + color +
                ", coordinates=" + coordinates +
                '}';
    }
}

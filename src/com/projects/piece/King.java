package com.projects.piece;

import com.projects.Color;
import com.projects.Coordinates;

public class King extends Piece{ //Король
    public King(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    public String toString() {
        return "King{" +
                "color=" + color +
                ", coordinates=" + coordinates +
                '}';
    }
}

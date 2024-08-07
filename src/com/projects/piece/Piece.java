package com.projects.piece;


import com.projects.Color;
import com.projects.Coordinates;

abstract public class Piece { //фигура
    public final Color color;
    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color=" + color +
                ", coordinates=" + coordinates +
                '}';
    }
}

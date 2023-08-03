package com.workintech.enums;

public enum PaintColor {
    RED(0),
    WHITE(1),
    BLUE(2),
    GREEN(3);

    private int colorCode;
    PaintColor( int colorCode){
        this.colorCode= colorCode;

    }
}

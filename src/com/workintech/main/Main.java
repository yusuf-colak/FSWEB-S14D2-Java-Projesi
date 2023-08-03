package com.workintech.main;

import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom=new Bedroom( "Yusuf",
                new Wall(Direction.EAST),
                new Wall(Direction.SOUTH),
                new Wall(Direction.NORTH),
                new Wall(Direction.WEST),
                new Ceiling(3, PaintColor.BLUE),
                new Bed("Tek kişilik ", 4 ,1,2,2),
                new Lamp(LampType.LAVA,false,4),
                new Wardrobe(2,2,40),
                new Carpet(3,5 ,PaintColor.RED)

        );

        System.out.println(bedroom);
        System.out.println("******************************");
        System.out.println(bedroom.getBed());
        System.out.println("******************************");
        System.out.println(bedroom.getCarpet());
    }
}
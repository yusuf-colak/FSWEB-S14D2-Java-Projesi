package com.workintech.model;

import com.workintech.enums.Direction;

public class Wall {
private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
    public void create() {
        System.out.println("wall has been create on : "+ getDirection());
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction=" + direction +
                '}';
    }
}

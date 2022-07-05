package com.bogdan.lifray.serviceapp.api;

import java.util.UUID;

public class Horse {

    private UUID id = randomId();

    private int modelSpeed;

    public Horse() {
    }

    public Horse(int speed) {
        this.modelSpeed = speed;
    }

    public int getModelSpeed() {
        return modelSpeed;
    }

    private UUID randomId() {
        UUID id = UUID.randomUUID();
        return id;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "id=" + id +
                '}';
    }
}

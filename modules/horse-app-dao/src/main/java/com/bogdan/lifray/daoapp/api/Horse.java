package com.bogdan.lifray.daoapp.api;

import java.util.UUID;

public class Horse {


    private static int modelSpeed;
    private UUID id = UUID.randomUUID();

    public Horse(int modelSpeed) {
        this.modelSpeed = modelSpeed;
    }

    public static int getModelSpeed() {
        return modelSpeed;
    }

    public static void setModelSpeed(int modelSpeed) {
        Horse.modelSpeed = modelSpeed;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "id=" + id +
                '}';
    }
}


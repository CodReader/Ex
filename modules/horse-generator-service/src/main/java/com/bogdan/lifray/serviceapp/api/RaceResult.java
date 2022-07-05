package com.bogdan.lifray.serviceapp.api;


public class RaceResult {


    private final int raceTime;
    private final Horse horse;

    public RaceResult(Horse horse, int raceTime) {
        this.raceTime = raceTime;
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "RaceResult{" +
                "raceTime=" + raceTime +
                ", horse=" + horse +
                '}';
    }


}
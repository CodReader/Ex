package com.bogdan.lifray.serviceapp.api;


import java.util.logging.Logger;

public class RaceRunGenerator {

    private static final Logger logger = Logger.getLogger(RaceRunGenerator.class.getName());

    RaceRunGenerator() {
    }

    public static int raceRun() {
        Horse horse = new Horse(HorseGenerator.randomSpeed());
        int raceTime;
        if (Constants.RACE_LENGTH != 0) {
            raceTime = Constants.RACE_LENGTH / horse.getModelSpeed() * Constants.WEATHER;
        } else {
            logger.info("Error");
        }
        return raceTime;
    }


}

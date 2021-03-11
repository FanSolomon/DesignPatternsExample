package Creational.AbstractFactory.HolidayTheme.Components.impl;

import Creational.AbstractFactory.HolidayTheme.Components.Building;

import java.math.BigDecimal;

public class CommonBuilding implements Building {
    @Override
    public String playBackgroundMusic() {
        return "common music";
    }

    @Override
    public BigDecimal npcCount() {
        double randomCount = Math.random()*100;
        randomCount = Math.ceil(randomCount);
        return BigDecimal.valueOf(randomCount);
    }
}

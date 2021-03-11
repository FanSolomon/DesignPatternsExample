package Creational.AbstractFactory.HolidayTheme.Components.impl;

import Creational.AbstractFactory.HolidayTheme.Components.Building;

import java.math.BigDecimal;

public class ChristmasBuilding implements Building {
    @Override
    public String playBackgroundMusic() {
        return "jingle bell";
    }

    @Override
    public BigDecimal npcCount() {
        double randomCount = Math.random()*200 + 1000;
        randomCount = Math.ceil(randomCount);
        return BigDecimal.valueOf(randomCount);
    }
}

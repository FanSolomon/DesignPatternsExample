package Creational.AbstractFactory.HolidayTheme.Components.impl;

import Creational.AbstractFactory.HolidayTheme.Components.Bullet;

import java.math.BigDecimal;

public class ChristmasBullet implements Bullet {
    @Override
    public boolean canKillPeople() {
        return false;
    }

    @Override
    public String shootingFeature() {
        return "Buling buling shootingFeature";
    }

    @Override
    public BigDecimal setExperienceAfterHit(BigDecimal experience) {
        return experience.add(new BigDecimal(150));
    }
}

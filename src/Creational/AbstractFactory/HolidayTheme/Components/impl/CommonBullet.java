package Creational.AbstractFactory.HolidayTheme.Components.impl;

import Creational.AbstractFactory.HolidayTheme.Components.Bullet;

import java.math.BigDecimal;

public class CommonBullet implements Bullet {
    @Override
    public boolean canKillPeople() {
        return true;
    }

    @Override
    public String shootingFeature() {
        return "Common shootingFeature";
    }

    @Override
    public BigDecimal setExperienceAfterHit(BigDecimal experience) {
        return experience.add(new BigDecimal(100));
    }
}

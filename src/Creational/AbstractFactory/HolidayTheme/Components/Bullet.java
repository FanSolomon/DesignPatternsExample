package Creational.AbstractFactory.HolidayTheme.Components;

import java.math.BigDecimal;

public interface Bullet {

    boolean canKillPeople();

    String shootingFeature();

    BigDecimal setExperienceAfterHit(BigDecimal experience);
}

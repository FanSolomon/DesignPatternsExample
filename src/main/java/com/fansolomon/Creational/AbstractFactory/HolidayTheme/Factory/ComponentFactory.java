package com.fansolomon.Creational.AbstractFactory.HolidayTheme.Factory;

import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.Building;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.Bullet;

public interface ComponentFactory {

    Bullet createBullet();

    Building createBuilding();
}

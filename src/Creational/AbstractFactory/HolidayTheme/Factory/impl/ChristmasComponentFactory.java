package Creational.AbstractFactory.HolidayTheme.Factory.impl;

import Creational.AbstractFactory.HolidayTheme.Components.Building;
import Creational.AbstractFactory.HolidayTheme.Components.Bullet;
import Creational.AbstractFactory.HolidayTheme.Components.impl.ChristmasBuilding;
import Creational.AbstractFactory.HolidayTheme.Components.impl.ChristmasBullet;
import Creational.AbstractFactory.HolidayTheme.Factory.ComponentFactory;

public class ChristmasComponentFactory implements ComponentFactory {
    @Override
    public Bullet createBullet() {
        return new ChristmasBullet();
    }

    @Override
    public Building createBuilding() {
        return new ChristmasBuilding();
    }
}

package Creational.AbstractFactory.HolidayTheme.Factory.impl;

import Creational.AbstractFactory.HolidayTheme.Components.Building;
import Creational.AbstractFactory.HolidayTheme.Components.Bullet;
import Creational.AbstractFactory.HolidayTheme.Components.impl.CommonBuilding;
import Creational.AbstractFactory.HolidayTheme.Components.impl.CommonBullet;
import Creational.AbstractFactory.HolidayTheme.Factory.ComponentFactory;

public class CommonComponentFactory implements ComponentFactory {
    @Override
    public Bullet createBullet() {
        return new CommonBullet();
    }

    @Override
    public Building createBuilding() {
        return new CommonBuilding();
    }
}

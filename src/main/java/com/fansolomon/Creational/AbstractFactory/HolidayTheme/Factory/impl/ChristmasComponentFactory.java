package com.fansolomon.Creational.AbstractFactory.HolidayTheme.Factory.impl;


import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.Building;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.Bullet;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.impl.ChristmasBuilding;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.impl.ChristmasBullet;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Factory.ComponentFactory;

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

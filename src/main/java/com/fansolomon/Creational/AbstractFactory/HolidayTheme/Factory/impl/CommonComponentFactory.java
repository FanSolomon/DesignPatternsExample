package com.fansolomon.Creational.AbstractFactory.HolidayTheme.Factory.impl;


import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.Building;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.Bullet;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.impl.CommonBuilding;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Components.impl.CommonBullet;
import com.fansolomon.Creational.AbstractFactory.HolidayTheme.Factory.ComponentFactory;

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

package Creational.AbstractFactory.HolidayTheme.Factory;

import Creational.AbstractFactory.HolidayTheme.Components.Building;
import Creational.AbstractFactory.HolidayTheme.Components.Bullet;

public interface ComponentFactory {

    Bullet createBullet();

    Building createBuilding();
}

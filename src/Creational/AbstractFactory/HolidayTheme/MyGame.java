package Creational.AbstractFactory.HolidayTheme;

import Creational.AbstractFactory.HolidayTheme.Components.Building;
import Creational.AbstractFactory.HolidayTheme.Components.Bullet;
import Creational.AbstractFactory.HolidayTheme.Factory.ComponentFactory;
import Creational.AbstractFactory.HolidayTheme.Factory.impl.ChristmasComponentFactory;
import Creational.AbstractFactory.HolidayTheme.Factory.impl.CommonComponentFactory;

import java.math.BigDecimal;

public class MyGame {

    static void createGame(ComponentFactory factory) {
        Bullet bullet = factory.createBullet();
        Building building = factory.createBuilding();

        System.out.println("canKillPeople:" + bullet.canKillPeople());
        System.out.println("experience:" + bullet.setExperienceAfterHit(new BigDecimal(0)));
        System.out.println("shootingFeature:" + bullet.shootingFeature());

        System.out.println("playBackgroundMusic:" + building.playBackgroundMusic());
        System.out.println("npcCount:" + building.npcCount());
    }

    public static void main(String[] args) {
        // p.s.实际使用 这里实例化具体工厂时 可以不在代码中写死，而是进行动态配置
        System.out.println("------------christmas------------");
        ComponentFactory christmasFactory = new ChristmasComponentFactory();
        createGame(christmasFactory);
        System.out.println("------------common------------");
        ComponentFactory commonFactory = new CommonComponentFactory();
        createGame(commonFactory);
    }
}

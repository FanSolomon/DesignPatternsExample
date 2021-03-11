package Creational.Builder.Terrain;

public class MainTest {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildFort().buildMine().buildWall().build();
        System.out.println(t);
    }
}

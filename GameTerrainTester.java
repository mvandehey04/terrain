public class GameTerrainTester {
    public static void main(String args[]){
        Terrain plain = new Terrain(100,100);
        System.out.println(plain.getTerrainSize() + "\n");

        Forest forest = new Forest(150, 150, 72);
        System.out.println(forest.getTerrain() + forest.getTerrainSize() + forest.getTrees() + "\n");

        Mountain mountain = new Mountain(200, 200, 6);
        System.out.println(mountain.getTerrain() + mountain.getTerrainSize() + mountain.getMountains() + "\n");

        WinterMountain wMountain = new WinterMountain(250, 250, 7, 22.8);
        System.out.println(wMountain.getTerrainType() + wMountain.getTerrain() + wMountain.getTerrainSize() + wMountain.getMountains() + wMountain.getTemp() + "\n");

        Beach beach = new Beach(300, 300, 3.6);
        System.out.println(beach.getTerrain() + beach.getTerrainSize() + beach.getUvInd() + "\n");

        TropicalBeach tropBeach = new TropicalBeach(350, 350, 2.8, "coconut");
        System.out.println(tropBeach.getTerrainType() + tropBeach.getTerrain() + tropBeach.getTerrainSize() + tropBeach.getUvInd() + tropBeach.getFruit() + "\n");
    }
}

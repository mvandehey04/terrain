public class Forest extends Terrain{
    private int trees;

    public Forest(int length, int width, int trees) {
        super(length, width);
        this.trees = trees;
    }

    public String getTerrain(){
        return "Forest ";
    }

    public String getTrees(){
        return " and has " + trees + " trees";
    }
}

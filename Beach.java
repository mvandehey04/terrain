public class Beach extends Terrain{
    private double uvInd;

    public Beach(int length, int width, double uvInd){
        super(length, width);
        this.uvInd = uvInd;
    }

    public String getTerrain(){
        return "Beach ";
    }

    public String getUvInd(){
        return " and has a UV index of " + uvInd;
    }
}

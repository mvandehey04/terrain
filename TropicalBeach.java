public class TropicalBeach extends Beach{
    private String fruit;

    public TropicalBeach(int length, int width, double uvInd, String fruit){
        super(length, width, uvInd);
        this.fruit = fruit;
    }

    public String getTerrainType(){
        return "Tropical ";
    }

    public String getFruit(){
        return " and grows the tropical fruit " + fruit;
    }
}

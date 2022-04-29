public class Mountain extends Terrain{
    private int mountains;

    public Mountain(int length, int width, int mountains){
        super(length, width);
        this.mountains = mountains;
    }

    public String getTerrain(){
        return "Mountain ";
    }

    public String getMountains(){
        return " and has " + mountains + " mountains";
    }
}

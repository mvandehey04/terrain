public class WinterMountain extends Mountain{
    private double temp;

    public WinterMountain(int length, int width, int mountains, double temp){
        super(length, width, mountains);
        
        this.temp = temp;
    }

    public String getTerrainType(){
        return "Winter ";
    }

    public String getTemp(){
        return " and the temperature is " + temp + " degrees";
    }
}

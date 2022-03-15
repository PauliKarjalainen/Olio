public class Bottle {
    private String name = "Pepsi Max";
    private String manufacturer = "Pepsi";
    private double total_energy = 0.3;
    private double koko = 0.5;
    private double hinta = 1.80;

    public Bottle(){}
    
    public Bottle(String n, String m, double ikoko, double ihinta){
        name = n;
        manufacturer = m;
        koko = ikoko;
        hinta = ihinta;
    }
    
    public String getName(){
        return name;
    }
    public double getSize(){
        return koko;
    }
    public double getPrice(){
        return hinta;
    }
    public String getManufacturer(){
        return  manufacturer;
    }
    public double getEnergy(){
        return total_energy;
    }
}
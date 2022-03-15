import java.util.ArrayList;

public class BottleDispenser {

    public static BottleDispenser n = null;


    public static BottleDispenser getInstance(){
        if (n == null) {
            n = new BottleDispenser();
        }
        return n;
    }
    
    private double money;
    private double hinta;
    ArrayList<Bottle> pullot = new ArrayList<Bottle>();
    
    public BottleDispenser() {
        money = 0;
        pullot.add(new Bottle("Pepsi Max", "Pepsi", 0.5, 1.8));
        pullot.add(new Bottle("Pepsi Max", "Pepsi", 1.5, 2.2));
        pullot.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.5, 2.0));
        pullot.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 1.5, 2.5));
        pullot.add(new Bottle("Fanta Zero", "Coca-Cola", 0.5, 1.95));
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle(int valinta) {
        //Bottle pullo = new Bottle();
        //hinta = pullo.getPrice();
            if(money > hinta){
                    System.out.println("KACHUNK! " + pullot.get(valinta - 1).getName() + " came out of the dispenser!"); // pullo.get(valinta - 1).getname();
                    money -= pullot.get(valinta - 1).getPrice();
                    pullot.remove(valinta - 1);
                    // money -= bottles.get(valinta - 1).getPrice();
            }else{
                System.out.println("Add money first!");
            }
        }
    
    public void listBottles(){
        int i = 0;
        for (Bottle b:pullot){
            System.out.println(i + 1 + ". Name: " + b.getName());
            System.out.println("\tSize: " + b.getSize() + "\tPrice: " + b.getPrice());
            i++;
        }
    }

    public void returnMoney() {
        String fyrkka = String.format("%.2f", money);
        System.out.println("Klink klink. Money came out! You got " + fyrkka + "€ back");
        money = 0;
    }
}
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) throws Exception {


        
        int choice = 5;

        BottleDispenser Automaatti1 = BottleDispenser.getInstance();

        Scanner scan = new Scanner(System.in);
        while (choice != 0){
            System.out.print("\n*** BOTTLE DISPENSER ***\n1) Add money to the machine\n2) Buy a bottle\n3) Take money out\n4) List bottles in the dispenser\n0) End\nYour choice: ");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    Automaatti1.addMoney();
                    break;
                case 2:
                    Scanner inp = new Scanner(System.in);
                    int valinta;
                    Automaatti1.listBottles();
                    System.out.print("Your choice: ");
                    valinta = inp.nextInt();
                    Automaatti1.buyBottle(valinta);
                    break;
                case 3:
                    Automaatti1.returnMoney();
                    break;
                case 4:
                    Automaatti1.listBottles();
                    // tähän Automaatti1.listBottles();
                    break;
            }
        }
        scan.close();
    }
}

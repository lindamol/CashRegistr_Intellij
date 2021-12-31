import java.util.Scanner;

public class Store {
    Item[] inventory;
    int userQnty, userchoice;
    double totalprice;
    int[] stock = new int[3];
    int j;

    Store() //constructor
    {
        inventory = new Item[]{
                new Item("Pants", 10, 100),
                new Item("Shoes", 40, 400),
                new Item("Shirts", 50, 99)};

    }

    public void PrintMenu() {
        System.out.println("---------------------MENU----------------------");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println((i + 1) + "--: " + inventory[i].itemname + " at Price $" + inventory[i].itemprice + "," +
                    "Quantiy Available:" + inventory[i].itemquantity);
        }
        System.out.println("Press 4 To Exit");
        System.out.println("------------------------------------------------");
    }

    public void getuserinput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which Product would you like to purchase or Press 4 to Exit :");
        userchoice = input.nextInt();
        if(userchoice ==4)
            System.exit(0);
        System.out.println("Quantity of the product you would like to purchase");
        userQnty = input.nextInt();

    }

    public double calculate()
    {
         for (int i = 0; i < inventory.length; i++) {
             j=i;
            if (userchoice == i + 1)
                totalprice = inventory[i].itemprice*userQnty;
                //stock[j] =inventory[i].itemquantity - userQnty;
                    }
                return totalprice;
    }
    /*public int remainstock()
    {
        return stock[j];
    }*/
}
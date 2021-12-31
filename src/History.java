import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class History extends Item { //Inherited Items here

ArrayList<Integer> quantitylist = new ArrayList<>();
ArrayList<Integer> userchoice = new ArrayList<>();
ArrayList<String> choicename = new ArrayList<>();
ArrayList<LocalDate> dateofpurchase = new ArrayList<LocalDate>();
ArrayList<LocalTime> timeofpurchase = new ArrayList<LocalTime>();
int pqty=10,shoeqty=40,shirtqty=50;

    void HistoryAdd(int quantity, int choice, LocalDate date,LocalTime time) {
        quantitylist.add(quantity);
        dateofpurchase.add(date);
        timeofpurchase.add(time);
        if(choice ==1)
        { choicename.add("Pants");}
            else if(choice==2)
        {   choicename.add("shoes");     }
                else choicename.add("Shirt");
        userchoice.add(choice);
        System.out.println("-------------Updated Purchase List----------");
        System.out.println("List of Items bought by user :"+"\t"+choicename);
        System.out.println("List of  Quantity Purchased  :"+"\t"+quantitylist);
        System.out.println("List of date of purchases    :"+"\t"+dateofpurchase);
        System.out.println("List of time of purchases    :"+"\t"+timeofpurchase);
                    }
            void StockAdjust(int quantity,int choice)
            { if(choice==1)
                pqty=pqty-quantity;
                else if(choice==2)
                    shoeqty=shoeqty-quantity;
                else shirtqty=shirtqty-quantity;
             System.out.println("Remaining Pants stock is    :"+"\t"+pqty);
             System.out.println("Remaining Shirt stock is    : "+"\t"+shirtqty);
             System.out.println("Remaining Shoe  stock is    : "+"\t"+shoeqty);
             System.out.println("------------------THE END-----------------"+"\n");
            }
}


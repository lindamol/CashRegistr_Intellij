import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class MainMenu{
    public static void main(String[] args) {

        Store obj = new Store();
        Item obj2 = new Item();
        History his = new History();
        Date date = new Date();
        //LocalDate localDate= new LocalDate.now();
        //System.out.println(hobj.quantitylist);
          while(true) {
              obj.PrintMenu();
              obj.getuserinput();

              double price = obj.calculate();
              System.out.println("The total Price is :" + price);
              LocalDate localDate= LocalDate.now();
              LocalTime localTime= LocalTime.now();
              his.HistoryAdd(obj.userQnty,obj.userchoice,localDate,localTime);
              his.StockAdjust(obj.userQnty,obj.userchoice);
          }
    }
}

import java.util.ArrayList;
import java.util.*;

public class Item {
    int itemquantity;
    double itemprice;
    String itemname;
    Item()
    {
          }
//To instantiate the object using constructor
        Item(String name,int quantity,double price)

    {  this.itemname= name;
       this.itemquantity=quantity;
       this.itemprice=price;
        }
}

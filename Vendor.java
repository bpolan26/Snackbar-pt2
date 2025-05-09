public class Vendor
{
    //Instance Variables:
    private int stock;
    //Number of items in stock 
    private int price;
    //Price per item in cents 
    private int deposit;
     // Money deposited in cents 
     private int change; 
     
      
     
     private static double totalSales=0.0;
     
     public Vendor (int p, int s)
     {
         price = p;
         stock = s;
         deposit = 0;
         change = 0;
         
     }
     
     public void setStock(int s)
     { 
         stock = s;
         
     }
     
     public int getStock()
     {
         return stock;
         
     }
     
     public void addMoney(int cents)
     {
         deposit +=cents;
     }
     
     public int getDeposit()
     {
         return deposit;
         
     }
     
     public boolean makeSale()
     {
         if (stock > 0 && deposit >= price)
         {
             stock--;
             change = deposit - price;
             deposit = 0;
             totalSales += 100.0;
             
             return true;
             
         }
         else
         {
             change = deposit;
             deposit = 0;
             return false;
             
         }
     }
     
     public int getChange()
     {
         int c = change;
         change = 0;
         return c;
         
     }
     
     public static double 
     getTotalSales()
     {
         double total = totalSales;
         totalSales = 0.0; 
         return total;
         
     }
}

package saladaty;

import java.time.LocalDateTime;

public class Payment {
    
    private double totalPrice;
    Order order = new Order();
    private static LocalDateTime orderTime= LocalDateTime.now() ; 
    

    public Payment(Order order) {
        this.order=order;
        Order.setOrderNo();
        
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    
    public double calculateTotalPrice(){
        for (int i = 0; i <order.getOrderSize(); i++) {
            double meal1 = order.getOrderedMeals().get(i).getMealPrice();
            totalPrice+=meal1;
        }
        return totalPrice;
    }
    
   public void clearPayment(){
       totalPrice=0;
   }
   
   public String pay(double payment){
       String massage;
       if (payment==getTotalPrice())
           massage="You have payed the totla price successfully, Thank you for dealing with us";
       else if (payment>getTotalPrice()){
           double remaining=payment-getTotalPrice();
           String remainingString=String.valueOf(remaining);
           massage="Thank you for paying, your change is: "+remainingString+" SAR \n We are waiting for you to come again ^_^";
       }
       else {
           double morePayment=getTotalPrice()-payment;
           String morePaymentString=String.valueOf(morePayment);
           massage="Thank you for paying, but you have to bay more "+morePaymentString+" SAR \nWe are waiting for you to come again ^_^";     
       }
       return massage;
   }

    public static LocalDateTime getOrderTime() {
        return orderTime;
    }
   
   

    @Override
    public String toString() {
        
        return "-----------------------[  Saladaty Bill  ]-------------------------\n"
              +"   - Order Number: "+Order.getOrderNo()+"\n"
             + "   - Order Details: \n"
             + "    "+order.getOrderMealNames()+"\n"
             + "-----------------------[    Toatl Price    ]------------------------\n"
             + "                          Price:"+calculateTotalPrice()+" SAR       \n"
             + "                     "+getOrderTime()+"                             \n"
             + "--------------------------------------------------------------------\n";
    }
    
   
    
    
}


package saladaty;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Order {
    

    //data fields:
    private ArrayList<Meal> orderedMeals= new ArrayList<>();
    private static int orderNo=0;
    private double orderSize;
    private static LocalDateTime chickTime; 

    // constructors:
    public Order() {
        orderNo++;
    }

    // setters and getters and other methods:

    public static int getOrderNo() {
        return orderNo;
    }

    public static void setOrderNo() {
        orderNo++;
    }

    public double getOrderSize() {
        return orderedMeals.size();
    }

    // to get specefic meal:
    public Meal getSpecifiecOrderdMeal(int mealId) {
        return orderedMeals.get(mealId-1);
    }

    // to add meal to the orderdMeals:
//    public void addMeal(Meal meal){
//        orderedMeals.add(meal);
//    }
    
    
    public void addMeal(Menu menu,int mealId){
        if (mealId==menu.Salads.get(mealId-1).getMealId())
        orderedMeals.add(menu.Salads.get(mealId-1));
    }

    public ArrayList<Meal> getOrderedMeals() {
        return orderedMeals;
    }


    // to deleteAllOrderedMeals:
    public void deleteOrder(){
        orderedMeals.clear();
    }
    
    //to delete specific Meal from orderedMeals:
    public void deleteOrderdMeal(int mealId){
        orderedMeals.remove(mealId-1);
    }
    
    //to chickOut after Order:
    public static boolean checkOut(int answer){
        
        
        if(answer==1){
            chickTime=LocalDateTime.now();
            return true;
        }
        else
            return false; 
    }
    
    public ArrayList<String> getOrderMealNames(){
        
        ArrayList<String> mealName=new ArrayList();
        for (int i = 0; i <orderedMeals.size(); i++) {
            mealName.add(orderedMeals.get(i).getMealName());
        }
        
        return mealName;
    }
    
  
        
        
    }

    
    


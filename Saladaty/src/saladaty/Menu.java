
package saladaty;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    Scanner input= new Scanner(System.in);
    
    // our menues, in our resturant we have only salad for now, and if we want to expand the system we will make new here:
    public ArrayList<Meal> Salads = new ArrayList<>();

    public Menu() {
    //initilizie salad menu it by invoking the make salads method:
     MakeSaladsMenu();
    //if we have another menu we will make a method for initilizing it and invoke it here....
    }

    
    //a method that returns a specific Salads menu, which is the goal of the app
    public void getSaladsMenu() {
                      System.out.println("********************************************************************************\n");
                      System.out.println("                                   Menue: \n");
                      System.out.println("********************************************************************************\n");
                      for (int j = 0; j <Salads.size(); j++) {
                            System.out.println("  ("+(j+1)+") "+Salads.get(j).toString()+"");
                            System.out.println("");
                            System.out.println("********************************************************************************\n");
                      }
    }

    // a method for setting a specific salad from the Salads Menu    
    public void setSpecificSalad(int mealId){
        System.out.print("Enter the new salad name: ");
        String saladName=input.nextLine();
        System.out.print("Enter the new salad price: ");
        String saladPrice=input.nextLine();
        double saladP=Double.valueOf(saladPrice);

        System.out.print("Enter the new salad description: ");
        String saladDescreption=input.nextLine();
        Salads.get(mealId-1).setMeal(saladName,  saladP, saladDescreption);
        
        System.out.println("The meal has been updating successfully");
        
        System.out.println("see it on the menu: ");
        System.out.println("");
        getSaladsMenu();
        
    }
    
    // if in the future we expand our restaurant to have other types of meals other than salads, we will use it to get the menu:
    public void getMenu(ArrayList <Meal> menu){
        System.out.println(menu.getClass().getName());
        for (int i = 0; i <menu.size(); i++) {
            System.out.println(menu.get(i).toString());
            
        }
    }

    // a method to initilize the salad menu with 6 types of salads:
    public void MakeSaladsMenu(){
        Salads.add(new Meal (1,"Cessar Salad",25,"Lettues, parmesan cheese, bread and chicken \n     | (cessar Sause)"));
        Salads.add(new Meal (2,"Taboola",20,"Parsley, tomato, bulgur \n     | (Olive oil & Lemon Sause)"));
        Salads.add(new Meal (3,"Rocket Salad",35,"Rocket leaves, pomegranate seeds,bulgur, parmesan\n       cheese | (Balssamic & Pomegranate molasses Sause)"));
        Salads.add(new Meal (4,"Greek Salad",40,"Red onions, lettues, green pepper, cherry tomato,\n     cucumber, feta cheese | (Olive oil & Lemon Sause)"));
        Salads.add(new Meal (5,"Fatoosh",30,"pita bread, tomato, halloumi cheese, mint leaves,\n     parsley , green onion, cucumber, sumac | (Olive oil & Lemon Sause)"));
        Salads.add(new Meal(6,"Saladty Salad",40,"Vegatables, quinoa, nuts, cheese, kunafa\n     | (Olive oil & Lemon Sause)"));
    }
    
    //get specific Salad:
    public Meal getSpecificSalad(int mealId){
        return Salads.get(mealId-1);
    }
    
    //getSpecific Meal, if in future we made other menues:
    public Meal getSpecificMeal(int mealId, ArrayList <Meal> menu){
        return menu.get(mealId-1);
    }
    
    //delteing meal from salads menu:
    public void deleteMealFromSalads(int mealId){
        Salads.remove(mealId-1);
        System.out.println("The meal has been deleted successfully");
        
        System.out.println("The new Menu is: ");
        System.out.println("");
        getSaladsMenu();
    }
    
    //adding meal to the menu:
    public void addingMealtoSaladMenu(int mealId, String mealName, double mealPrice, String mealDescreption){
       
        //Ading the meal at specific index:
        Salads.add(mealId-1,new Meal(mealId, mealName, mealPrice,mealDescreption));
        System.out.println("The meal has been added successfully");
        
        System.out.println("The new Menu is: ");
        System.out.println("");
        getSaladsMenu();

    }
    
    
    
    
    
    
    
}

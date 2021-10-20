package saladaty;


import java.util.ArrayList;
import java.util.Scanner;

public class Saladaty {
    
    //Syestem UsersArrayList
    static ArrayList <User> systemUsers=new ArrayList<>();
    
    //the Salads menu object:
    static Menu saladsMenu = new Menu();

    static Scanner input=new Scanner(System.in);
  
    public static void main(String[] args) {
        
        
        //Syestem UsersArrayList (Using Polymoorphisim):

        //Admins of the system List:
        systemUsers.add(new Admin("@Zahraa_Maher","ZMA1996AN","Zahraa Maher Al-Nemer"));
        systemUsers.add(new Admin("@Malak_Mohammad","memeD1998","Malak Mohammad Darweesh"));
        systemUsers.add(new Admin("@Lamyaa_Mohammad","lammoy998","Lamyaa Mohammed Al-Qahtani"));
        systemUsers.add(new Admin("@Zainab_Abduljalil","ZaiJalil9","Zainab Abduljalil Alrashed"));
        systemUsers.add(new Admin("@Rasha_Mubarak","RereMD123","Rasha Mubarak Al-Dawssary"));
        systemUsers.add(new Admin("@Salhah_Yasin","SalYas321","Salhah Yaseen Al-far"));
        systemUsers.add(new Admin("zz","12345678ss","Zahraa Maher Al-Nemer"));
        
        //Some Customers:
         systemUsers.add(new Customer("zzz","12345678ss","Zahraa Maher"));

         // name of the application:
        System.out.println("      \t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                         + "      \t\t@                                                              @\n"
                         + "      \t\t@                  ★ Saladaty Restaurant ★                     @\n"
                         + "      \t\t@                                                              @\n"
                         + "      \t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        
        
        System.out.println("                               WELCOME TO SALADATY APPLICATION ");
        System.out.println("                          ------------------------------------------\n");

        int choice=0;

        while(choice!=4){
            System.out.println(" choose if you are customer or admin ? ");
            System.out.println(" 1- Customer. ");
            System.out.println(" 2- Admin.  ");
            System.out.println(" 3- Close Program.  ");
            System.out.print("your choice>> ");
            choice=input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                // starting of custumer field/choice:
                    CustomerRun();
                 break;  

                // starting of Admin field/choice:
                case 2:
                    AdminRun();
                    break;
                    
                // ending the program choice:
                case 3:
                System.out.println("\n===========( Thank You for Dealing with Saladaty && Goodbye ♥◡♥ )=========== \n");
                
                System.exit(0);
                break; 

                // if invalid choice :
            default:
                System.err.println("invalid choice!");
                System.out.println("\n==========================( Back To Main Menu )============================= \n"); // end of default field
                

                
        }// end of switch choice admin or customer or close program
        }// end of while loop for the whole program (chose if you are customer or admin or close program )
    } //end of main
        
    
    
    public static void CustomerRegister(ArrayList <User> myUsers){
        
        int index=8;
        
            System.out.println("\n===================( Customer Membership Registeration )==================== \n");
            
            
               System.out.println(" [ Entering user information ]");
               System.out.print(" Enter username: ");
               String username=input.next();
               System.out.print(" Enter your password: ");
               String password=input.next();
               System.out.print(" Enter your e-mail: ");
               String email=input.next();
               System.out.print(" Enter your phoneNum: ");
               String phoneNum=input.next();
               
               input.nextLine();
               System.out.print("\n [ Enter your information  ]\n"); 
               System.out.print(" what is your name ? ");
               String namecustomer=input.nextLine();
               System.out.print(" what is your address ? ");
               String address=input.nextLine();

               
               if (User.chickPassword(password)){

            myUsers.add(new Customer(namecustomer,address,username,password,phoneNum,email));

        if (myUsers.get(index) instanceof Customer){
     
            Customer c= (Customer)myUsers.get(index);
            
            System.out.println("\n** Thank you for registerin dear "+c.getName()+", your username is: "+c.getUserName()+" **\n");
               index++;
               
        }
               }
               else{
                   System.out.println("\nyou cant reigister with this password; this is the password rules: ");
                   System.out.println("1. A password must have at least eight characters. "
                                    + "\n2. A password consists of only letters and digits. "
                                    + "\n3. A password must contain at least two digits");
               }
        
        System.out.println("\n==========================( Back To Main Menu )============================= \n");
        
       
        }//end of customer register method
    
    
    
    //2- Custumer Method:
    public static void CustomerRun(){
        
//        Menu saladsMenu = new Menu();
        
        System.out.println("\n==============================( Welcome Customer )========================== \n");
        
                int chicking=0;
                System.out.print("Choose what do you want:"
                               + "\n 1- Register"
                               + "\n 2- Login"
                               + "\n   Your choise >> ");
                chicking=input.nextInt();
                input.nextLine();
                
                    switch(chicking){
                        
                        // if customer choose to rigiester:
                        case 1:
                            CustomerRegister(systemUsers);
                            break;//end of registeration case....
                        
                        // if he has a member ship:
                        case 2:
                            System.out.println("\n-----------------------------[ Customer LogIn ]-----------------------------");
                            
                            System.out.print("\nEnter your username: ");
                            String username=input.nextLine();
                            System.out.print("Enter your password: ");
                            String pass=input.nextLine();
                            
                              for (int i = 0; i <systemUsers.size(); i++) {
                                if(systemUsers.get(i).getUserName()!=null && systemUsers.get(i).getPassword()!=null){
                                    if ((systemUsers.get(i).getUserName().equals(username))&& (systemUsers.get(i).getPassword().equals(pass))){
                                        if (systemUsers.get(i) instanceof Customer){
                            
                                            //CASING THE USER TO CUSTOMER:
                                            Customer customer1= (Customer)systemUsers.get(i);
                                            
                                            System.out.println("\n====================================( Welcome " +customer1.getName().toUpperCase()+ " )==================================== \n");
                                            ;
                 
                                            //STARTING THE CUSTOMER TASKS:
                                            
                                            // Customer first Task: Ordering or not
                                            
                                              //show the menu for the customer:
                                              
                                                saladsMenu.getSaladsMenu();
                                            
                                                    int orderChoice=0;       
                                                        System.out.print("\nAre you ready to order ?"
                                                                + "\n 1- Yes "
                                                                + "\n 2- No "
                                                                + "\n your choice >> ");
                                                        orderChoice=input.nextInt();
           
                                                        if(orderChoice==1){
                                                            System.out.println("\n================================( Ordering )================================ \n");
                                                            
                                                            
                                                            String answer=input.nextLine();
                                                            Order order1= new Order();
                                                            
                                                            //start of do-while loop:
                                                            do{
                                                            
                                                                
                                                                
                                                            System.out.print("\nEnter the number of the salad you want to add: ");
                                                            int mealId=input.nextInt();
                                                            input.nextLine();
                                                            
                                                            
//                                                            while(mealId!=saladsMenu.Salads.get(mealId-1).getMealId()){
//                                                                System.out.println("invalid meal number, enter the number again: "); 
//                                                                mealId=input.nextInt();
//                                                                input.nextLine();
//                                                            }
                                                            
                                                            order1.addMeal(saladsMenu, mealId);
                                                            System.out.println("\ndo you want anything else? ");
                                                            answer=input.nextLine();
                                                            
                                                            
            
                                                            }
                                                            while ( !(answer.equals("no") || answer.equals("No") || answer.equals("NO")) );//enf of do while
                                                             
                                                            System.out.println("\nyour order is: ");
//                                                            System.out.println(order1.getOrderedMeals());
                                                            for (int j = 0; j <order1.getOrderSize(); j++) {
                                                                System.out.println(order1.getOrderedMeals().get(j).getMealName());
                                                            }
                                                            
                                                           System.out.println("\n============================================================================ \n");
                                                           
                                                            
                                                            //After finishing order, show bill:
                                                            Payment payment1= new Payment(order1);
                                                            
                                                            System.out.println("\nyour order bill is:");
                                                              System.out.println(payment1.toString());
                                                              
                                                              System.out.println("\n============================================================================ \n");
                                                              
             
                                                            //after seeing bill, chick out and payment:
                                                            System.out.print("\nDo you want to chick out write now?\n"
                                                                             + "  1- yes\n"
                                                                             + "  2- no\n"
                                                                             + "your choice >> ");
                                                            
                                                            int ChickOutChoice=input.nextInt();
                                                            if(ChickOutChoice==1){
                                                            Order.checkOut(ChickOutChoice);
                                                                System.out.println("\n\n**       You are goint to chick out by paying .....       **\n\n");
                                                                System.out.print("Do you want to pay right now? \n"
                                                                             + "  1- yes\n"
                                                                             + "  2- no\n"
                                                                             + "your choice >> ");
                                                            int paymentChoice=input.nextInt();
                                                                    
                                                            if (paymentChoice==1){
                                                                System.out.print("Enter how much you will pay: ");
                                                                double HOWpay=input.nextDouble();
                                                                System.out.println("\n"+payment1.pay(HOWpay));
                                                                    }
                                                            else if (paymentChoice==2){
                                                                System.out.println("\nif you're not going to pay, your order will be calncelled....\n");
                                                            }
                                                            else {
                                                                System.out.println("\nInvalid choice, you order will be cancelled");
                                                            }
                                                            
                                                            
                                                            }
                                                            else 
                                                                System.out.println("\n**       our order will be canselled!       ** ");
        
                                                            
                                                            } // end of ORDERing choice
                                                        
                                                            
                                                            
                                                        else if (orderChoice==2){
                                                            System.out.println("\n==========================( Back To Main Menu )============================= \n");
                                                            break;

                                                        } // end of not ready to order choice
                                                        else {
                                                        System.out.println("Invalid choice");
                                                        System.out.println("\n==========================( Back To Main Menu )============================= \n");      
                                                        }//ind of invalid choice
                                                        
                                                        //END OF ORDER CHOICE
                                         
                                        }//END FOR THE INSTANCE OF OF THE CUSTOMER.....
                                        
                                        
                                        
         
                              }//enf of seconf if of the customer
                                    
                                
 
                    }//end for the first if
                                else {
                                            //if the login faild:
                                            System.err.println("\ninvalid choice!\n");
                                            
                                        }  

                    } // enf of customer for loop
                      default:
                            // in case of invalid input:
                            
                            System.out.println("\n==========================( Back To Main Menu )============================= \n");        
                    }
                    
                    //  ENDING OF THE CUSTOMER FIELD!!!!!!!!!
    }//end of customer run method
    
    
    
    //3. Admin Run Method:
    
    public static void AdminRun(){
        
        System.out.println("\n------------------------------[ Admin LogIn ]-------------------------------"); 
        
                    
                System.out.print("\nEnter your username: ");
                String username=input.nextLine();
                System.out.print("Enter your password: ");
                String pass=input.nextLine();
                
                systemUsers.add(new Admin(username,pass,"------"));
                
                
                
                
                if (systemUsers.get(0) instanceof Admin){
                            
                             Admin Admin1= (Admin)systemUsers.get(0);
                            
                             
                 System.out.println("\n============================( Welcome Admin )=============================== \n");
                 
                    
                    
                    int adminChoice=0;
                               
                               while (adminChoice!=4){
                                   
                                   System.out.println("Enter what do you want to do:\n"
                                           + "1- Add meal\n"
                                           + "2- Delete meal\n"
                                           + "3- Update meal\n"
                                           + "4- Back to main menu\n"
                                           + "  your choice >> ");
                                           adminChoice=input.nextInt();
                                           input.nextLine();
                                           
                                           switch(adminChoice){
                                               
                                               //case of Adding new Meal to the saladMenu:
                                               case 1:
                                                   
                                                   System.out.println("\n==============================( Adding Meal )=============================== \n");
                                                   
                                                   
                                         
                                                   System.out.print("Enter meal id: ");
                                                   int mealId=input.nextInt();
                                                   input.nextLine();

                                                   System.out.print("Enter the new salad name: ");
                                                   String saladName=input.nextLine();
                                                   System.out.print("Enter the new salad price: ");
                                                   String saladPrice=input.nextLine();
                                                   double saladP=Double.valueOf(saladPrice);

                                                    System.out.print("Enter the new salad description: ");
                                                    String saladDescreption=input.nextLine();

                                                   saladsMenu.addingMealtoSaladMenu(mealId,saladName,saladP,saladDescreption);
                                                   
                                                   System.out.println("\n============================================================================ \n");
                                                   
                                                   
                                                   
                                                   break;//ending of adding salad menu case
                                         
                                               case 2:
                                                   
                                                   System.out.println("\n=============================( Deleting Meal )============================== \n");
                                                   
                                                   
                                                   System.out.print("Enter meal id of the meal you want to delete: ");
                                                   mealId=input.nextInt();
                                                   saladsMenu.deleteMealFromSalads(mealId);
                                                   
                                                   System.out.println("\n============================================================================ \n");
                                                   
                                                   
                                                   
                                                   break;
                                                   
                                               case 3:
                                                   System.out.println("\n============================( Updating Meal )=============================== \n");
                                                   
                                                   
                                                   System.out.print("Enter meal id of the meal you want to update: ");
                                                   mealId=input.nextInt();
                                                   saladsMenu.setSpecificSalad(mealId);
                                                   
                                                   System.out.println("\n============================================================================ \n");
                                                   
                                                   
                                                   
                                                   break;
                                                   
                                                // close program choice:
                                                case 4:
                                                   System.out.println("Admin logging out! Thank you");
                                                   System.out.println("\n==========================( Back To Main Menu )============================= \n");
                                                   break;
                                                   
                                                   

                                                // in case of invalid choice:
                                                default:
                                                    System.err.println("invalid choice! \n");
                                                    System.out.println("\n========================( Back To Cutomer Menu )=========================== \n");
                                            }//end of switch choicing customer of adimn

                }
        
                                    }
    }

  
}// end of saladaty class
        
  
        
   

package saladaty;

public class Admin extends User {
    
    
    //data fields:
    private String adminName;
   
    //constructors:
    public Admin(){
        
    } 

    public Admin(String userName,String password,String adminName) {
        super(userName,password);
        this.adminName = adminName;
    }
    
    public Admin(String adminName,String userName,String password,String phoneNum,String email){
       super(userName,password,phoneNum,email);
       this.adminName = adminName;
 
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    
    
    // getters and setters:
    public String getAdminName() {
        return adminName;
    }

   //to string:
   public String toString(){
       
       return String.format("Admin Name: %s%n %s%n", getAdminName(), super.toString());
   }
    
 
    
    
    
}


package saladaty;

public class User {
    
    // data fields:
    private String userName;
    private String password;
    private String phoneNo;
    private String email;
    
    //constructors:
    public User(){
        this(" ", "123saladaty", "+966-xxxxxxxx", "xxxxxx@nnnnn.com");
    }

    public User(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }
    
    

    public User(String userName, String password, String phoneNo, String email) {
        this(userName,password);
        setPhoneNo(phoneNo);
        setEmail(email);
    }

    
    // setters and getters:
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.length()>20)
            System.out.println("You can't regestier with a user name longer than 20");
        else
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (chickPassword(password)){
            this.password = password;
        }
        }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        if (!phoneNo.startsWith("+966-"))
        this.phoneNo = "+966-"+phoneNo;
        else
            this.phoneNo=phoneNo;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@"))
        this.email = email;
        else{
        System.out.println("\ninvalid email, each e-mail should contains @ charachter\n"
                + "your email will be concanated with: @xxxxxxx.com");
        this.email = email+"@xxxxxxx.com";
        }
    }

    
    // other methods:
    public static boolean chickPassword(String pass){
        
        //– A password must have at least eight characters.
       //– A password consists of only letters and digits.
      //– A password must contain at least two digits.

    // 1.    Check length :
    if (pass.length() < 8)   
        return false;
        
    // 2. Only letters and digits?
    for (int i = 0; i < pass.length(); i++) {
      if (!Character.isLetterOrDigit(pass.charAt(i)))
        return false;
    }  

    // 3. Count the number of digits :
    int digits = 0;
    for (int i = 0; i < pass.length(); i++) {
        if (Character.isDigit(pass.charAt(i)))
           digits++; 
    }
    
    if (digits>= 2)
      return true;
    else
      return false;
    
  }//end of chick password method
    
    //toString :
    @Override
    public String toString() {
        return String.format("User Name: %s%n Password: %s%n Phone Number: %s %n E-mail: %s%n", getUserName(),getPassword(),getPhoneNo(),getEmail());
    }
    
    
    
}

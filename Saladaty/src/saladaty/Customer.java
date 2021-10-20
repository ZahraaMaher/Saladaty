
package saladaty;

public class Customer extends User {
    
    // data fields:
    private String name;
    private String address;
    
    //Constructors:
    public Customer() {
    }
    
    public Customer(String userName, String password, String name){
        super(userName,password);
        this.name=name;
    }

    public Customer(String name, String address,String userName, String password, String phoneNo, String email) {
       super(userName, password,phoneNo,email);
        this.name = name;
        this.address = address;
    }

    
    // getters and setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // toString:
    @Override
    public String toString() {
        return String.format("Cutomer Name: %s%n Customer Address: %s%n%s",getName(), getAddress(),super.toString());
    }
    
    
    
    
    
    
}

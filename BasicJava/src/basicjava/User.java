package basicjava;


public class User {
    
    private int ID;
    private String FirstName;
    private String LastName;
    private int Age;
    
    public User (int ID, String FirstName, String LastName, int Age)
    {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        
    }
    
    public int getID(){
        return ID;
       
    }
    public String getFirstName(){
        return FirstName;
    }     
    public String getLastName(){
        return LastName;  
    }
    public int getAge(){
        return Age;
    }

}

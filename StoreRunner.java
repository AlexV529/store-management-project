import java.util.Scanner;
//the tester class
public class StoreRunner {
  public static void main(String[] args) {

// electronics object with parameters
Electronics a = new Electronics("Xbox", 499.99, true);
  //printing the toString method to the console based on the parameters  
System.out.println(a.toString());

    Phone b = new Phone("Iphone", 999.99, false);
    
System.out.println(b.toString());
    
    GamingComputer c = new GamingComputer("Alienware", 2999.99, true);
    
System.out.println(c.toString());

//Electronics object without parameters
Electronics d = new Electronics();
    //prints the toString method to the console
System.out.println(d.toString());

Phone e = new Phone("Android", 700, true);
    
System.out.println(e.toString());
    


    
  }
}
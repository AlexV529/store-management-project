// the superclass of phone and GamingComputer
public class Electronics {
  //instance variables
  private String name;
private double price;
  private boolean goodQuality;
  

//no argument constructor
  public Electronics(){
    this.name = "Phone";
    this.price = 1000.0;
    this.goodQuality = true;
  }
  
    //first parameterized constructor
public Electronics(String name, double price, boolean goodQuality){
  this.name = name;
  this.price = price;
  this.goodQuality = goodQuality;
  
}
//second paramterized constructor
public Electronics(boolean goodQuality){
  this.name = "Gaming Computer";
  this.price = 2000;
  this.goodQuality = goodQuality;
}

  //accessor method for name
public String getName(){
  return name;
  
}
//mutator method for name
  public void setName(String name){
    this.name = name;
    
  }
//accessor method for price
  public double getPrice(){
    return price;
  }
//mutator method for variable price
  public void setPrice(double price){
    this.price = price;
    
  }
//accessor method for variable goodQuality
  public boolean getQuality(){
    return goodQuality;
  }
//mutator method for goodQuality
  public void setQuality(boolean goodQuality){
    this.goodQuality = goodQuality;
  }
// the toString method
  public String toString(){
    return "Name: " + name + "\nPrice: " + price + "\nGood Quality: " + goodQuality + "\n";
  }
}
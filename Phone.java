//subclass of Electronics
public class Phone extends Electronics {
  //instance variable
  private int storage;

  //no-argument constructor using super keyword
public Phone() {
  super();
  this.storage = 500;
}
//first parameterized constructor using super keyword
public Phone (String name, double price, boolean goodQuality, int storage) {
  super(name, price, goodQuality);
  this.storage = storage;
}
//second parameterized constructor using super keyword
  public Phone(String name, double price, boolean goodQuality){
    super(name, price, goodQuality);
  this.storage = 1000;
  }
 //Accessor method 
public int getStorage(){
  return storage;

}

//mutator method
  public void setStorage(int storage){
    this.storage = storage;
  }
//toString using super keyword
  public String toString(){
    return super.toString() + "Storage: " + storage + "\n";
  }
  
}
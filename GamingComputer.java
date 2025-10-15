//subclass of Electronics
public class GamingComputer extends Electronics{
//instance variable fps
private int fps;
//no-argument constructor using super keyword
  public GamingComputer(){
    super();
    this.fps = 60;
  }
//first parameterized cosntructor using super keyword
  public GamingComputer(String name, double price, boolean goodQuality, int fps){
    super(name, price, goodQuality);
    this.fps = fps;
  }
//second parameterized constructor using super keyword
  public GamingComputer(String name, double price, boolean goodQuality){
    super(name, price, goodQuality);
    this.fps = 360;
  }
//accessor method
public int getFps(){
  return fps;

}

//mutator method
  public void setFps(int fps){
    this.fps = fps;
  }
//toString method using the super keyword
  public String toString(){
    return super.toString() + "Fps: " + fps + "\n";
  }



  
}
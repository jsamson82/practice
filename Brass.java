/*
 * Activity 4.9.2
 */
public class Brass extends Band
{
  private boolean hasBrassObject;
  public void setHasBrassObject(){
    hasBrassObject = true;
  }
  public boolean getHasBrassObject(){
    return hasBrassObject;
  }
  public void speak()
  {
    System.out.println("The brass player talks.");
  }
  public void blow()
  {
    System.out.println("The brass player blows their instrument.");
  }
  
}
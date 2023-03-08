/*
 * Activity 4.9.2
 */
public class Lights extends Theater
{
  private boolean hasQuickHands;
  
  public void setHasQuickHands(){
    hasQuickHands = true;
  }
  public boolean getHasQuickHands(){
    return hasQuickHands;
  }

  public void speak()
  {
    System.out.println("The lights student is silent.");
  }
  public void sneak()
  {
    System.out.println("The lights student sneaks.");
  }
  
  
  
}
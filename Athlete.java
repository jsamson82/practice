/*
 * Activity 4.9.2
 */
public class Athlete extends Student
{
  private boolean isAthletic;
  public void lift()
  {
    System.out.println("The athlete lifts weights.");
  }
  public void run(){
    System.out.println("The athlete runs.");
  }
  public void speak(){
    System.out.println("The athelete grunts");
  }
  public void setIsAthletic(){
    isAthletic = true;
  }
  public boolean getIsAthletic(){
    return isAthletic;
  }
}
/*
 * Activity 4.9.2
 */
public class Soccer extends Athlete
{
  private boolean hasShinGuards;

  public void setHasShinGuards(){
    hasShinGuards = true;
  }
  public boolean getHasShinGuards(){
    return hasShinGuards;
  }

  public void speak()
  {
    System.out.println("The soccer kid whines.");
  }
  public void kick(){
    System.out.println("The soccer kid kicks");
  }
  public void dive(){
    System.out.println("The soccer kid dives");
  }

}
/*
 * Activity 4.9.2
 */
public class Preformer extends Theater
{
  private boolean isLoud;

  public void setIsLoud(){
    isLoud = true;
  }
  public boolean getIsLoud(){
    return isLoud;
  }


  public void speak()
  {
    System.out.println("The preformer sings.");
  }
  public void dance()
  {
    System.out.println("The preformer dances.");
  }
  
}
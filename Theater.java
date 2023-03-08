public class Theater extends Student {
  private boolean hasScripts;

  public void setHasScripts(){
    hasScripts = true;
  }
  public boolean getHasScripts(){
    return hasScripts;
  }

    public void speak()
    {
        System.out.println("The theater student sings");
    }
    public void vocals()
    {
        System.out.println("The theater student has active vocals.");
    }
    public void makeUp(){
      System.out.println("The theater student puts on makeup.");
    }
    public Theater(String food, boolean nocturnal, 
                int id)
{
  super(food, nocturnal, id);
  System.out.println("A theater student has arrived to school");
}
public Theater(){}

}

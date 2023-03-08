public class Football extends Athlete {
    private boolean hasFootball;
    public void setHasFootball(){
        hasFootball = true;
      }
      public boolean getHasFootball(){
        return hasFootball;
      }
    public void Throw()
    {
        System.out.println("The football player throws");
    }
    public void Tackle(){
        System.out.println("The football player tackles");
    }
    
public Football()
{
}
}

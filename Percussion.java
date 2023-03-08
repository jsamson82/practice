public class Percussion extends Band {
    private boolean hasDrumSticks;

    public void setHasDrumSticks(){
        hasDrumSticks = true;
      }
      public boolean getHasDrumSticks(){
        return hasDrumSticks;
      }

    public void speak()
    {
        System.out.println("The percussion player talks");
    }
    public void boom()
    {
        System.out.println("The percussion player booms");
    }

    public Percussion(String food, boolean nocturnal, 
    int id)
{
super(food, nocturnal, id);
System.out.println("A percussion player arrives");
}
public Percussion(){}
}

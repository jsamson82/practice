public class Band extends Student {
    private boolean playMusic;

    public void setPlayMusic(){
        playMusic = true;
      }
      public boolean getPlayMusic(){
        return playMusic;
      }
    public void rhythm(){
        System.out.println("The band player has rhythm");
    }
    public Band(String food, boolean nocturnal, 
    int id)
{
super(food, nocturnal, id);
}

public Band()
{
}
public void speak(){
    System.out.println("The band kid talks");
}
}

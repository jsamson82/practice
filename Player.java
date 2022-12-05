public class Player {
    private String name1;
    private int score1;
    private String name2;
    private int score2;
    public Player(){//generic players
        name1 = "hi";
        score1 = 0;
        name2= "bye";
        score2= 0;
    }
    public Player(String n1, int s1, String n2, int s2){//specfic players
        n1=name1;
        s1=score1;
        n2=name2;
        s2=score2;
    }
    public String getName1(){ //gets person 1's name
        return name1;
    }
    public int getScore1(){
        return score1;
    }
    public String getName2(){ //gets person 2's name
        return name2;
    }
    public int getScore2(){
        return score2;
    }
    public void setName1(String n1){ //sets person 1's name
        n1= name1;
    }
    public void setScore1(int s1){
        s1 = score1;
    }
    public void setName2(String n2){ //sets person 2's name
        n2 = name2;
    }
    public void setScore2(int s2){
        s2= score2;
    }
}

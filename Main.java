import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Board newBoard = new Board();
        newBoard.playerInfo();
        System.out.println("Guess this phrase");
        System.out.println(newBoard.emptyBoard());
        newBoard.guess();
        
    }
}
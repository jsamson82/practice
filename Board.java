import java.util.Scanner;
import java.io.File;
public class Board{
  String randomPhrase=loadPhrase(); //sets randomPhrase equal to a randomly generated phrase
  Scanner hi = new Scanner (System.in); 
  int number = 1;
  String personGuess = ""; //person's guess
  String haveBeenChosen =""; //letters that have already been guessed 
  String hasChosen = " "; //letters that have been guessed with commas
  String emptyBoard=""; //creates an empty board
  String board = emptyBoard;//creates a string that is equal to empty board
  String currentPhrase = "";
  String name1 ="";
  String name2="";
  Player newGame = new Player();
  public String playerInfo(){
    System.out.println("What is player 1's name?");//asks for player 1's name
    name1 = hi.nextLine();
    newGame.setName1(name1);
    System.out.println("What is player 2's name?"); //asks for player 2's name
    name2 = hi.nextLine();
    newGame.setName2(name2);
    return ("Hello "+ name1 + ". Hello" + name2);
  }
  private String loadPhrase()
  {

    String tempPhrase = "";
    
    int numOfLines = 0;
    tempPhrase = "how are you";
    
    try 
    {
      Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/practice/phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/practice/phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    return tempPhrase;
  }

  public String getRandomPhrase(){ //gets randomPhrase 
      return randomPhrase;
    }

  public String emptyBoard(){ //creates a board with underscores as the blank spaces to be guessed
  for (int i=0; i<randomPhrase.length(); i++){
    if (randomPhrase.substring(i,i+1).equals(" ")){
      emptyBoard+=  " ";
    }
    else{
      emptyBoard += "_";
    }  
  }
  return emptyBoard;
  }

  public String guess(){
    while (!currentPhrase.equals(randomPhrase)){
      if (number %2!=0){
        System.out.println(name1+ ", would you like to solve the puzzle or guess a letter. If solve, type 1. If guess, type 2.");
        String choice = hi.nextLine();
        if (choice.equals("1")){ //if player chooses to guess phrase, if they win game ends, if they lose it is next player's turn
          System.out.println("What do you think the phrase is?");
          personGuess = hi.nextLine();
          if (personGuess.equals(randomPhrase)){
            System.out.println("You Win!");
            break;
          }
          else if (!personGuess.equals(randomPhrase)){
            System.out.println("That is incorrect");
            number +=1;
          }
        }
        else if (choice.equals("2")){
          System.out.println(name1 +", which letter do you choose?");
          System.out.println("You have already guessed: "+ hasChosen);
          personGuess = hi.nextLine();
          haveBeenChosen += personGuess;
          for(int i=0;i<randomPhrase.length();i++){// checks if letter matches any of the spaces
            if(haveBeenChosen.contains(randomPhrase.substring(i,i+1))){
              currentPhrase += randomPhrase.substring(i,i+1);
            }
            else if(personGuess.equals(randomPhrase.substring(i,i+1))){
              currentPhrase += personGuess;
            }
            else if(randomPhrase.substring(i,i+1).equals(" ")){
              currentPhrase += " ";
            }
            else{
              currentPhrase += "_";
            }
          }
          number+=1;
          haveBeenChosen += personGuess;
          hasChosen += personGuess + ", ";
          if (currentPhrase.equals(randomPhrase)){
            System.out.println("The Phrase was "+ currentPhrase);
            System.out.println("you win!");
            break;
          }
        }
        System.out.println(currentPhrase);
        currentPhrase = "";
      }
      
      else {
        System.out.println(name2+", would you like to solve the puzzle or guess a letter. If solve, type 1. If guess, type 2.");
        String choice = hi.nextLine();
        if (choice.equals("1")){ //if player chooses to guess phrase, if they win game ends, if they lose it is next player's turn
          System.out.println("What do you think the phrase is?");
          personGuess = hi.nextLine();
          if (personGuess.equals(randomPhrase)){
            System.out.println("You Win!");
            break;
          }
          else if (!personGuess.equals(randomPhrase)){
            System.out.println("That is incorrect");
            number +=1;
          }
        }
        else if (choice.equals("2")){
          System.out.println(name2+", which letter do you choose?");
          System.out.println("You have already guessed: "+ hasChosen);
          personGuess = hi.nextLine();
          haveBeenChosen += personGuess;
          for(int i=0;i<randomPhrase.length();i++){
            if(haveBeenChosen.contains(randomPhrase.substring(i,i+1))){
              currentPhrase += randomPhrase.substring(i,i+1);
            }
            else if(personGuess.equals(randomPhrase.substring(i,i+1))){
              currentPhrase += personGuess;
            }
            else if(randomPhrase.substring(i,i+1).equals(" ")){
              currentPhrase += " ";
            }
            else{
              currentPhrase += "_";
            }
          }
          number+=1;
          haveBeenChosen += personGuess;
          hasChosen += personGuess + ", ";
          if (currentPhrase.equals(randomPhrase)){
            System.out.println("The Phrase was "+ currentPhrase);
            System.out.println("you win!");
            break;
          }
        }
        System.out.println(currentPhrase);
        currentPhrase = "";
      }
    }
    return currentPhrase;
  }
}
      


  
  


import java.util.Scanner;
public class UserPlay
{
  public static int chooseDifficulty()
  {
    System.out.println("How many blanks would you like this board to have?");
    Scanner userDifficultyInput = new Scanner(System.in);
    Main.userDifficulty = userDifficultyInput.nextInt();
    return Main.userDifficulty;
  }
  
  public static void pickSquare()
  {
    System.out.println("What square would you like to put a number in? Enter the coordinates with \"row colunm\" with a space in between.");
    Scanner userSquareInput = new Scanner(System.in);
    String squareInput = userSquareInput.nextLine();
    int first = Integer.parseInt(squareInput.substring(0,1));
    int second = Integer.parseInt(squareInput.substring(2, 3));

    if(Main.grid[first - 1][second - 1] == 0)
    {
      System.out.println("What number would you like to put here?");
      Scanner userSquareAnswerInput = new Scanner(System.in);
      int userSquareAnswer = userSquareAnswerInput.nextInt();
      //System.out.println(Main.solution[first - 1][second - 1]); 
        
      if(userSquareAnswer == Main.solution[first - 1][second - 1])
      {
        //System.out.println(Main.solution[first - 1][second - 1]);
        Main.grid[first - 1][second - 1] = userSquareAnswer;
        Main.correct++;
      }
      else
      {
        System.out.println("Incorrect. Try Again.");
        Main.mistakes ++;
        pickSquare();
      }
    }
    else
    {
      System.out.println("This square is occupied. Try again.");
      pickSquare();
    }
  }
}
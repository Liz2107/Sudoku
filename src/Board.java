public class Board
{
  public static void saveSolution()
  {
     for(int i = 0; i < Main.grid.length; i++)
    {
      for(int j = 0; j < Main.grid[0].length; j++)
      {
        Main.solution[i][j] = Main.grid[i][j];
      }
    }
  }
  public static void blankSquares(int numberOfBlankedSquares)
  {
    int randomBlankedSquareRow;
    int randomBlankedSquareCol;
    for(int i = 0; i < numberOfBlankedSquares; i++)
    {
      randomBlankedSquareRow = (int)(Math.random() * 9);
      randomBlankedSquareCol = (int)(Math.random() * 9);
      if(Main.grid[randomBlankedSquareRow][randomBlankedSquareCol] == 0)
      {
        i--;
      }
      else
      {
        Main.grid[randomBlankedSquareRow][randomBlankedSquareCol] = 0;
      }
    }
  }
  public static void shuffleRows()
  {
      int randomRowOne = (int)(Math.random() * 3);
      int randomRowTwo = (int)(Math.random() * 3);
      int randomRowThree = (int)(Math.random() * 3) + 3;
      int randomRowFour = (int)(Math.random() * 3) + 3;
      int randomRowFive = (int)(Math.random() * 3) + 6;
      int randomRowSix = (int)(Math.random() * 3) + 6;

      
      Main.grid[9] = Main.grid[randomRowOne];
      Main.grid[randomRowOne] = Main.grid[randomRowTwo];
      Main.grid[randomRowTwo] = Main.grid[9];

      
      Main.grid[9] = Main.grid[randomRowThree];
      Main.grid[randomRowThree] = Main.grid[randomRowFour];
      Main.grid[randomRowFour] = Main.grid[9];

     
      Main.grid[9] = Main.grid[randomRowFive];
      Main.grid[randomRowFive] = Main.grid[randomRowSix];
      Main.grid[randomRowSix] = Main.grid[9];
      
  }
  public static void shuffleCols()
  {
   
      int randomColOne = (int)(Math.random() * 3);
      int randomColTwo = (int)(Math.random() * 3);
      int randomColThree = (int)(Math.random() * 3) + 3;
      int randomColFour = (int)(Math.random() * 3) + 3;
      int randomColFive = (int)(Math.random() * 3) + 6;
      int randomColSix = (int)(Math.random() * 3) + 6;
      
      if(randomColOne == randomColTwo || randomColThree == randomColFour || randomColFive == randomColSix)
      {
        shuffleCols();
      }
      else
      {        
      for(int j = 0; j < 9; j++)
      {
        Main.grid[j][9] = Main.grid[j][randomColOne];
        Main.grid[j][randomColOne] = Main.grid[j][randomColTwo];
        Main.grid[j][randomColTwo] = Main.grid[j][9];
      }      

      
      for(int k = 0; k < 9; k++)
      {
        Main.grid[k][9] = Main.grid[k][randomColThree];
        Main.grid[k][randomColThree] = Main.grid[k][randomColFour];
        Main.grid[k][randomColFour] = Main.grid[k][9];
      }     

     
      for(int m = 0; m < 9; m++)
      {
        Main.grid[m][9] = Main.grid[m][randomColFive];
        Main.grid[m][randomColFive] = Main.grid[m][randomColSix];
        Main.grid[m][randomColSix] = Main.grid[m][9];
      }     
      }
  }
    
  public static void printGrid()
  {
    System.out.println("     1 2 3   4 5 6   7 8 9 ");
    System.out.println("   -------------------------");
    System.out.println("1  | "+ Main.grid[0][0] +" "+ Main.grid[0][1] +" "+ Main.grid[0][2] +" | "+ Main.grid[0][3] +" "+ Main.grid[0][4] +" "+ Main.grid[0][5]+" | "+ Main.grid[0][6] +" "+ Main.grid[0][7] +" "+ Main.grid[0][8] +" |");
    System.out.println("2  | "+ Main.grid[1][0] +" "+ Main.grid[1][1] +" "+ Main.grid[1][2] +" | "+ Main.grid[1][3] +" "+ Main.grid[1][4] +" "+ Main.grid[1][5]+" | "+ Main.grid[1][6] +" "+ Main.grid[1][7] +" "+ Main.grid[1][8] +" |");
    System.out.println("3  | "+ Main.grid[2][0] +" "+ Main.grid[2][1] +" "+ Main.grid[2][2] +" | "+ Main.grid[2][3] +" "+ Main.grid[2][4] +" "+ Main.grid[2][5]+" | "+ Main.grid[2][6] +" "+ Main.grid[2][7] +" "+ Main.grid[2][8] +" |");
    System.out.println("   -------------------------");
    System.out.println("4  | "+ Main.grid[3][0] +" "+ Main.grid[3][1] +" "+ Main.grid[3][2] +" | "+ Main.grid[3][3] +" "+ Main.grid[3][4] +" "+ Main.grid[3][5]+" | "+ Main.grid[3][6] +" "+ Main.grid[3][7] +" "+ Main.grid[3][8] +" |");
    System.out.println("5  | "+ Main.grid[4][0] +" "+ Main.grid[4][1] +" "+ Main.grid[4][2] +" | "+ Main.grid[4][3] +" "+ Main.grid[4][4] +" "+ Main.grid[4][5]+" | "+ Main.grid[4][6] +" "+ Main.grid[4][7] +" "+ Main.grid[4][8] +" |");
    System.out.println("6  | "+ Main.grid[5][0] +" "+ Main.grid[5][1] +" "+ Main.grid[5][2] +" | "+ Main.grid[5][3] +" "+ Main.grid[5][4] +" "+ Main.grid[5][5]+" | "+ Main.grid[5][6] +" "+ Main.grid[5][7] +" "+ Main.grid[5][8] +" |");
    System.out.println("   -------------------------");
    System.out.println("7  | "+ Main.grid[6][0] +" "+ Main.grid[6][1] +" "+ Main.grid[6][2] +" | "+ Main.grid[6][3] +" "+ Main.grid[6][4] +" "+ Main.grid[6][5]+" | "+ Main.grid[6][6] +" "+ Main.grid[6][7] +" "+ Main.grid[6][8] +" |");
    System.out.println("8  | "+ Main.grid[7][0] +" "+ Main.grid[7][1] +" "+ Main.grid[7][2] +" | "+ Main.grid[7][3] +" "+ Main.grid[7][4] +" "+ Main.grid[7][5]+" | "+ Main.grid[7][6] +" "+ Main.grid[7][7] +" "+ Main.grid[7][8] +" |");
    System.out.println("9  | "+ Main.grid[8][0] +" "+ Main.grid[8][1] +" "+ Main.grid[8][2] +" | "+ Main.grid[8][3] +" "+ Main.grid[8][4] +" "+ Main.grid[8][5]+" | "+ Main.grid[8][6] +" "+ Main.grid[8][7] +" "+ Main.grid[8][8] +" |");
    System.out.println("   -------------------------");
    
  }
  
}
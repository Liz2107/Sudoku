class Main {
  static int[][] grid = {{9, 6, 5, 3, 2, 7, 1, 4, 8, 0}, {8, 2, 7, 1, 5, 4, 3, 9, 6, 0}, {3, 4, 1, 6, 8, 9, 7, 5, 2, 0}, {5, 9, 3, 4, 6, 8, 2, 7, 1, 0}, {4, 7, 2, 5, 1, 3, 6, 8, 9, 0}, {6, 1, 8, 9, 7, 2, 4, 3, 5, 0}, {7, 8, 6, 2, 3, 5, 9, 1, 4, 0}, {1, 5, 4, 7, 9, 6, 8, 2, 3, 0}, {2, 3, 9, 8, 4, 1, 5, 6, 7, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
  static int[][] solution = new int[10][10];
  static int mistakes = 0;
  static int correct = 0;
 // static boolean complete = false;
  static int userDifficulty;
  public static void main(String[] args) {
   //Board.printGrid();
   int randomConstant = 10;
   for(int i = 0; i < randomConstant; i++)
   {
     Board.shuffleRows();
     Board.shuffleCols();
   }
   //Board.printGrid();
   Board.saveSolution();
   Board.blankSquares(UserPlay.chooseDifficulty()); 
   Board.printGrid();  
   while(correct < userDifficulty)
   {
      UserPlay.pickSquare();
      Board.printGrid();        
   }
   if(mistakes == 1)
   {
     System.out.println("You won! You had 1 mistake.");
   }
   else
   {
     System.out.println("You won! You had " + mistakes + " mistakes.");
   }
  }
}
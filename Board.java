//Nick Curinga
//CS141-02
//Project3 - PlayTicTacToe
//7/17/2014

public class Board {

  private Player[][] gameBoard;
  

  public Board()
  {
    
    gameBoard = new Player[3][3];
    setBoard();
  }
  
  public void setBoard() 
  {
    for(int i = 0; i < gameBoard.length;i++) 
    {
      for(int j = 0; j < gameBoard[i].length; j++) 
      {
        gameBoard[i][j] = new Player();
      }
    }
  }
  
    
  
   
  public Player[][] getBoard() 
  {
    return gameBoard;
  } 


 


  public String toString()
  {
    String str = "";
   
    for(int i = 0; i < gameBoard.length; i++) 
    {
      str+="|-------|\n";
      for(int j = 0; j < gameBoard[i].length; j++)
      {
        str+=gameBoard[i][j];
      }
      str+="\n";
    }
    str+="|-------|\n";

    return str;
  }

}
  
  

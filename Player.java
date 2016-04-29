//Nick Curinga
//CS141-02
//Project3 - PlayTicTacToe
//7/17/2014

public class Player {

  private char gameSpace;
  private int check;
   
 
  public Player()
  {
    gameSpace = ' ';
    check = 0;
  }
  
  
  public int check() 
  {
    return check;
  }
  
  public String toString() 
  {
    String str = "|"+gameSpace+"|";
    return str;
  }
}

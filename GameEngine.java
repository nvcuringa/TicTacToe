//Nick Curinga
//CS141-02
//Project3 - PlayTicTacToe
//7/17/2014

import java.util.Scanner;
public class GameEngine {

  private Board bo;
  private Scanner input = new Scanner(System.in);
  private boolean change;
  private boolean gameProgress;
  private boolean exit;
  private int count;
  private Player[][] play;

  
  
  public GameEngine()
  {
    exit = false;
    bo = new Board();    
    count = 0;
    gameProgress = true;
    change = false;
    play = bo.getBoard();
  }

  public void playGame() 
  {
    
   System.out.print(bo);
    int x = 0;
    int row,col = 0;
    
    while(gameProgress) 
    {    
      if(count%2==0)
      {
        x = 1;
      }
      else 
      { 
        x = 2;
      } 
      
        System.out.println("Player "+x+" choose a row and column."); 
        row = input.nextInt();
        col = input.nextInt();
        changeBoard(row,col);
        checkBoard(play);
        count++;
        System.out.println(bo);
        if(exit)
        {
          System.out.println("Player "+x+" wins!");
          gameProgress = false;
          System.exit(0);
       
          
            
        	
        }
     
      }
    
  }

  
    public void changeBoard(int r,int c)
    {
      change = !change;
      if(change)
        play[r][c] = new Player1();
      else
    	play[r][c] = new Player2();
    }

   public void checkBoard(Player[][] p) 
   {
	   
           if((p[0][0].check() & p[0][1].check() & p[0][2].check()) == (1))
             exit = true;
           else if((p[0][0].check() & p[0][1].check() & p[0][2].check()) == (2))
        	   exit = true;
           else if((p[1][0].check() & p[1][1].check() & p[1][2].check())== (1))
        	    exit = true;
           else if((p[1][0].check() & p[1][1].check() & p[1][2].check())== (2))
       	    exit = true;
           
           else if((p[2][0].check() & p[2][1].check() & p[2][2].check()) == (1))
        	    exit = true;
           
           else if((p[2][0].check() & p[2][1].check() & p[2][2].check()) == (2))
        	    exit = true;
            
           else if((p[0][0].check() & p[1][0].check() & p[2][0].check()) == (1))
        	     exit = true;
           
           else if((p[0][0].check() & p[1][0].check() & p[2][0].check()) == (2))
      	     exit = true;
            
           else if((p[0][1].check() & p[1][1].check() & p[2][1].check()) == (1))
                 exit = true;
           
           else if((p[0][1].check() & p[1][1].check() & p[2][1].check()) == (2))
               exit = true;
           
           else if ((p[0][2].check() & p[1][2].check() & p[2][2].check()) == (1))
        	     exit = true;
           
           else if ((p[0][2].check() & p[1][2].check() & p[2][2].check()) == (2))
      	     exit = true;
          
           else if((p[0][0].check() & p[1][1].check() & p[2][2].check()) == (1))
        	     exit = true;
           
           else if((p[0][0].check() & p[1][1].check() & p[2][2].check()) == (2))
      	     exit = true;
            
           else if ((p[0][2].check() & p[1][1].check() & p[2][0].check()) == (1))    
        	    exit = true;
           
           else if ((p[0][2].check() & p[1][1].check() & p[2][0].check()) == (1))    
       	    exit = true;
           
           else if(count == 9)  {
            System.out.println("Draw");
            gameProgress = false;
           }
        }
}
     

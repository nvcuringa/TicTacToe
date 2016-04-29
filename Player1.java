//Nick Curinga
//CS141-02
//Project3 - PlayTicTacToe
//7/17/2014

public class Player1 extends Player {

	
	private char circle;
	private int check;
	
	public Player1() 
	{
			
		circle = 'O';
		check = 1;
	}
	

	public int check()
	{
		return check;
	}
	
	public String toString() 
	{
		return "|"+circle+"|";
	}
}

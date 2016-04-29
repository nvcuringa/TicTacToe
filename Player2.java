//Nick Curinga
//CS141-02
//Project3 - PlayTicTacToe
//7/17/2014

public class Player2 extends Player {

	
	private char cross;
	private int check;
	
	public Player2() 
	{
		cross = 'X';
		check = 2;
	}
	
	public int check()
	{
		return check;
	}
	
	public String toString() 
	{
		return "|"+cross+"|";
	}
}

// biblioteca q chama a funcao random
import java.util.*;
public class jogoDados {
	private Random randomNum = new Random();
	private enum Status {Contiue, WON, LOST};
	// variavel  de valor fixo do tipo inteiro q possui o valor 2
	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;
	private final static int SEVEN = 7;
	private final static int YO_LEVEN = 11;
	private final static int BOX_CARS = 12;
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void play() {
		int myPoint = 0;
		Status gameStatus;
		int sumDice = rollDice();
		
		switch (sumDice) {
			case  SEVEN:
			case  YO_LEVEN:
				gameStatus=Status.WON;
			case  SNAKE_EYES:
			case  BOX_CARS:
				gameStatus = Status.LOST;
			case  TREY:
			default:
				gameStatus = Status.Contiue;
				myPoint = sumDice;
				System.out.printf("Point is %d\n", myPoint);
				break;					
		}
		while (gameStatus==Status.Contiue) {
			sumDice = rollDice();
			
			if (sumDice == myPoint)
				gameStatus = Status.WON;
			else
				if (sumDice==SEVEN)
					gameStatus = Status.LOST;			
		}
		if (gameStatus == Status.WON)
			System.out.println("Player wins!");
		else
			System.out.println("Player loses!");
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	public int rollDice() {
		int die1 = 1 + randomNum.nextInt(6);
		int die2 = 1 + randomNum.nextInt(6);
		int sum = die1+ die2;
		System.out.printf("Player rolled %d = %d\n", die1,die2,sum);
		return sum;
	}
}


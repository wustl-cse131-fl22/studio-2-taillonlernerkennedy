package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount");
		double startAmount = in.nextDouble();
		while (startAmount < 0) {
			System.out.println("Enter start amount");
			startAmount = in.nextInt();
		}
		System.out.println("Enter odds of winning:");
		double winChance = in.nextDouble();
		while(winChance > 1 || winChance < 0) {
			System.out.println("Enter odds of winning: ");
			winChance = in.nextInt();
		}
		System.out.println("Enter win limit:");
		double winLimit = in.nextDouble();
		while (winLimit < 0) {
			System.out.println("Enter win limit");
			startAmount = in.nextInt();
		}
		System.out.println("Number of days");
		int daysLimit = in.nextInt();
		int daysPlayed = 0;
		boolean didYouWin;
		double a = (1-winChance)/(winChance);
		if (winChance == 0.5) {
			double expectedRuin = (1-(startAmount/winLimit));
		}
		else {
			double expectedRuin = (Math.pow(a, startAmount)-(Math.pow(a, winLimit)/(1-(Math.pow(a, winLimit)))));
		
			
			
			
		}
			
			
		while (startAmount > 0 && startAmount < winLimit && daysLimit > daysPlayed)
			{
				didYouWin = (winChance >= Math.random());
				if (didYouWin) {
					startAmount++ ;
					daysPlayed++;
					System.out.println("Simulation "+ daysPlayed +": " + startAmount + " Win!");
				}
				else {
					startAmount--;
					daysPlayed++;
					System.out.println("Simulation "+ daysPlayed +": " + startAmount + " Lose!");
				
				}

		}
			
		
		}
		
		
		
	
	}


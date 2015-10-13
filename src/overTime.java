
import java.util.Scanner;
import java.util.*;

public class overTime {

	public static void main(String[] args)
	{
		int x = 1;
		int y=2;
		int z=3;//declare variables r1,p2,s3
		
		int myNumber;
		Random computerRand = new Random();
		int randomNumber=computerRand.nextInt(3-1)+1;	
		//int randomNumber=3;
		
		Scanner input= new Scanner (System.in);
		//System.out.println("Here we go, choose one");
		System.out.println("Rock(1), Paper(2), Scissors(3)");
		myNumber = input.nextInt();
		
		
		if((x==randomNumber))//computer got rock
		{	
			if((myNumber == randomNumber))//rock vs rock
			{
				System.out.println("Sucker , tie(rock)");
			}
			else if ((myNumber <=y)&& (y ==2))//my papers vs rock
			{
				System.out.println("Win");
			}
			
			else
			{
				System.out.println("lose(rock)");
			}
		}
		if((y==randomNumber)) //computer got paper
		{
			if((myNumber == randomNumber))
			{
				System.out.println("Sucker , tie(paper)");//same
			}
			else if ((myNumber <=x) && (x==1))
					{
				System.out.println("Lose");//my rock vs paper
					}
			else
			{
				System.out.println("Win");
			}
		}
		if((z==randomNumber)) //computer got scissorts
		{
			if((myNumber == randomNumber))
			{
				System.out.println("Sucker , tie(scissors)");//same
			}
			else if ((myNumber <=x) && (x==1))
			{
				System.out.println("Win"); //myrock vs scissorts
			}
			else
			{
				System.out.println("lose");
			}
		}
		
		
		
		
		System.out.printf("The computer choose %d", randomNumber);
		
		
		
	
		
		
		
	}
}

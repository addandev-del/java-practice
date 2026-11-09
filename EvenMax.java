// EvenMax: reads 5 numbers, counts how many are even and prints the largest, using methods.

import java.util.Scanner;
public class EvenMax
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int num;
		int even = 0;
		int max = -999;
		
		for (int i = 1; i<=5; i++)
		{
			System.out.println("Enter a number: ");
			num = input.nextInt();
			if(num%2==0)
			{
				even++;
			}
			
			if(num>max)
			{
				max = num;
			}
		}
		System.out.println("Number of even numbers:"+even);
		System.out.println("Max even number:"+max);
	}
}

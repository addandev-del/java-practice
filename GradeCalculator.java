/*Inside main:
use for loop, limit 5
take input inside loop
call valid method- boolean return  type
if false continue
call grade method char return type
count++
sum += score
sum/count = average
*/

import java.util.Scanner;
public class GradeCalculator
{
	public static void main(String[] args)
	{
		int score;
		int count = 0;
		double average;
		boolean isValid;
		char grade;
		int validMarks=0;
		
		Scanner input = new Scanner(System.in);
		for (int i=1 ; i<=5 ; i++){
			System.out.println("Enter your score: ");
			score = input.nextInt();
			isValid = isValid(score);
			if(isValid==true){
				grade = findGrade(score);
				System.out.println("Your grade for this subject is: "+grade);
				count++;
				validMarks+=score;
			}
			else
			{
				System.out.println("Score must be between 0-100.");
				continue;
			}
			
		}
		average = (double)validMarks/count;
		System.out.printf("Your average score is: %.2f", average);
	}
	public static boolean isValid(int score)
	{
		if((score >= 0) && (score<=100))
			return true;
		else
			return false;
	}
	public static char findGrade(int score)
	{
		char grade;
		if(score>=80)
			grade = 'A';
		else if(score>=70)
			grade = 'B';
		else if(score>=60)
			grade = 'C';
		else if(score>=50)
			grade = 'D';
		else
			grade = 'F';
		
		return grade;
	}
}

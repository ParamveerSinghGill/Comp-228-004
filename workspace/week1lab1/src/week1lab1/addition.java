package week1lab1;

import java.util.Scanner;


public class addition
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num1 , num2 , sum;
		System.out.print("Enter the first Integer");
		num1= input.nextInt();
		System.out.print("Enter the Second Integer");
		num2= input.nextInt();
		sum=num1+num2;
		System.out.printf("sum is %d%n",sum);
		num1= input.nextInt();


	}
}

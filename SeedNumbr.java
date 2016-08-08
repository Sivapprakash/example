package pro_LEVEL;

import java.util.Scanner;

public class SeedNumbr {
	public static void main(String[] args)
	{
		System.out.println("Enter the Initial number:");
	    int num,cp;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		cp=num;
		System.out.println("The number is: " + num);
		String temp = Integer.toString(num);
		int a[]=new int[temp.length()];
		for(int i=0;i<temp.length();i++)
		{
		 a[i]=num%10;
		 num=num/10;
		 System.out.println(+a[i]);
		}
		
		int result=1;
		for(int i=0;i<temp.length();i++)
		{
			
			result=result*a[i];
		}
		int output;
		output=cp*result;
		System.out.println("The seed number is:"+output);
	}

}

package artwork;

import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("Please enter the first string :");
		String firstString=scnr.next();
		System.out.println("Please enter the Second string :");
		String secondString=scnr.next();
		int firstStringSum=0;
		int secondStringSum=0;
		int difference=0;
		for(int i=0;i<firstString.length();i++)
		{
			char c=firstString.charAt(i);
			
			System.out.println(c+" : "+(int)c);
			firstStringSum+=c;
		}
		
		for(int j=0;j<secondString.length();j++)
		{
			char d=secondString.charAt(j);
			System.out.println(d+ " : "+(int)d);
			secondStringSum+=d;
		}
		difference=firstStringSum-secondStringSum;
				
		System.out.println("Difference(as absolute value): " +Math.abs(difference));
		scnr.close();
	}

}

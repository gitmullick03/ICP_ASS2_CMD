/*
Program: Write a java program that takes two int values from the command line as dividend and divisor and print the quotient and remainder.
Author name: SWASTIK MULLICK
Registration no.: 2241013379
*/
public class Assign2q1
{
	public static void main(String args[])
	{
		int i1=Integer.parseInt(args[0]), i2=Integer.parseInt(args[1]), quo=i1/i2, rem=i1%i2;
		System.out.print("Quotient: "+quo+"\nRemainder: "+rem+"\n");
	}
}


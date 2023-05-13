/*
Program: Write a java program that takes two positive integers from command-line arguments and prints the result of first number raise to the power of second number.
Author name: SWASTIK MULLICK
Registration no.: 2241013379
*/
public class Assign2q2
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]), c=(int)Math.pow(a,b);
		System.out.print("First number raise to the power second number: "+c+"\n");
	}
}

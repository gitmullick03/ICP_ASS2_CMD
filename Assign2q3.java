/*
Program: Write a java program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice)
Author name: SWASTIK MULLICK
Registration no.: 2241013379
*/
public class Assign2q3
{
	public static void main(String args[])
	{
		int lb=Integer.parseInt(args[0]), ub=Integer.parseInt(args[1]);
		int int1=((int)(((ub+1)-lb)*Math.random()))+lb, int2=((int)(((ub+1)-lb)*Math.random()))+lb, sum=int1+int2;
		System.out.print("First integer: "+int1+"\nSecond integer: "+int2+"\nSum: "+sum+"\n");
	}
}

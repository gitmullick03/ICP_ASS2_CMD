/*
 Program: Write a java program that takes three int values from the command line and prints them in ascending order. Use Math.min() and Math.max().
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
*/
public class Assign2q5
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]),c=Integer.parseInt(args[2]);
		int min=Math.min(Math.min(a,b),c);
		int max=Math.max(Math.max(a,b),c);
		int mid=(a+b+c)-min-max;
		System.out.println("Minimum value: "+min+"\nMiddle value: "+mid+"\nMaximum value: "+max);
	}
}

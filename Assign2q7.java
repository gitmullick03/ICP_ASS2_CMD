/*
 Program: Write a java program that takes three positive integers from command-line arguments and prints true if any one of them is less than or equal to the product of the other two and false otherwise.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
*/
public class Assign2q7
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]),y=Integer.parseInt(args[1]),z=Integer.parseInt(args[2]);
		System.out.println((x<=(y*z))||(y<=(x*z))||(z<=(x*y)));
	}
}
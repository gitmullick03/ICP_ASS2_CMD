/*
 Program: Write a java program that takes a double value t from the command line and prints the value of cos (5t) + sin (7t). Use Math.cos() and Math.sin()
 Author name: SWASTIK MULLICK
 Registration no.:2241013379
*/
public class Assign2q4
{
	public static void main(String args[])
	{
		double t=Double.parseDouble(args[0]);
		System.out.print("Value of t: "+t+"\ncos (5t) + sin (7t): "+(Math.cos(5*t)+Math.sin(7*t))+"\n\n");
	}
}

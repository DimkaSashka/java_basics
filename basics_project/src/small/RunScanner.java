package small;

import java.util.Scanner;
public class RunScanner
	{
	public static void main(String[] args)
		{
		System.out.println("Input your name and press Enter:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hi, "+name);
		scan.close();
		}
	}
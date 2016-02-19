package org.test;

import java.util.Scanner;

public class TestMain
{
	public static final void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		String input = null;
		System.out.println("Hello World");
	
	input = scanner.nextLine();	
		System.out.println("You typed " + input);

scanner.close();
	}
}

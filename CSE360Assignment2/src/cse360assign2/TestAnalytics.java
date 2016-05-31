package cse360assign2;

import java.util.Scanner;

public class TestAnalytics {
	
	public static void main(String [] args)
	{
		System.out.println("Enter a list of integers. When done, press a character.");
		Scanner scan = new Scanner(System.in);
        Analytics list = new Analytics();
        int num;
        while(scan.hasNextInt())
        {
            num = scan.nextInt();
            list.insert(num);
        }
        System.out.println("Mean: " + list.mean());
        System.out.println("Median: " + list.median());
        System.out.println("High: " + list.high());
        System.out.println("Low: " + list.low());
        System.out.println("Number of Ints: " + list.numInts());
	}

}

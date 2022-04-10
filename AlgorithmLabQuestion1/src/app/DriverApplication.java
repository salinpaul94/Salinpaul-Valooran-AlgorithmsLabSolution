package app;

import java.util.Scanner;

public class DriverApplication {
	public static void main(String[] args) {
		int size, i, transactions[], target, sum=0;
		boolean flag = false;
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter no of transactions: ");
			size = in.nextInt();
			
			transactions = new int[size];
			for(i=0; i<size; i++) {
				System.out.println("Please enter the value of transcation "+ (i+1) + ": ");
				transactions[i]=in.nextInt();
			}
			
			System.out.println("Enter target value: ");
			target=in.nextInt();
		
		for(i=0; i<size; i++) {
			sum += transactions[i];
			if(sum >= target) {
				flag = true;
				break;
				}
			}
		if(flag)
			System.out.println("Target was achieved after "+(i+1)+" tracscations");
		else
			System.out.println("Target was not achieved");
		}
	}
}

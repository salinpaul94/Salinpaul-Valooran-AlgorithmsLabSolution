package app;

import java.util.Scanner;

import service.MergeSort;

public class DriverApplication {
	public static void main(String[] args) {
		String CurrencyName;
		int noOfDenomination, denomination[], paymentAmount, balance[];
		boolean flag=false;
		
		try(Scanner in=new Scanner(System.in)){
			System.out.println("Please enter the name of currenency: ");
			CurrencyName = in.next().toUpperCase();
			
			System.out.println("Please enter the no of denominations in " + CurrencyName + ": ");
			noOfDenomination = in.nextInt();
			denomination = new int[noOfDenomination];
			
			for(int i = 0; i<noOfDenomination; i++) {
				System.out.println("Please enter the value of denomination "+ (i+1) + ": ");
				denomination[i] = in.nextInt();
			}
			
			
			MergeSort ob=new MergeSort();
			ob.mergeSort(denomination, 0, denomination.length-1);
			
			for(int i : denomination) System.out.print(i + " ");
			System.out.println();
			
			while(true ) {
				System.out.println("\nPlease enter the amount to be payed or enter 0 to exit: ");
				paymentAmount = in.nextInt();
				
				if (paymentAmount==0)
					break;
				else {
					balance = new int[noOfDenomination];
					for(int i = 0; i<noOfDenomination; i++) {
						if(paymentAmount >= denomination[i]) {
							balance[i] = paymentAmount/denomination[i];
							paymentAmount = paymentAmount -(denomination[i] * balance[i]);
						}
						if(paymentAmount==0) {
							flag = true;
							break;
						}
					}
					
					if(flag) {
						System.out.println("The amount can be payed using following denomination");
						for(int i = 0; i<noOfDenomination; i++)
							if(balance[i] != 0) {
								System.out.println("Denomonation  " + denomination[i] + " can be used " + balance[i] + " times");
							}
					}
					else
						System.out.println("Amount cannot be payed\n");
				}
			}
		}
	}
}


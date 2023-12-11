package treinamento;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how much numbers do you want to Insert: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		int x = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the " + (i + 1) + " º number: ");
			array[i]= sc.nextInt();
			x += array[i];
		}
		System.out.println("The average between the numbers is: " + x/n);
		sc.close();
	}

}

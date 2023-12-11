package aula238;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintService {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> addValue = new ArrayList<Integer>();
		
		System.out.println("How many values? ");
		int hMany = sc.nextInt();
		
		for(int i = 1; i <= hMany; i++) {
			int x = sc.nextInt();
			addValue.add(x);
		}
		System.out.println(addValue);
		System.out.println("First: " + addValue.get(0));
		
		
		sc.close();

	}

}

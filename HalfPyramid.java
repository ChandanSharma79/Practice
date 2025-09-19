package com.pattern;
import java.util.*;

public class HalfPyramid {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number of rows:");
			int n = sc.nextInt();
			System.out.println("Enter the Number of Columns:");
			int m = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			sc.close();
			
		
}
}

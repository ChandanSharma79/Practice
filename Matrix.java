package com.pattern;

public class Matrix {
	public static void main(String[] args) {
		int[][] arr= {{2,3,5},{6,7,8}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

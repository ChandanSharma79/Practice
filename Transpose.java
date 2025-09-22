package com.pattern;

public class Transpose {
	static int M =3;
	static int N =3;
	static void tranposeMatrix(int A[][],int B[][]) {
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				B[j][i]=A[i][j];
			}
		}
	}
	public static void main(String[] args) {
		int A[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int B[][]= new int[M][N];
		tranposeMatrix(A,B);
		System.out.println("Resulted Matrix:");
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
			
		}
	}
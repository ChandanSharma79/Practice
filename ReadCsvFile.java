package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCsvFile {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		File file1 = new File(System.getProperty("user.dir")+File.separator+"write.csv");
		Scanner sc = new Scanner(file1);
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.print(sc.next()+"\t");
			
		}
		System.out.println("----------");
		System.out.println("Second Method to Read File");
		String file = System.getProperty("user.dir")+File.separator+"write.csv";
		FileReader reader = new FileReader(file);
		BufferedReader bfreader = new BufferedReader(reader);
		String line;
		while((line=bfreader.readLine())!=null) {
			String[] data = line.split(",");
			for(String values:data) {
				System.out.print(values+"\t");
			}
			System.out.println();
		}
	}

}

package com.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriter {
	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+File.separator+"write.csv";
		FileWriter writer = new FileWriter(filePath);
		writer.append("Name,Age,Email \n");
		writer.append("Rahul,23,Rahul@gmail.com \n");
		writer.append("Ankit,24,Ankit@gmail.com \n");
		writer.close();
		System.out.println("csv file created"+filePath);
		
	}

}

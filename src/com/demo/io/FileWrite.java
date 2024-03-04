package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	void writeContent(String fileName) {
		String content = "Hi this is first example of file write operation !";

		try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {
			byte[] b = content.getBytes();
			fos.write(b);
			System.out.println("File write done !!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void readContent(String fileName) {
		try(FileInputStream fis = new FileInputStream(new File(fileName))) {
			
			for(int c =0;(c=fis.read())!=-1 ;) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void fileWrite(String fileName, String content) {
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(content);
			fw.close();
			System.out.println("File write success !!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void fileRead(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			int c =0;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			fr.close();
			System.out.println("File write success !!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void scannerDemo(String filePath) throws FileNotFoundException {
	/*	Scanner sc = new Scanner(new File(filePath));
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Name : "+name);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// M:\abc.txt
		String fileName = "abc2.txt";
		String content = "Hi this is first example of file write operation !";
		FileWrite fw = new FileWrite();
		//fw.fileWrite(fileName, content);
		fw.scannerDemo(fileName);
	}

}

package com.demo.java8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class JDK11Demo {

	static void read() {
		try {
			String content = Files.readString(Path.of("student.txt"),StandardCharsets.UTF_16);
			System.out.println("File Content : "+content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void write() {
		String c = "Hi hello ! how are you ?";
		try {
			Files.writeString(Path.of("student.txt"), c,StandardCharsets.UTF_16, StandardOpenOption.CREATE);
			System.out.println("File write success !!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void compareFiles() {
		try {
			long l = Files.mismatch(Path.of("student.txt"), Path.of("employee.txt"));
			System.out.println("Mismatch : "+l);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		compareFiles();
	}
}

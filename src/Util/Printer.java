package Util;

import java.util.List;
import java.util.Set;

public class Printer {
	public static <T> void print(T text) {
		System.out.print(text);
	}
	
	public static <T> void print(T value,boolean nextLine) {
		if(nextLine) {
			System.out.println(value);
		}else {
			System.out.print(value);
		}
	}
	
	public static void printArray(byte[] arr) {
		for(byte i:arr) {
			print(i,true);
		}
	}
	
	public static void printSet(byte[] arr) {
		for(byte i:arr) {
			print(i,true);
		}
	}
}

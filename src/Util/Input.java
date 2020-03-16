package Util;

import java.util.Scanner;

public class Input {
	static Scanner scanner;
	public static Scanner getInstance() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}

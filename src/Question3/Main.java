package Question3;

import java.util.Scanner;

import Util.Input;
import Util.Matris;
import Util.Printer;

public class Main {

	public static void main(String[] args) {
		
		byte[][] firstMatris = Matris.matrisInputOperation("1",10);
		byte[][] secondMatris = Matris.matrisInputOperation("2",10);
		
		Printer.print("Matris Carpimi Sonucu", true);
		
		Matris.printMatris(Matris.multiplyMatrisOperation(firstMatris, secondMatris));		
	}
	

}

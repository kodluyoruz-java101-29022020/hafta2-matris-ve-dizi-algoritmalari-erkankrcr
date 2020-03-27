package Question1;

import Util.Matris;
import Util.Printer;

public class Main {

	public static void main(String[] args) {
		byte[][] matris = Matris.matrisInputOperation("ilk", 2);
		
		Printer.print("Matrisin son hali", true);
		Matris.printMatris(Matris.cellControlOperation(matris));
		

	}

}

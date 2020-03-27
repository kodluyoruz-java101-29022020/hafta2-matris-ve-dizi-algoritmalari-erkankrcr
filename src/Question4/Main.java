package Question4;

import java.util.List;
import java.util.Set;
import Util.Array;
import Util.Input;
import Util.Printer;

public class Main {

	public static void main(String[] args) {
		
		Printer.print("Dizi Uzunluðunu Belirtiniz : ");
		
		byte[] arr = Array.fillArray(Input.getInstance().nextInt(),20);
		
		Printer.print("Üretilen Dizi",true);
		
		Printer.printArray(arr);
		
		//Set<Integer> duplicateElements = Array.findDuplicateElements(arr);
		byte[] duplicateElements = Array.findDuplicateElements(arr);
		
		Printer.print("Tekrarlayan Elemanlarýn Dizisi",true);
		
		Printer.printSet(duplicateElements);
	}

}

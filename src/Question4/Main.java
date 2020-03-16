package Question4;

import java.util.List;
import java.util.Set;
import Util.Array;
import Util.Input;
import Util.Printer;

public class Main {

	public static void main(String[] args) {
		
		Printer.print("Dizi Uzunlu�unu Belirtiniz : ");
		
		byte[] arr = Array.fillArray(Input.getInstance().nextInt());
		
		Printer.print("�retilen Dizi",true);
		
		Printer.printArray(arr);
		
		// Brute Force yontem disinda en kolay ve etkili yol
		Set<Integer> duplicateElements = Array.findDuplicateElements(arr);
		
		Printer.print("Tekrarlayan Elemanlar�n Dizisi",true);
		
		Printer.printSet(duplicateElements);
	}

}

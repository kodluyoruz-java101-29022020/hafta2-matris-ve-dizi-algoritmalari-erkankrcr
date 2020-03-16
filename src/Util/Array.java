package Util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array {
	public static byte[] fillArray(int length) {
		byte[] arr = new byte[length];
		for(int i = 0; i<length;i++) {
			arr[i] = (byte)(Math.random() * 20);
		}
		return arr;
	}
	
	/*
	 * Bu metod da Set veri yapisinin ozelligi olan mükerrer deger bulundurmama özelligini kullandim
	 * Set gibi Collection yapilari kullanilmadan da yapilabilir bununla ilgili google amcayla arama yaptým
	 * Brute Force yapisini yapmak yerine daha mantikli ve etkili bir yol
	 */
	public static Set findDuplicateElements(byte[] arr) {
		Set<Byte> duplicateArr = new HashSet();
		Set<Byte> tempArr = new HashSet<>();
		for(byte value : arr) {
			if(tempArr.add(value) == false) {
				duplicateArr.add(value);
			}
		}
		return duplicateArr;
	}

}

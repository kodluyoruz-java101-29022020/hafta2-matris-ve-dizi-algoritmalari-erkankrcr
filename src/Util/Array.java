package Util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array {
	public static byte[] fillArray(int length,int round) {
		byte[] arr = new byte[length];
		for(int i = 0; i<length;i++) {
			arr[i] = (byte)(Math.random() * round);
		}
		return arr;
	}
	

	/*
	 * bu yöntem hem performans hemde bellek kullanýmý olarak kötü bir kullaným
	 */
	public static byte[] findDuplicateElements(byte[] arr) {
		byte[] tempArr = arr;
		byte[] resultArr = new byte[arr.length+1];
		int index = 0;
		for(byte item : arr) {
			for(byte tempItem : tempArr) {
				if(item == tempItem) {
					if(!findResultElements(resultArr,item)) {
						resultArr[index] = item;
						index++;
					}
				}
			}
		}
		return createNewArray(resultArr,index);
	}
	
	/*
	 * sizden aldigim feedback ile bu kullanimi programdan kaldirdim.
	 * 
	 * Bu metod da Set veri yapisinin ozelligi olan mükerrer deger bulundurmama özelligini kullandim
	 * Set gibi Collection yapilari kullanilmadan da yapilabilir bununla ilgili google amcayla arama yaptým
	 * Brute Force yapisini yapmak yerine daha mantikli ve etkili bir yol
	 *
	 * public static Set findDuplicateElements(byte[] arr) {
		Set<Byte> duplicateArr = new HashSet();
		Set<Byte> tempArr = new HashSet<>();
		for(byte value : arr) {
			if(tempArr.add(value) == false) {
				duplicateArr.add(value);
			}
		}
		return duplicateArr;
	}
	 */
	//Dizide daha once varmiydi diye kontrol ediyoruz
	private static boolean findResultElements(byte[] arr,byte value) {
		for(byte item:arr) if(value == item) return true;
		return false;
	}
	
	//Dizinin icindeki gereksiz bos elemanlari silmek icin
	private static byte[] createNewArray(byte[] arr,int index) {
		byte[] newArr = new byte[index+1];
		for(int i = 0;i<=index;i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

}

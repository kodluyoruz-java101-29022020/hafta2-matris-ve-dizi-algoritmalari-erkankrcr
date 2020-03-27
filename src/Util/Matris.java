package Util;

import java.util.Scanner;

import Question1.Cell;

public class Matris {
	
	private static byte[][] fillMatris(byte[][] matris,int multiplier){
		for(int i = 0;i<matris.length;i++) {
			for(int j = 0;j<matris[0].length;j++) {
				byte randomValue = ((byte) (Math.random() * multiplier));
				matris[i][j] = randomValue;
			}
		}
		return matris;
	}
	
	private static byte[][] createMatris(int... index){
		return new byte[index[0]][index[1]];
	}
	
	public static void printMatris(byte[][] matris) {
		for(int i = 0;i<matris.length;i++) {
			Printer.print("[");
			for(int y = 0;y<matris[0].length;y++) {
				Printer.print(" "+matris[i][y]+" ");
			}
			Printer.print("]", true);
		}
	}
	
	public static void printMatris(int[][] matris) {
		for(int i = 0;i<matris.length;i++) {
			Printer.print("[");
			for(int y = 0;y<matris[0].length;y++) {
				Printer.print(" "+matris[i][y]+" ");
			}
			Printer.print("]", true);
		}
	}
	
	public static byte[][] matrisInputOperation(String value,int multiplier){
		Printer.print(value+".Matrisin boyutu için", true);
		int[] index = takeToIndex();
		byte[][] matris =
				fillMatris(
				createMatris(index[0],index[1])
				,multiplier);
		Printer.print(value+".Matris", true);
		printMatris(matris);
		return matris;
	}
	
	private static int[] takeToIndex() {
		Scanner scanner = Input.getInstance();
		Printer.print("Matrisin x boyutunu giriniz :");
		int x = scanner.nextInt();
		Printer.print("Matrisin y boyutunu giriniz :");
		int y = scanner.nextInt();
		return new int[] {x,y};
	}
	
	public static int[][] multiplyMatrisOperation(byte[][] firstMatris,byte[][] secondMatris){
		int[][] newMatris = new int[firstMatris.length][secondMatris[0].length];
		for(int i = 0; i<newMatris.length; i++) {
			for(int j = 0; j<newMatris[0].length; j++) {
				int value = 0;
				for(int y = 0; y<secondMatris.length; y++ ) {
					value =+ firstMatris[i][y] * secondMatris[y][j];
				}
				newMatris[i][j] = value;
			}
		}
		return newMatris;
	}
	
	public static byte[][] cellControlOperation(byte[][] matris){
		for(int i = 0; i<matris.length; i++) {
			for(int j = 0; j<matris[0].length;j++) {
				matris = cellRule(matris,i,j);
			}
		}
		return matris;
	}
	
	private static byte[][] cellRule(byte[][] matris, int i, int j) {
		Cell cell = findNeighbor(matris,i,j);
		
		if(ruleOne(cell) && matris[i][j] == 1) matris[i][j] = 0;
		if(ruleTwo(cell) && matris[i][j] == 1) matris[i][j] = 1;
		if(ruleThree(cell) && matris[i][j] == 1) matris[i][j] = 0;
		if(ruleFour(cell) && matris[i][j] == 0) matris[i][j] = 1;		
		
		return matris;
		
	}
	private static Cell findNeighbor(byte[][] matris, int i, int j) {
		Cell cell = new Cell();
		
		//Top Cell Find
		if(i!=0) 
			cell.setTop(matris[i-1][j]);
		else
			cell.setTop((byte) 0);
		
		//Bottom Cell Find
		if(i!=matris.length-1) 
			 cell.setBottom(matris[i+1][j]);
		else
			cell.setBottom((byte) 0);
		
		//Left Cell Find
		if(j!=0) 
			cell.setLeft(matris[i][j-1]);
		else
			cell.setLeft((byte) 0);
		
		//Right Cell Find
		if(j!=matris[0].length-1) 
			cell.setRight(matris[i][j+1]);
		else
			cell.setRight((byte) 0);
		
		return cell;
	}
	
	private static boolean ruleOne(Cell cell) {
		return (findNeighborStatus(cell)[0]<2) ? true : false;
	}
	
	
	private static boolean ruleTwo(Cell cell) {
		byte[] corner = findNeighborStatus(cell);
		return (corner[0] == 2 || corner[0] == 3) ? true : false;
	}
	
	private static boolean ruleThree(Cell cell) {
		return (findNeighborStatus(cell)[0]>3) ? true : false;
	}
	
	private static boolean ruleFour(Cell cell) {
		return (findNeighborStatus(cell)[0] == 3) ? true : false;
	}
	
	private static byte[] findNeighborStatus(Cell cell) {
		byte live = 0;
		byte dead = 0;
		
		if(cell.getTop() == 1) live++; else dead++;
		
		if(cell.getBottom() == 1) live++; else dead++;
		
		if(cell.getLeft() == 1) live++; else dead++;
		
		if(cell.getRight() == 1) live++; else dead++;
		
		return new byte[] {live,dead};
	}
}

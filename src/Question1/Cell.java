package Question1;

public class Cell {
	private byte top,bottom,left,right;
	
	public Cell() {
		
	}
	
	public Cell(byte Top, byte Bottom, byte Left, byte Right) {
		this.top = Top;
		this.bottom = Bottom;
		this.left = Left;
		this.right = Right;
	}
	
	public byte getTop() {
		return this.top;
	}
	
	public void setTop(byte value) {
		this.top = value;
	}
	
	public byte getBottom() {
		return this.bottom;
	}
	
	public void setBottom(byte value) {
		this.bottom = value;
	}
	
	public byte getLeft() {
		return this.left;
	}
	
	public void setLeft(byte value) {
		this.left = value;
	}
	
	public byte getRight() {
		return this.right;
	}
	
	public void setRight(byte value) {
		this.right = value;
	}
}

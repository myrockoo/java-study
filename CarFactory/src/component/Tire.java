package component;

public class Tire {
	private int size;
	
	public Tire() {
		int t = 9;
		System.out.println("Tire Constructor");
		size = 0;
		}
	
	public int getSize() {
		return (size);
				}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void gotSize(int n) {
		this.size = n;
		System.out.println("size : " + size);
	}
}

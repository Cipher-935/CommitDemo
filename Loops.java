package Assignmnet;

public class Loops {

	public static void main(String[] args) {
		int size = 20;
		int width = 0;
		int center = size/2;
		for(int i = 0; i<size/2; i++) {
			width++;
			for(int j = 0;j<size;j++) {
				
				if(j>center-width && j<center+width) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}
}
